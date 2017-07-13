/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public abstract class Enterprise extends Organisation {
    private EnterpriseType enterpriseType;
    private OrganisationDirectory organisationDirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organisationDirectory = new OrganisationDirectory();
        
    }
    
    public enum EnterpriseType{
        Warehouse("Warehouse and Inventory Management"),
        Supplier("Supplier");
        
        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }

}
