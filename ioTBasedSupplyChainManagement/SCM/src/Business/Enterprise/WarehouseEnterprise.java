/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Roles.Roles;
import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class WarehouseEnterprise extends Enterprise{
    
    
    public WarehouseEnterprise(String name) {
        super(name, EnterpriseType.Warehouse);
    }

    @Override
    public ArrayList<Roles> getSupportedRole() {
        return null;
    }
    
    
    
}
