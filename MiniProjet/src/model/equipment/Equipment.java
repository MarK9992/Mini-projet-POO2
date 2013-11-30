package model.equipment;

import java.util.ArrayList;

import utils.Period;

public abstract class Equipment {
    
    // Fields
    
    private String id;
    private String maker;
    private ArrayList<Period> unavailabalityPeriods;
    private static int counter = 1;

    // Constructors
    
    public Equipment()
    {
        this("E", "unkwown", new ArrayList<Period>());
    }

    public Equipment(String id, String maker, ArrayList<Period> unavailabalityPeriods) {
        this.id = id + "-" + counter;
        this.maker = maker;
        this.unavailabalityPeriods = unavailabalityPeriods;
        counter++;
    }
    
    // Methods
    
    public String toString() {
        return "ID: "+id+", made by: "+maker+", unavailable: "+unavailabalityPeriods;
    }

    // Getters and setters
    
    public String getId() {
    	return id;
    }
    
    public String getMaker() {
        return maker;
    }

    public ArrayList<Period> getUnavailabalityPeriods() {
    	return unavailabalityPeriods;
    }
    
    public void setUnavailabalityPeriods(ArrayList<Period> unavailabalityPeriods) {
    	this.unavailabalityPeriods = unavailabalityPeriods;
    }
    
    public static int getCounter() {
        return counter;
    }
	
}
