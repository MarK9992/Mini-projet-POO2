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
		this.inventory.put(Type.TABLETTE, new ArrayList<Equipment>());
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
		Set<Type> keys = this.inventory.keySet();
		Iterator<Type> it = keys.iterator();

		this.inventory.get(e.getType()).add(e);
		
		// TODO remove les affichages	
		System.out.println(e.getType());
		System.out.println(e.toString());
	}

	public HashMap<Type, ArrayList<Equipment>> getInventory() {
    	return inventory;
    }
	
	//TODO l'affichage
	public String toString() {
		return "";	
	}
	
}

