/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Organisation.Organisation.Type;
import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class OrganisationDirectory {

private ArrayList<Organisation> organisationList;

  public OrganisationDirectory() {
        organisationList = new ArrayList<>();
    }

    public ArrayList<Organisation> getOrganisationList() {
        return organisationList;
    }

    public void setOrganisationList(ArrayList<Organisation> organisationList) {
        this.organisationList = organisationList;
    }
    
      public Organisation createOrganisation(Type type){
        Organisation organisation = null;
        if (type.getValue().equals(Type.Warehouse.getValue())){
            organisation = new WarehouseOrganisation();
            
            organisationList.add(organisation);
        }  
        else if (type.getValue().equals(Type.Inventory.getValue())){
            organisation = new InventoryOrganisation();
            organisationList.add(organisation);
        }
         else if (type.getValue().equals(Type.Supplier.getValue())){
            organisation = new SupplierOrganisation();
            organisationList.add(organisation);
        }else if(type.getValue().equals(Type.Transport.getValue())){
         organisation = new TransportOrganisation();
            organisationList.add(organisation);
        }else if(type.getValue().equals(Type.Freight.getValue())){
         organisation = new FreightOrganisation();
            organisationList.add(organisation);
        }
        return organisation;
    }

   
}
