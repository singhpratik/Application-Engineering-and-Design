/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Roles.AdminRole;
import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class AdminOrganisation extends Organisation{
   
    public AdminOrganisation() {
        super(Type.Admin.getValue());
    }
    
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
}
