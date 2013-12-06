/**
 * @author Marc
 */
package model.equipment;

import java.util.ArrayList;

import utils.Period;
import config.Model;

public class Vengeance2100 extends Headphone {

	// Constructors

	public Vengeance2100() {
		super("Vengeance", "Corsair", new ArrayList<Period>(), 32, "20-20000",
		        105, Model.VENGEANCE2100);
	}
}
