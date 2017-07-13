/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Freight.FreightDirectory;
import Business.Roles.AnalystFreight;
import Business.Roles.FreightRole;
import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class FreightOrganisation extends Organisation{
    FreightDirectory freightDir;
         public FreightOrganisation() {
        super(Type.Freight.getValue());
        freightDir = new FreightDirectory();
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new FreightRole());
        roles.add(new AnalystFreight());
        return roles;
    }

    public FreightDirectory getFreightDir() {
        return freightDir;
    }

    public void setFreightDir(FreightDirectory freightDir) {
        this.freightDir = freightDir;
    }
    
    
}
