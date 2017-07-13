/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Supplier;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Warehouse;
import Business.Enterprise.WarehouseEnterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Organisation.SupplierOrganisation;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.Validator.ValidatorClass;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class SupplierAddProduct extends javax.swing.JPanel {

    JPanel userProcessContainer;
    SupplierOrganisation organisation;

    EcoSystem system;
    Product product;
    Product masterProduct;
    Enterprise enterprise;
    Enterprise warEnterprise;
    UserAccount userAccount;
    Network network;

    /**
     * Creates new form SupplierAddProduct
     */
    public SupplierAddProduct(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system, Organisation organisation, Enterprise enterprise,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organisation = (SupplierOrganisation) organisation;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.network = network;
        System.out.println(this.organisation);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        productName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtPrice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Add Product to the Product List", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        productName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Save Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Description:");

        jLabel4.setText("Price*");

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Name*");

        jLabel3.setText("Product Quantity*");

        jButton3.setText("Add Another Product");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Manufacturing Date*");

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantity)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(10, 10, 10)
                                .addComponent(jButton1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(10, 10, 10)
                .addComponent(jButton3)
                .addGap(10, 10, 10))
        );
        jLayeredPane1.setLayer(productName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtQuantity, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date = new Date();
//if(txtQuantity.getText().getBytes(null)

try{
int productQuantityCheck = Integer.parseInt(txtQuantity.getText());
double price = Double.parseDouble(txtPrice.getText());
System.out.println(dateFormat.format(date));




        
        product = new Product();
        masterProduct = new Product();

        ValidatorClass valid = new ValidatorClass();

        boolean emptyProd = valid.isEmpty(productName.getText());
        boolean emptyQuant = valid.isEmpty(txtQuantity.getText());
        boolean priceCheck = valid.isEmpty(txtPrice.getText());
        boolean prodIsNumber = valid.isNumber(txtQuantity.getText());
        boolean priceIsDouble = valid.isDoubel(txtPrice.getText());

        if (emptyProd || emptyQuant || priceCheck) {
            JOptionPane.showMessageDialog(null, "All fields are Mandotory.Please enter all the required fields", "Error: Fields cannot be empty", JOptionPane.ERROR_MESSAGE);

        } else if (!prodIsNumber) {
            JOptionPane.showMessageDialog(null, "Product Quantity should be a Number", "Error:Invalid Quanity", JOptionPane.ERROR_MESSAGE);
        } else if (!priceIsDouble) {
            JOptionPane.showMessageDialog(null, "please enter the correct product price", "Error:Invalid Price", JOptionPane.ERROR_MESSAGE);
        } else {
            if(productQuantityCheck<=0||productQuantityCheck>90000)
{
                    JOptionPane.showMessageDialog(null,"Quantity range is 1to 900000 ");
                    return;
                    }

                    if(price<=0.00||productQuantityCheck>20000.0)
                    {
                    JOptionPane.showMessageDialog(null,"Quantity range is 0 to 20000 ");
                    return;
                    }
            boolean flag = false;
            for (Product nProduct : organisation.getManuProductList().getProductList()) {
                if (nProduct.getpName().equals(productName.getText())) {
                    nProduct.setpQquantity(nProduct.getpQquantity() + Integer.parseInt(txtQuantity.getText()));
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }

            if (!flag) {
                product = organisation.getManuProductList().addProduct(product);
                product.setpName(productName.getText());
                product.setPrice(Double.parseDouble(txtPrice.getText()));
                product.setpQquantity(Integer.parseInt(txtQuantity.getText()));
                product.setSupplier(userAccount);
                product.setDescription(jTextArea1.getText());
                product.setMfgDate(date);
                jTextField1.setText(date.toString());
            }

            for (Enterprise warEnterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                boolean nflag = false;
                if (warEnterprise.getEnterpriseType().getValue().equals("Warehouse and Inventory Management")) {

                    for (Product mproduct : warEnterprise.getProductMasterList().getProductList()) {
                        if ((mproduct.getpName().equals(productName.getText())) && (mproduct.getSupplier().toString().equals(userAccount.toString()))) {
                            mproduct.setpQquantity(mproduct.getpQquantity() + Integer.parseInt(txtQuantity.getText()));
                            nflag = true;
                            break;

                        } else {
                            nflag = false;
                        }
                    }

                    if (!nflag) {
                        masterProduct = warEnterprise.getProductMasterList().addProduct(masterProduct);
                        masterProduct.setpName(productName.getText());
                        masterProduct.setPrice(Double.parseDouble(txtPrice.getText()));
                        masterProduct.setpQquantity(Integer.parseInt(txtQuantity.getText()));
                        masterProduct.setSupplier(userAccount);
                        masterProduct.setDescription(jTextArea1.getText());
                        masterProduct.setMfgDate(date);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Product is created successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        }
        
        jButton3.setEnabled(true);
        jButton1.setEnabled(false);
        productName.setEnabled(false);
        txtPrice.setEnabled(false);
        txtQuantity.setEnabled(false);
        jTextArea1.setEnabled(false);
}catch(Exception e)
{
    JOptionPane.showMessageDialog(null,"Invalid Input.Please try again.","ERROR",JOptionPane.ERROR_MESSAGE);
System.out.println("Invalid Input");
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
       callReset();
         productName.setEnabled(true);
        txtPrice.setEditable(true);
        txtQuantity.setEnabled(true);
        jTextArea1.setEditable(true);
        jButton3.setEnabled(false);
        jButton1.setEnabled(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    public void callReset() {
        for (Product product : enterprise.getProductMasterList().getProductList()) {
            System.out.println(product);
        }

        productName.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
         jTextArea1.setText("");

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}