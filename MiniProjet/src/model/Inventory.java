package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import model.equipment.Equipment;
import utils.Period;
import config.ConfigXML;
import config.Model;

public class Inventory {
	private HashMap<Model, ArrayList<Equipment>> inventory = new HashMap<Model, ArrayList<Equipment>>();

	public Inventory() {
		this.inventory.put(Model.VENGEANCE2100, new ArrayList<Equipment>());
		this.inventory.put(Model.XPERIAZ, new ArrayList<Equipment>());
		this.inventory.put(Model.IPAD3, new ArrayList<Equipment>());
	}

	// Constructor with config
	public Inventory(String defaultConfigNameFile, String defaultConfigVersion) {
		this.inventory = (HashMap<Model, ArrayList<Equipment>>) ConfigXML.load(
		        defaultConfigNameFile, defaultConfigVersion);
	}

	// Constructor with HashMap
	public Inventory(HashMap<Model, ArrayList<Equipment>> inventory) {
		this.inventory = inventory;
	}

	// Getter
	public HashMap<Model, ArrayList<Equipment>> getInventory() {
		return inventory;
	}

	public void setInventory(HashMap<Model, ArrayList<Equipment>> inventory) {
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

	/**
	 * Returns an equipment available now, null if none.
	 * 
	 * @return
	 */
	public Equipment findAvailableEquipment() {
		Equipment eq;
		Model[] t = { Model.IPAD3, Model.VENGEANCE2100, Model.XPERIAZ,
		        Model.UNKWOWN };

		for (int j = 0; j < t.length; j++) {
			for (int i = 0; i < this.inventory.get(t[j]).size(); i++) {
				eq = this.inventory.get(t[j]).get(i);
				if (eq.availableNow())
					return eq;
			}
		}

		return null;
	}

	/**
	 * Returns an equipment of type t available now, null if none.
	 * 
	 * @param t
	 * @return
	 */
	public Equipment findAvailableEquipment(Model m) {
		Equipment eq;

		for (int i = 0; i < this.inventory.get(m).size(); i++) {
			eq = this.inventory.get(m).get(i);
			if (eq.availableNow())
				return eq;
		}

		return null;
	}

	/**
	 * Returns an equipment of type t available during the period p, null if
	 * none.
	 * 
	 * @param m
	 * @param p
	 * @return
	 */
	public Equipment findAvailableEquipmentAt(Model m, Period p) {
		Equipment eq;

		for (int i = 0; i < this.inventory.get(m).size(); i++) {
			eq = this.inventory.get(m).get(i);
			if (eq.availableAt(p))
				return eq;
		}

		return null;
	}

	// Count the total number of elements in the stock
	public int getNumberElements() {
		int number = 0;

		Set<Model> keys = this.inventory.keySet();
		Iterator<Model> it = keys.iterator();

		while (it.hasNext()) {
			Model key = it.next();
			number += this.inventory.get(key).size();
		}

		return number;
	}

	// return true if this equipment exist in the stock
	public Boolean isInStock(Equipment e) {
		Set<Model> keys = this.inventory.keySet();
		Iterator<Model> it = keys.iterator();

		while (it.hasNext()) {
			Model key = it.next();

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
		Set<Model> keys = this.inventory.keySet();
		Iterator<Model> it = keys.iterator();

		res += "--- EQUIPMENTS ---\n\n";

		while (it.hasNext()) {
			Model key = it.next();
			res += "EQUIPMENTS TYPE : " + key.toString() + "\n";

			for (Equipment e : this.inventory.get(key)) {
				res += "\t" + e.toString() + "\n";
			}
		}
		return res;
	}
}
