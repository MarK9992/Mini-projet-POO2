package model.equipment;

import java.util.ArrayList;

import config.Type;

import utils.Period;

public abstract class Equipment {

	private static int counter = 1;

	// Fields
	private String id;
	private String maker;
	private ArrayList<Period> unavailabalityPeriods;
	private Type type;

	// Constructors

	public Equipment() {
		this("E", "unkwown", new ArrayList<Period>(), Type.UNKWOWN);
	}

	public Equipment(String id, String maker,
	        ArrayList<Period> unavailabalityPeriods, Type type) {
		this.id = id + "-" + counter;
		this.maker = maker;
		this.unavailabalityPeriods = unavailabalityPeriods;
		this.type = type;
		counter++;
	}

	// Methods

	public String toString() {
		return "ID: " + id + ", made by: " + maker + ", unavailable: "
		        + unavailabalityPeriods;
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

	public Type getType() {
    	return type;
    }

}
