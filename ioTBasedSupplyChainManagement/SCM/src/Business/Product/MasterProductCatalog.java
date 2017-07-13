/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class MasterProductCatalog {
    
    
    ArrayList<ProductCatalog> masterProductCatalog;
    
    public MasterProductCatalog()
    {
        masterProductCatalog = new ArrayList<>();
    }

    public ArrayList<ProductCatalog> getMasterProductCatalog() {
        return masterProductCatalog;
    }

    public void setMasterProductCatalog(ArrayList<ProductCatalog> masterProductCatalog) {
        this.masterProductCatalog = masterProductCatalog;
    }
    
      public  ProductCatalog addProduct()
    {
     ProductCatalog productCatalogList  = new ProductCatalog();
     masterProductCatalog.add(productCatalogList);
        return productCatalogList;
    }
      
       public void deleteProduct(Product product)
    {
        masterProductCatalog .remove(product);
    }

}
