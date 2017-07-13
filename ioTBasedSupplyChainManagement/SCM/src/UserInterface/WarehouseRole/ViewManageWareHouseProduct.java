/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WarehouseRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Organisation.WarehouseOrganisation;
import Business.Product.Product;
import Business.Product.ProductCatalog;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WarehouseRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class ViewManageWareHouseProduct extends javax.swing.JPanel {

    JPanel userProcessContainer;
    WarehouseOrganisation organisation;
    Enterprise enterprise;
    UserAccount account;
    EcoSystem system;
    ArrayList<Product> analyticsProductlict;
    Network network;

    /**
     * Creates new form ViewManageWareHouseProduct
     */
    public ViewManageWareHouseProduct(JPanel userProcessContainer,UserAccount account,EcoSystem system,Organisation organisation,Enterprise enterprise,ArrayList<Product> analyticsProductlict,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organisation = (WarehouseOrganisation) organisation;
        this.enterprise = enterprise;
        this.account = account;
        this.analyticsProductlict = analyticsProductlict;
        this.system = system;
        this.network = network;
        populateProductTable();
        productBewloThreshold();
    
        
    }

    public void populateProductTable() {

        for (WorkRequest request : organisation.getWorkQueue().getWorkRequestList()) {
                
            System.out.println(((WarehouseRequest)request).getReceiver());
             if(request.getWarehouseUpdate()==null){
             System.out.println("Null");
             
             }else if (request.getWarehouseUpdate().equals("True")) {
                  

                if (organisation.getProductCatalog() == null) {
                    organisation.setProductCatalog(new ProductCatalog());
                }
                Product nproduct = new Product();
                 nproduct.setpName(request.getProduct().getpName()); 
                 nproduct.setpQquantity(request.getProductQuantity());
                 
                 
                boolean flag = false;
                for (Product product : organisation.getProductCatalog().getProductList()) {
                    if (product.getpName().equals(nproduct.getpName())) {
                        flag = true;
                        product.setpQquantity(product.getpQquantity() + request.getProductQuantity());
                        
                        request.setWarehouseUpdate("False");
                        break;
                    } else {
                        flag = false;
                    }

                }
                if (!flag) {
                    //nproduct.setpQquantity(request.getProductQuantity());
                    
                    organisation.getProductCatalog().addProduct(nproduct);
                   // p.setpQquantity(request.getProductQuantity());
                    request.setWarehouseUpdate("False");
                }

            }
            
            DefaultTableModel dtm = (DefaultTableModel) warehouseProductCatalog.getModel();
            int rowCount = warehouseProductCatalog.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                dtm.removeRow(i);
            }

            for (Product product : organisation.getProductCatalog().getProductList()) {
                
             //   if(request.getReceiver().toString().equals(account.toString())){
                    Object row[] = new Object[2];//Used to do operations on the Table.The rows and columns are created using this. The new Object[2] represents the column
                    row[0] = product;
                    row[1] = product.getpQquantity();
                    dtm.addRow(row);
              //  }
            }
            
            if(dtm.getRowCount()==0)
            {
               jButton2.setEnabled(false);
            }else{
               jButton2.setEnabled(true);
            }

        }

       
        
        //************Old code**///////////////// 
//        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
//            System.out.println(request.getProductQuantity());
//            
//            if (request.getWarehouseUpdate().equals("True")) {
//
//                if (organisation.getProductCatalog() == null) {
//                    organisation.setProductCatalog(new ProductCatalog());
//                }
//
//                Product nproduct = request.getProduct();
//                boolean flag = false;
//                for (Product product : ((WarehouseOrganisation)organisation).getProductCatalog().getProductList()) {
//                    if (product.getpName().equals(nproduct.getpName())) {
//                        flag = true;
//                        product.setpQquantity(product.getpQquantity() + request.getProductQuantity());
//                        request.setWarehouseUpdate("False");
//                        break;
//                    }
//                }
//
//                if (!flag) {
//                    //nproduct.setpQquantity(request.getProductQuantity());
//                   Product p = organisation.getProductCatalog().addProduct(nproduct);
//                   p.setpQquantity(request.getProductQuantity());
//                    request.setWarehouseUpdate("False");
//                }
//
//            }
//        }
//
//        DefaultTableModel dtm = (DefaultTableModel) warehouseProductCatalog.getModel();
//        int rowCount = warehouseProductCatalog.getRowCount();
//        for (int i = rowCount - 1; i >= 0; i--) {
//            dtm.removeRow(i);
//        }
//
//        for (Product product : organisation.getProductCatalog().getProductList()) {
//            Object row[] = new Object[2];//Used to do operations on the Table.The rows and columns are created using this. The new Object[2] represents the column
//            row[0] = product;
//            row[1] = product.getpQquantity();
//            dtm.addRow(row);
//        }
    }

     public void productBewloThreshold()
        {
              DefaultTableModel dtm = (DefaultTableModel) needstoBeOrdered.getModel();
            int rowCount = needstoBeOrdered.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                dtm.removeRow(i);
            }

            for (Product product : organisation.getProductCatalog().getProductList()) {
                if(product.getpQquantity()<=3){
                    Object row[] = new Object[2];//Used to do operations on the Table.The rows and columns are created using this. The new Object[2] represents the column
                    row[0] = product;
                    row[1] = product.getpQquantity();
                    dtm.addRow(row);
                }
            }
            
            if(warehouseProductCatalog.getRowCount()==0)
            {
                needstoBeOrdered.setBackground(Color.WHITE);
            }else{
                needstoBeOrdered.setBackground(Color.RED);
            }
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        warehouseProductCatalog = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        needstoBeOrdered = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();

        warehouseProductCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Product", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(warehouseProductCatalog);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        needstoBeOrdered.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Product", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        needstoBeOrdered.setToolTipText("list of products that needs to be ordered");
        jScrollPane2.setViewportView(needstoBeOrdered);

        jButton2.setText("Order from Supplier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Below is the list of list products along with their quantity");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Product List");

        jLabel3.setText("List of products which are low in quantity. Following needs to be ordered from the supplier.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Products low in quantity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Warehouse Master Catalog");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(226, 226, 226)
                            .addComponent(jButton2))))
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
//        
//         userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        WarehouseWorkAreaJPanel dwjp = (WarehouseWorkAreaJPanel) component;
//        //dwjp.populateRequestTable();
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        OrderFromSupplier orderImpProducts = new OrderFromSupplier(userProcessContainer,account, system,organisation,enterprise,analyticsProductlict,network);
        userProcessContainer.add("Order1 from different Supplier",orderImpProducts);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable needstoBeOrdered;
    private javax.swing.JTable warehouseProductCatalog;
    // End of variables declaration//GEN-END:variables
}
