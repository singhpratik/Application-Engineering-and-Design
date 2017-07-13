/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Status;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class Status {
    
    HashMap<Integer, Integer> statusCheck ;
       private static Status instance = null;
       
   protected Status() {
     statusCheck  =  new HashMap<Integer,Integer>();
      // Exists only to defeat instantiation.
   }
   public static Status getInstance() {
      if(instance == null) {
         instance = new Status();
      }
      return instance;
   }

    public HashMap<Integer, Integer> getStatusCheck() {
        return statusCheck;
    }

    public void setStatusCheck(HashMap<Integer, Integer> statusCheck) {
        this.statusCheck = statusCheck;
    }
   
   
}
