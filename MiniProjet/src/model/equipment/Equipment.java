package model.equipment;

import java.util.ArrayList;

import config.Model;

import utils.Period;

public abstract class Equipment {

	private static int counter = 1;

	// Fields
	private String id;
	private String maker;
	private ArrayList<Period> unavailabalityPeriods = new ArrayList<Period>();
	private Model type;

	// Constructors

	public Equipment() {
		this("E", "unkwown", new ArrayList<Period>(), Model.UNKWOWN);
	}

	public Equipment(String id, String maker,
	        ArrayList<Period> unavailabalityPeriods, Model type) {
		this.id = id + "-" + counter;
		this.maker = maker;
		this.unavailabalityPeriods = unavailabalityPeriods;
		this.type = type;
		counter++;
	}

	// Methods
	
	/**
	 * Returns true if the equipment is available now.
	 * @return
	 */
	public boolean availableNow() {
		if(this.getUnavailabalityPeriods().size() > 0) {
			return (!this.getUnavailabalityPeriods().get(0).today());
		}
	    return true;
	}

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

	public Model getType() {
    	return type;
    }

}
