/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Roles.Roles;
import Business.Roles.TransportRole;
import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class TransportOrganisation extends Organisation {
    
    
    public TransportOrganisation() {
        super(Type.Transport.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new TransportRole());
        return roles;
    }
    
    
}
