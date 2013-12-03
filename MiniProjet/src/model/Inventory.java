package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import config.ConfigXML;
import config.Type;

import model.equipment.Equipment;
import model.equipment.Headphone;

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

	// Add an equipment in the stock
	public void addEquipment(Equipment e) {
		this.inventory.get(e.getType()).add(e);
	}

	// Remove an equipment from the stock
	public void removeEquipment(Equipment e) {
		this.inventory.get(e.getType()).remove(e);
	}
	
	// Recuperate the equipment from the stock
	public Equipment findEquipment(Equipment e) {
		for(int i = 0 ; i < this.inventory.get(e.getType()).size(); i++){
			  Equipment eq = this.inventory.get(e.getType()).get(i);
			  if(eq.equals(e)) {
				  return eq;
			  }
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

		while (it.hasNext()) {
			Type key = it.next();
			res += "EQUIPMENT TYPE : " + key.toString() + "\n";

			for (Equipment e : this.inventory.get(key)) {
				res += "\t" + e.toString() + "\n";
			}
		}
		return res;
	}
}
