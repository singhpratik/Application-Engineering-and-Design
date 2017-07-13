/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validator;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class ValidatorClass {

    public boolean isNumber(String n) {
        if (n.trim().matches("^\\d+$")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmail(String n) {
        if (n.trim().matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDoubel(String x) {
        if (x.trim().matches("^\\d*\\.?\\d*$")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(String x) {

        if (x.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean is4DgitNumber(String x)
    {
    if(x.trim().matches("^[0-9]{4}$")){
        return true;
    }else{
        return false;
    }
    }

}
