/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Product.ProductCatalog;
import Business.Roles.AdminRole;
import Business.Roles.AnalystWarehouse;
import Business.Roles.Roles;
import Business.Roles.WarehouseRole;
import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class WarehouseOrganisation extends Organisation{

    ProductCatalog productCatalog;
  
    
   public WarehouseOrganisation() {
        super(Type.Warehouse.getValue());
       productCatalog = new ProductCatalog();
       
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new WarehouseRole());
        roles.add(new AnalystWarehouse());
        return roles;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

 
    
    
}
