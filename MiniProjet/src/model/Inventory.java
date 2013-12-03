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

	// Constructor test
	public Inventory() {
		this.inventory.put(Type.HEADPHONE, new ArrayList<Equipment>());
		this.inventory.put(Type.SMARTPHONE, new ArrayList<Equipment>());
		this.inventory.put(Type.PAD, new ArrayList<Equipment>());
	}

	// Constructor by config
	public Inventory(String defaultConfigNameFile, String defaultConfigVersion) {
		this.inventory = (HashMap<Type, ArrayList<Equipment>>) ConfigXML
		        .load(defaultConfigNameFile, defaultConfigVersion);
	}

	// Constructor by HashMap
	public Inventory(HashMap<Type, ArrayList<Equipment>> inventory) {
		this.inventory = inventory;
	}

	// Ajoute un équipement dans le stock
	public void addEquipment(Equipment e){
		this.inventory.get(e.getType()).add(e);
	}

	public HashMap<Type, ArrayList<Equipment>> getInventory() {
    	return inventory;
    }
	
	public Boolean isInStock(Equipment e){
		Set<Type> keys = this.inventory.keySet();
		Iterator<Type> it = keys.iterator();
		
		while (it.hasNext()) {
			Type key = it.next();
			
			for(Equipment i : this.inventory.get(key))
			{
				if(e.equals(i)) return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String res= "";
		Set<Type> keys = this.inventory.keySet();
		Iterator<Type> it = keys.iterator();
		
		while (it.hasNext()) {
			Type key = it.next();
			res += "EQUIPMENT TYPE : " + key.toString() + "\n";
			
			for(Equipment e : this.inventory.get(key))
			{
				res += "\t" + e.toString() + "\n";
			}
		}
		return res;	
	}
}

