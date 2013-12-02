package model.equipment;

import java.util.ArrayList;

import config.Type;

import utils.Period;

public class Vengeance2100 extends Headphone {

	// Constructors

	public Vengeance2100() {
		super("Vengeance", "Corsair", new ArrayList<Period>(), 32, "20-20000",
		        105, Type.HEADPHONE);
	}

	// Main

	public static void main(String[] args) {
		Vengeance2100 v1 = new Vengeance2100();

		v1.getUnavailabalityPeriods().add(new Period());
		System.out.println(v1);
	}
}
