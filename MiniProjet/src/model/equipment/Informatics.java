package model.equipment;

import java.util.ArrayList;

import utils.Period;
import config.OS;


public abstract class Informatics extends Equipment {
	private double screenSize;
	private String processor;
	private OS os;
	

	public Informatics(String id, ArrayList<Period> unavailablePeriod) {
	    super(id, unavailablePeriod);
    }

}
