import java.util.ArrayList;

import model.Inventory;
import model.equipment.Equipment;
import model.equipment.Ipad3;
import model.equipment.Vengeance2100;
import model.equipment.XperiaZ;
import utils.Period;
import config.Type;
import controller.Controller;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ipad3 ip = new Ipad3();
		Ipad3 ip2 = new Ipad3();
		ArrayList<Period> a = new ArrayList<Period>();
		a.add(new Period());
		
		ip2.setUnavailabalityPeriods(a);
		Vengeance2100 v = new Vengeance2100();
		XperiaZ x = new XperiaZ();
		
		Inventory r = new Inventory();
		r.addEquipment(x);
		r.addEquipment(ip);
		r.addEquipment(ip2);
		r.addEquipment(v);
		
		
		for(Equipment eq : r.getInventory().get(Type.HEADPHONE)) {
	        if(eq.availableNow()) System.out.println("" + eq.toString());
	    }
		
		
		Controller c = new Controller();
		c.start();
	}

}
