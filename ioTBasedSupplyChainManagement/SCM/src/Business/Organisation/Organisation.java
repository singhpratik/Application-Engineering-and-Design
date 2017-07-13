/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Employee.EmployeeDirectory;
import Business.Product.MasterProductCatalog;
import Business.Product.ProductCatalog;
import Business.Roles.Roles;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public abstract class Organisation {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    private ProductCatalog productMasterList = new ProductCatalog();
    
    public enum Type{
        Admin("Admin Organization"),
        Warehouse("Warehouse Organization"),
        Inventory("Inventory Organization"),
        Supplier("Supplier Organisation"),
        Transport("Transport Organisation"),
        Freight("Freight Organisation");
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organisation(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public ProductCatalog getProductMasterList() {
        return productMasterList;
    }

    public void setProductMasterList(ProductCatalog productMasterList) {
        this.productMasterList = productMasterList;
    }

    public abstract ArrayList<Roles> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganisationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
        
}
