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
public class WarehouseWorkRequest extends WorkRequest{
    
        private String testResult;
       public static  int count;
       public  WarehouseWorkRequest()
        {
     
             count++;
         
        }
        
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        WarehouseWorkRequest.count = count;
    }
    
    
    
}
