/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Freight.Freight;
//import static Business.Organisation.Organisation.Type.Freight;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class WarehouseRequest extends WorkRequest{
    private WarehouseWorkRequest wareHousWorkRequest;
        private String testResult;
        private Freight freight;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public WarehouseWorkRequest getWareHousWorkRequest() {
        return wareHousWorkRequest;
    }

    public void setWareHousWorkRequest(WarehouseWorkRequest wareHousWorkRequest) {
        this.wareHousWorkRequest = wareHousWorkRequest;
    }

    public Freight getFreight() {
        return freight;
    }

    public void setFreight(Freight freight) {
        this.freight = freight;
    }
    
    
        
}
