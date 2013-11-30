package model.equipment;

import java.util.ArrayList;

import utils.Period;

public abstract class Headphone extends Equipment {
    
    // Fields
    
    private String impedance;
    private String frequencyResponse;
    private String soundPressure;
    
    // Constructors
    
    public Headphone() {
        this("HP", "unknown", new ArrayList<Period>(), 30, "20-20000", 100);
    }
    
    public Headphone(String id, String maker, ArrayList<Period> unavPer, int imp,
            String resp, int pres) {
        super(id, maker, unavPer);
        impedance = imp + " Ohms";
        frequencyResponse = resp + " Hz";
        soundPressure = pres + " dB";
    }
    
    // Methods
    
    public String toString() {
        return super.toString()+", impedance: "+impedance+", frequency response: "
                +frequencyResponse+", sound pressure: "+soundPressure;
    }

    // Getters and setters
    
    public String getImpedance() {
        return impedance;
    }

    public String getFrequencyResponse() {
        return frequencyResponse;
    }

    public String getSoundPressure() {
        return soundPressure;
    }
}
