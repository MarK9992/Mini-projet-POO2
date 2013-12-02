package model.equipment;

import java.util.ArrayList;

import config.OS;
import config.Processor;

import utils.Period;

public class Ipad3 extends Hardware {
	
    // Constructors
    
    public Ipad3() {
        super("Ipad3", "Apple", new ArrayList<Period>(), 9.7, Processor.APPLEA5X,
                OS.IOS5);
    }
    
    // Main
    
    public static void main(String[] args) {
        Ipad3 i1 = new Ipad3();
        
        i1.getUnavailabalityPeriods().add(new Period());
        System.out.println(i1);
    }
}
