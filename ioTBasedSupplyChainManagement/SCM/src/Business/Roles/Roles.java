/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public abstract class Roles {
     public enum RoleType{
        Admin("Admin"),
        Freight("Freight Manager"),
        Inventory("Inventory Manager"),
        Supplier("Manufacturer"),
        Finance("Finance Manager"),
        DataAnalyst("Data Analyst"),
        Freightanalyst("Freight analyst"),
        warehouse("warehouse Manager"),
        Transport("Transport manager");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }
        

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organisation organisation, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
