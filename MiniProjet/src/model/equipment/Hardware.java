package model.equipment;

import java.util.ArrayList;

import utils.Period;
//import config.OS;


public abstract class Hardware extends Equipment {
    
    // Fields
    
    private String screenSize;
    private String processor;
    private String os; // Mon eclipse ne trouve pas config.OS

    // Constructors
    
    public Hardware() {
        this("HW", "unknown", new ArrayList<Period>(), 10, "ARM Cortex", "Android 4.3");
    }
    
    public Hardware(String id, String maker, ArrayList<Period> unavPer,
            double screenSize, String proc, String os) {
        super(id, maker, unavPer);
        this.screenSize = screenSize + "\"";
        processor = proc;
        this.os = os;
    }
    
    // Methods
    
    public String toString() {
        return super.toString()+", screensize: "+screenSize+", processor: "+processor
                +", OS: "+os;
    }
    
    // Getters and Setters

    public String getScreenSize() {
        return screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOs() {
        return os;
    }
}
