/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Freight;

import Business.FreightSensor.LocationSensor;
import Business.FreightSensor.SensorEquipment;
import Business.FreightSensor.SensorOverallHealth;
import java.util.ArrayList;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class Freight {
    
    String fNumber;
    int fCapacity;
    boolean fLoaded;
    int fShipped;
    String freightType;
    int freightInsureNumber;
    int freightModel;
    SensorEquipment fCondition;
    ArrayList<SensorOverallHealth> fHealth;
    LocationSensor locationSensor;
    
    public Freight()
    {
        fCondition = new SensorEquipment();
        fHealth = new ArrayList<>();
      locationSensor = new LocationSensor();
        
    }

    public String getfNumber() {
        return fNumber;
    }

    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }

 

    public boolean isfLoaded() {
        return fLoaded;
    }

    public void setfLoaded(boolean fLoaded) {
        this.fLoaded = fLoaded;
    }
    
  

    public int getfShipped() {
        return fShipped;
    }

    public void setfShipped(int fShipped) {
        this.fShipped = fShipped;
    }

    public int getfCapacity() {
        return fCapacity;
    }

    public void setfCapacity(int fCapacity) {
        this.fCapacity = fCapacity;
    }

    public SensorEquipment getfCondition() {
        return fCondition;
    }

    public void setfCondition(SensorEquipment fCondition) {
        this.fCondition = fCondition;
    }

    public ArrayList<SensorOverallHealth> getfHealth() {
        return fHealth;
    }

    public void setfHealth(ArrayList<SensorOverallHealth> fHealth) {
        this.fHealth = fHealth;
    }

    public String getFreightType() {
        return freightType;
    }

    public void setFreightType(String freightType) {
        this.freightType = freightType;
    }

    public int getFreightInsureNumber() {
        return freightInsureNumber;
    }

    public void setFreightInsureNumber(int freightInsureNumber) {
        this.freightInsureNumber = freightInsureNumber;
    }

    public int getFreightModel() {
        return freightModel;
    }

    public void setFreightModel(int freightModel) {
        this.freightModel = freightModel;
    }

    public LocationSensor getLocationSensor() {
        return locationSensor;
    }

    public void setLocationSensor(LocationSensor locationSensor) {
        this.locationSensor = locationSensor;
    }
    
    
    
    @Override
     public String toString()
    {
    return this.fNumber;
    }
}
