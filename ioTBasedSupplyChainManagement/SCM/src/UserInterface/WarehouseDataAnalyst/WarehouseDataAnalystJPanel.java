/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.WarehouseDataAnalyst;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class WarehouseDataAnalystJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    EcoSystem system;
    Organisation organisation;
    Enterprise enterprise;
    ArrayList<Product> analyticsProductlict;
    UserAccount seletedUser = new UserAccount();

    /**
     * Creates new form WarehouseDataAnalystJPanel
     */
    public WarehouseDataAnalystJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Organisation organisation, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organisation = organisation;
        this.account = account;
        this.enterprise = enterprise;
bestEmployeer();
        warehouseUser.removeAllItems();
        for (UserAccount userAccount : organisation.getUserAccountDirectory().getUserAccountList()) {
            if (!userAccount.toString().equals(account.toString())) {
                warehouseUser.addItem(userAccount);
            }
        }
    }

    public void populateProductTable() {

        DefaultTableModel model = (DefaultTableModel) prouductList.getModel();
        model.setRowCount(0);

        for (Product product : enterprise.getProductMasterList().getProductList()) {
            Object[] row = new Object[1];
            row[0] = product;
            model.addRow(row);

        }
    }

    public void addProductAnalytics() {
        analyticsProductlict = new ArrayList<>();

        for (WorkRequest request : seletedUser.getWorkQueue().getWorkRequestList()) {   //System.out.println();
            if (request.getRequestOrderDate() == null) {
                System.out.println("Null" + request.getProduct());
            } else if (request.getRequestOrderDate().equals("2011")) {
                boolean flag = false;
                //for loop for checking whther the same product exists for 2011
                for (Product product : analyticsProductlict) {
                    if ((product.getpName().equals(request.getProduct().getpName())) && (product.getOrderDate().toString().equals(request.getRequestOrderDate().toString()))) {
                        product.setpQquantity(product.getpQquantity() + request.getProductQuantity());
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if (!flag) {
                    Product nProduct = new Product();
                    nProduct.setpName(request.getProduct().getpName());
                    nProduct.setpQquantity(request.getProductQuantity());
                    nProduct.setOrderDate(request.getRequestOrderDate());
                    analyticsProductlict.add(nProduct);
                }
            } else if (request.getRequestOrderDate().equals("2012")) {
                boolean flag = false;
                //for loop for checking whther the same product exists for 2011
                for (Product product : analyticsProductlict) {
                    //if product exists in the same year then add the product quantity
                    if (product.getpName().equals(request.getProduct().getpName()) && product.getOrderDate().equals(request.getRequestOrderDate())) {
                        product.setpQquantity(product.getpQquantity() + request.getProductQuantity());

                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if (!flag) {
                    Product nProduct = new Product();
                    nProduct.setpName(request.getProduct().getpName());
                    nProduct.setpQquantity(request.getProductQuantity());
                    nProduct.setOrderDate(request.getRequestOrderDate());
                    analyticsProductlict.add(nProduct);
                }
            } else if (request.getRequestOrderDate().equals("2013")) {
                boolean flag = false;
                //for loop for checking whther the same product exists for 2011
                for (Product product : analyticsProductlict) {
                    //if product exists in the same year then add the product quantity
                    if (product.getpName().equals(request.getProduct().getpName()) && product.getOrderDate().equals(request.getRequestOrderDate())) {
                        product.setpQquantity(product.getpQquantity() + request.getProductQuantity());

                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if (!flag) {
                    Product nProduct = new Product();
                    nProduct.setpName(request.getProduct().getpName());
                    nProduct.setpQquantity(request.getProductQuantity());
                    nProduct.setOrderDate(request.getRequestOrderDate());
                    analyticsProductlict.add(nProduct);
                }
            } else if (request.getRequestOrderDate().equals("2014")) {
                boolean flag = false;
                //for loop for checking whther the same product exists for 2011
                for (Product product : analyticsProductlict) {
                    //if product exists in the same year then add the product quantity
                    if (product.getpName().equals(request.getProduct().getpName()) && product.getOrderDate().equals(request.getRequestOrderDate())) {
                        product.setpQquantity(product.getpQquantity() + request.getProductQuantity());

                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if (!flag) {
                    Product nProduct = new Product();
                    nProduct.setpName(request.getProduct().getpName());
                    nProduct.setpQquantity(request.getProductQuantity());
                    nProduct.setOrderDate(request.getRequestOrderDate());
                    analyticsProductlict.add(nProduct);
                }
            } else if (request.getRequestOrderDate().equals("2015")) {
                boolean flag = false;
                //for loop for checking whther the same product exists for 2011
                for (Product product : analyticsProductlict) {
                    //if product exists in the same year then add the product quantity
                    if (product.getpName().equals(request.getProduct().getpName()) && product.getOrderDate().equals(request.getRequestOrderDate())) {
                        product.setpQquantity(product.getpQquantity() + request.getProductQuantity());

                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if (!flag) {
                    Product nProduct = new Product();
                    nProduct.setpName(request.getProduct().getpName());
                    nProduct.setpQquantity(request.getProductQuantity());
                    nProduct.setOrderDate(request.getRequestOrderDate());
                    analyticsProductlict.add(nProduct);
                }
            }
        }
        Collections.sort(analyticsProductlict);
        int i = 0;

        //********Testing table***********************
        DefaultTableModel model = (DefaultTableModel) testTable.getModel();
        model.setRowCount(0);

        for (Product product : analyticsProductlict) {
            Object[] row = new Object[3];
            row[0] = product;
            row[1] = product.getpQquantity();
            row[2] = product.getOrderDate();
            model.addRow(row);
            break;
        }

        //**************************************
    }
    
    public void resetTable()
    {
        DefaultTableModel model = (DefaultTableModel) prouductList.getModel();
        model.setRowCount(0);
        
        
         DefaultTableModel pmodel = (DefaultTableModel) testTable.getModel();
        pmodel.setRowCount(0);
        
        jButton2.setEnabled(false);
        jButton3.setEnabled(true);
        warehouseUser.setEnabled(true);
       
    }

    public void bestEmployeer() {
        Map<String, Integer> bestUser = new HashMap<>();
        for (UserAccount user : organisation.getUserAccountDirectory().getUserAccountList()) {
            int i = 0;
            for (WorkRequest workrequest : user.getWorkQueue().getWorkRequestList()) {
                bestUser.put(user.toString(), i);
                
                i++;
            }
        }
        
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(bestUser);
        
         DefaultTableModel model = (DefaultTableModel) bestEmployer1.getModel();

        model.setRowCount(0);
        int i = 0;
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {

            Object[] row = new Object[3];
            row[0] =entry.getKey();
            row[1] = entry.getValue();
            model.addRow(row);

            i++;
            if (i == 3) {
                break;
            }

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

        jLabel2 = new javax.swing.JLabel();
        warehouseUser = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        testTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        bestEmployer1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prouductList = new javax.swing.JTable();

        jLabel2.setText("Select the user for analytics:");

        warehouseUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        warehouseUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                warehouseUserItemStateChanged(evt);
            }
        });
        warehouseUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                warehouseUserFocusGained(evt);
            }
        });
        warehouseUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                warehouseUserMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                warehouseUserMouseReleased(evt);
            }
        });

        testTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "Quantity", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(testTable);
        if (testTable.getColumnModel().getColumnCount() > 0) {
            testTable.getColumnModel().getColumn(2).setMinWidth(0);
            testTable.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        jButton3.setText("Go");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Top 2 Warehouse Employer as per the number of requests processed");

        jLabel4.setText("Product with the Highest Quantity as per the requests placed");

        bestEmployer1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User Name", "Number of Requests"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(bestEmployer1);

        jButton2.setText("Select another User");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Quantity ordered for the Selected product over the last 5 years");

        jButton1.setText("Analyse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        prouductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Product"
            }
        ));
        jScrollPane1.setViewportView(prouductList);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2))
                                .addComponent(warehouseUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(462, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(warehouseUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel3)
                .addGap(266, 266, 266))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(492, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(159, 159, 159)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        seletedUser = (UserAccount) warehouseUser.getSelectedItem();
        addProductAnalytics();
        populateProductTable();
        jButton3.setEnabled(false);
        jButton2.setEnabled(true);
        warehouseUser.setEnabled(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int selRow = prouductList.getSelectedRow();
       // addProductAnalytics();
        if (selRow >= 0) {
            Product nProduct = (Product) prouductList.getValueAt(selRow, 0);
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            for (Product product : analyticsProductlict) {
                if (nProduct.getpName().equals(product.getpName())) {
                      //result == null ? "Waiting" : result;  

                    if (product.getOrderDate().equals("2011")) {
                        dataset.setValue(product.getpQquantity(), product.getpName(), "2011");
                    } else if (product.getOrderDate().equals("2012")) {
                        dataset.setValue(product.getpQquantity(), product.getpName(), "2012");
                    } else if (product.getOrderDate().equals("2013")) {
                        dataset.setValue(product.getpQquantity(), product.getpName(), "2013");
                    } else if (product.getOrderDate().equals("2014")) {
                        dataset.setValue(product.getpQquantity(), product.getpName(), "2014");
                    } else if (product.getOrderDate().equals("2015")) {
                        dataset.setValue(product.getpQquantity(), product.getpName(), "2015");
                    }
                }
            }
            JFreeChart chart = ChartFactory.createBarChart("Test Chart", "Year", "Quantity", dataset, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot p = chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.BLACK);
            ChartFrame frame = new ChartFrame("Bar Chart", chart);
            frame.setVisible(true);
            frame.setSize(450, 350);
        } else {
            JOptionPane.showMessageDialog(null,"Please select a row ","ERROR'",JOptionPane.ERROR_MESSAGE);
            return;
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void warehouseUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_warehouseUserItemStateChanged
        
    }//GEN-LAST:event_warehouseUserItemStateChanged

    private void warehouseUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehouseUserMouseClicked
      
    }//GEN-LAST:event_warehouseUserMouseClicked

    private void warehouseUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_warehouseUserFocusGained
   
    }//GEN-LAST:event_warehouseUserFocusGained

    private void warehouseUserMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warehouseUserMouseReleased
   
        
    }//GEN-LAST:event_warehouseUserMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       resetTable();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void emptyTable()
    {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bestEmployer1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable prouductList;
    private javax.swing.JTable testTable;
    private javax.swing.JComboBox warehouseUser;
    // End of variables declaration//GEN-END:variables
}
