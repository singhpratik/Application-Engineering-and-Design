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
public class TransportWorkRequest extends WorkRequest{
    
          private String testResult;
          private WarehouseWorkRequest wareHousWorkRequest;

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
    
    
    
}
