package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import config.ConfigXML;
import config.Type;

import model.equipment.Equipment;

public class Inventory {
	private HashMap<Type, ArrayList<Equipment>> inventory = new HashMap<Type, ArrayList<Equipment>>();

	public Inventory() {
		this.inventory.put(Type.HEADPHONE, new ArrayList<Equipment>());
		this.inventory.put(Type.SMARTPHONE, new ArrayList<Equipment>());
		this.inventory.put(Type.PAD, new ArrayList<Equipment>());
	}

	// Constructor with config
	public Inventory(String defaultConfigNameFile, String defaultConfigVersion) {
		this.inventory = (HashMap<Type, ArrayList<Equipment>>) ConfigXML.load(
		        defaultConfigNameFile, defaultConfigVersion);
	}

	// Constructor with HashMap
	public Inventory(HashMap<Type, ArrayList<Equipment>> inventory) {
		this.inventory = inventory;
	}

	// Getter
	public HashMap<Type, ArrayList<Equipment>> getInventory() {
		return inventory;
	}
	

	public void setInventory(HashMap<Type, ArrayList<Equipment>> inventory) {
    	this.inventory = inventory;
    }

	// Add an equipment in the stock
	public void addEquipment(Equipment e) {
		this.inventory.get(e.getType()).add(e);
	}

	// Remove an equipment from the stock
	public void removeEquipment(Equipment e) {
		this.inventory.get(e.getType()).remove(e);
	}
	
	// Récupère l'adresse passée en paramètre ? Je ne comprends pas l'utilité.
	// Recuperate the equipment from the stock
	/*public Equipment findEquipment(Equipment e) {
		for(int i = 0 ; i < this.inventory.get(e.getType()).size(); i++){
			  Equipment eq = this.inventory.get(e.getType()).get(i);
			  if(eq.equals(e)) {
				  return eq;
			  }
		}
		return null;
	}*/
	
	/**
	 * Returns an equipment available now, null if none.
	 * @return
	 */
	public Equipment findAvailableEquipment() {
	    Equipment eq;
	    Type[] t = {Type.PAD, Type.HEADPHONE, Type.SMARTPHONE, Type.UNKWOWN};
            
	    for(int j = 0; j < t.length; j++) {
                for(int i = 0; i < this.inventory.get(t[j]).size(); i++) {
                    eq = this.inventory.get(t[j]).get(i);
                    if(eq.availableNow()) return eq;
                }
	    }
   
            return null;
	}
	/**
	 * Returns an equipment of type t available now, null if none.
	 * @param t
	 * @return
	 */
	public Equipment findAvailableEquipment(Type t) {
	    Equipment eq;
	    
	    for(int i = 0; i < this.inventory.get(t).size(); i++) {
	        eq = this.inventory.get(t).get(i);
	        if(eq.availableNow()) return eq;
	    }
	    
	    return null;
	}

	// Count the total number of elements in the stock
	public int getNumberElements() {
		int number = 0;

		Set<Type> keys = this.inventory.keySet();
		Iterator<Type> it = keys.iterator();

		while (it.hasNext()) {
			Type key = it.next();
			number += this.inventory.get(key).size();
		}

		return number;
	}

	// return true if this equipment exist in the stock
	public Boolean isInStock(Equipment e) {
		Set<Type> keys = this.inventory.keySet();
		Iterator<Type> it = keys.iterator();

		while (it.hasNext()) {
			Type key = it.next();

			for (Equipment i : this.inventory.get(key)) {
				if (e.equals(i))
					return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String res = "";
		Set<Type> keys = this.inventory.keySet();
		Iterator<Type> it = keys.iterator();
		
		res+= "--- EQUIPMENTS ---\n\n";
		
		while (it.hasNext()) {
			Type key = it.next();
			res += "EQUIPMENTS TYPE : " + key.toString() + "\n";

			for (Equipment e : this.inventory.get(key)) {
				res += "\t" + e.toString() + "\n";
			}
		}
		return res;
	}
}
