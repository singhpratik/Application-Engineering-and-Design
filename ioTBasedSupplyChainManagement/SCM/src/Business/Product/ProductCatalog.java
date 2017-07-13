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
public class ProductCatalog {

    ArrayList<Product> productList;

    public ProductCatalog() {
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    //add product to the product catalog
    public Product addProduct(Product product) {

        productList.add(product);
        return product;
    }
    
        public void deleteProduct(Product product)
    {
        productList.remove(product);
    }

    public ArrayList<Product> searchAccount(String productName) {
        ArrayList<Product> searchProdList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getpName().equalsIgnoreCase(productName)) { 
                searchProdList.add(product);
            }
        }
        if(searchProdList.isEmpty()){
        return null;
        }else{
        return searchProdList;
        }
    }

}
