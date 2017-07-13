/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FreightSensor;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class SensorEquipment {
    boolean engineOil;
    int engineEmmision;
    int frontAir;
    int rearAir;

    public boolean isEngineOil() {
        return engineOil;
    }

    public void setEngineOil(boolean engineOil) {
        this.engineOil = engineOil;
    }

    public int getEngineEmmision() {
        return engineEmmision;
    }

    public void setEngineEmmision(int engineEmmision) {
        this.engineEmmision = engineEmmision;
    }

    public int getFrontAir() {
        return frontAir;
    }

    public void setFrontAir(int frontAir) {
        this.frontAir = frontAir;
    }

    public int getRearAir() {
        return rearAir;
    }

    public void setRearAir(int rearAir) {
        this.rearAir = rearAir;
    }
    
}
