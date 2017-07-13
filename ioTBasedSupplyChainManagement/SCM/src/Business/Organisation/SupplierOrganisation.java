/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Product.Product;
import Business.Product.ProductCatalog;
import Business.Roles.Roles;
import Business.Roles.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class SupplierOrganisation extends Organisation{
    
     private  ProductCatalog manuProductList;
     
     public SupplierOrganisation() {
        super(Type.Supplier.getValue());  
        manuProductList= new ProductCatalog(); 
    }

    public ProductCatalog getManuProductList() {
        return manuProductList;
    }

    public void setManuProductList(ProductCatalog manuProductList) {
        this.manuProductList = manuProductList;
    }
    
     
     
  
     
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new SupplierRole());
        return roles;
    }
}
