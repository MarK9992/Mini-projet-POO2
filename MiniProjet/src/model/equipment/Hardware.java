package model.equipment;

import java.util.ArrayList;

import utils.Period;
import config.OS;
import config.Processor;
import config.Type;

public abstract class Hardware extends Equipment {

	// Fields

	private String screenSize;
	private Processor processor;
	private OS os;

	// Constructors

	public Hardware() {
		this("HW", "unknown", new ArrayList<Period>(), 10, Processor.ARMCORTEX,
		        OS.ANDROID43, Type.UNKWOWN);
	}

	public Hardware(String id, String maker, ArrayList<Period> unavPer,
	        double screenSize, Processor proc, OS os, Type type) {
		super(id, maker, unavPer, type);
		this.screenSize = screenSize + "\"";
		this.processor = proc;
		this.os = os;
	}

	// Methods

	public String toString() {
		return super.toString() + ", screensize: " + screenSize
		        + ", processor: " + processor.getName() + ", OS: "
		        + os.getName();
	}

	// Getters and Setters

	public String getScreenSize() {
		return screenSize;
	}

	public Processor getProcessor() {
		return processor;
	}

	public OS getOs() {
		return os;
	}
}
