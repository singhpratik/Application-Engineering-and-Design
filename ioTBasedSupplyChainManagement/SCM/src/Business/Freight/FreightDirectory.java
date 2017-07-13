/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Freight;

import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class FreightDirectory {
    
    ArrayList <Freight> freightDirectory;
    
    public FreightDirectory()
    {
        freightDirectory = new ArrayList<>();
    }

    public ArrayList<Freight> getFreightDirectory() {
        return freightDirectory;
    }

    public void setFreightDirectory(ArrayList<Freight> freightDirectory) {
        this.freightDirectory = freightDirectory;
    }
    
     public Freight addFreight(Freight freight) {
        freightDirectory.add(freight);
        return freight;
    }
    
    
}
