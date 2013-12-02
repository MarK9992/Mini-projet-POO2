package model.equipment;

import java.util.ArrayList;

import config.OS;
import config.Processor;
import config.Type;

import utils.Period;

public class XperiaZ extends Hardware {

	// Constructors

	public XperiaZ() {
		super("XperiaZ", "Sony", new ArrayList<Period>(), 6.4,
		        Processor.APQ8064, OS.ANDROID41, Type.SMARTPHONE);
	}

	// Main

	public static void main(String[] args) {
		XperiaZ x1 = new XperiaZ();

		x1.getUnavailabalityPeriods().add(new Period());
		System.out.println(x1);
	}
}
