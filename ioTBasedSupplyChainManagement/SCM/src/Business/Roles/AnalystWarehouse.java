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
import UserInterface.WarehouseDataAnalyst.WarehouseDataAnalystJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class AnalystWarehouse extends Roles{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, EcoSystem system,Network network) {
    return new WarehouseDataAnalystJPanel(userProcessContainer,account, system, organisation,enterprise);         
    }
    
    public String toString()
    {
        return Roles.RoleType.DataAnalyst.getValue();
    }
    
}
