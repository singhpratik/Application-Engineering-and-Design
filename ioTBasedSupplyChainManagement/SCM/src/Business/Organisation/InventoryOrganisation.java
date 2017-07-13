/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Product.ProductCatalog;
import Business.Roles.InventoryRole;
import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class InventoryOrganisation extends Organisation{
    
    ProductCatalog invProductList;
       public InventoryOrganisation() {
        super(Type.Inventory.getValue());
        invProductList = new ProductCatalog();
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new InventoryRole());
        return roles;
    }

    public ProductCatalog getInvProductList() {
        return invProductList;
    }

    public void setInvProductList(ProductCatalog invProductList) {
        this.invProductList = invProductList;
    }
    
    
}
