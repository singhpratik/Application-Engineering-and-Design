/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class Product implements Comparable<Product>{
    
    String pName;
    int pQquantity;
    Date mfgDate = new Date();
    double price;
    String description;
    int productId;

    UserAccount supplier;
    UserAccount sender;
    String orderDate;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpQquantity() {
        return pQquantity;
    }

    public void setpQquantity(int pQquantity) {
        this.pQquantity = pQquantity;
    }

    public Date getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Date mfgDate) {
        this.mfgDate = mfgDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public UserAccount getSupplier() {
        return supplier;
    }

    public void setSupplier(UserAccount supplier) {
        this.supplier = supplier;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }
    

   
    @Override
    public String toString()
    {
    return this.pName;
    }
    
       @Override
    public int compareTo(Product o) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int i= Integer.parseInt(((Product) o).getOrderDate());
        int j =Integer.parseInt(this.getOrderDate()) ;
        int totalCount = i;
        return j-totalCount;
    }
    
    
}
