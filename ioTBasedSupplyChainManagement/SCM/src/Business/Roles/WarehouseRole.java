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
import UserInterface.WarehouseRole.WarehouseWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class WarehouseRole extends Roles{

   
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, EcoSystem system,Network network) {       
        return new WarehouseWorkAreaJPanel(userProcessContainer,account, system, organisation,enterprise,network);         
    }
    
         public String toString()
    {
        return Roles.RoleType.warehouse.getValue();
    }
    
}
