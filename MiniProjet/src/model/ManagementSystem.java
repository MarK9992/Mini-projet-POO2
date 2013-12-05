package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import config.ConfigXML;
import config.Model;

import model.equipment.Equipment;
import model.users.*;

public class ManagementSystem {
	private Inventory inventory;
	private ArrayList<User> students = new ArrayList<User>();
	private ArrayList<User> teachers = new ArrayList<User>();
	private ArrayList<User> managers = new ArrayList<User>();
	private ArrayList<Loan> ongoingValidationLoans = new  ArrayList<Loan>();

	public ManagementSystem(Inventory inventory,
	        HashMap<String, ArrayList<User>> users) {
		this.inventory = inventory;
		this.students = users.get("students");
		this.teachers = users.get("teachers");
		this.managers = users.get("managers");
		
	}

	public ManagementSystem(String configInventoryFile, String configUsersFile, String configVersion) {		
			this.inventory = new Inventory(configInventoryFile,configVersion);
			this.students = ((HashMap<String, ArrayList<User>>) ConfigXML.load(
					configUsersFile, configVersion)).get("students");
		    this.teachers = ((HashMap<String, ArrayList<User>>) ConfigXML.load(
		    		configUsersFile, configVersion)).get("teachers");
		    this.managers = ((HashMap<String, ArrayList<User>>) ConfigXML.load(
		    		configUsersFile, configVersion)).get("managers");
    }
	
	public void demo() {
		// User 1 fait une demande d'emprunt
		//ongoingValidationLoans.add(((Student)(this.students.get(0))).borrow(/*Model.IPAD3*/));
		 //= this.managers.get(0).checkLoan(dernierEmprunt);
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public ArrayList<User> getManagers() {
		return managers;
	}

	public void setManagers(ArrayList<User> managers) {
		this.managers = managers;
	}

	public ArrayList<User> getStudents() {
    	return students;
    }

	public void setStudents(ArrayList<User> students) {
    	this.students = students;
    }

	public ArrayList<User> getTeachers() {
    	return teachers;
    }

	public void setTeachers(ArrayList<User> teachers) {
    	this.teachers = teachers;
    }

	@Override
	public String toString() {
		String res = "";
		
		res+=this.inventory.toString();
		res+= "\n\n";
		res+= "--- USERS ---";
		
		res+= "\nManagers\n";
		for(User u : this.managers) {
			res+= "\t" + u.toString() + "\n";
		}
		
		res+= "\nStudents\n";
		for(User u : this.students) {
			res+= "\t" + u.toString() + "\n";
		}
		
		res+= "\nTeachers\n";
		for(User u : this.teachers) {
			res+= "\t" + u.toString() + "\n";
		}
		
		return res;
	}
}
