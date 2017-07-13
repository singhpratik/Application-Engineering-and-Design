/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class FreightRequest extends WorkRequest{
    
          private String testResult;
          private WarehouseWorkRequest warehouseWorkRequest;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public WarehouseWorkRequest getWarehouseWorkRequest() {
        return warehouseWorkRequest;
    }

    public void setWarehouseWorkRequest(WarehouseWorkRequest warehouseWorkRequest) {
        this.warehouseWorkRequest = warehouseWorkRequest;
    }
    
    
    
}
