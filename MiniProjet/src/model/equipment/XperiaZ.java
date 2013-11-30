package model.equipment;

import java.util.ArrayList;

import utils.Period;

public class XperiaZ extends Hardware {
        
    // Constructors
    
    public XperiaZ() {
        super("XperiaZ", "Sony", new ArrayList<Period>(), 6.4, "APQ8064", "Android 4.1");
    }
    
    // Main
    
    public static void main(String[] args) {
        XperiaZ x1 = new XperiaZ();
        
        x1.getUnavailabalityPeriods().add(new Period());
        System.out.println(x1);
    }
}
