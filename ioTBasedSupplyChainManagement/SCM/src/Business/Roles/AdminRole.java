/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UserInterface.AdminWorkArea.AdminWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author raunak
 */
public class AdminRole extends Roles{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, EcoSystem business,Network network) {
      return new AdminWorkAreaJPanel(userProcessContainer, enterprise);  
    }

   
    
}
