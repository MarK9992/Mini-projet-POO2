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
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<Manager> managers = new ArrayList<Manager>();
    private ArrayList<Loan> ongoingValidationLoans = new ArrayList<Loan>();

    public ManagementSystem(Inventory inventory,
            HashMap<String, ArrayList<User>> users) {
        this.inventory = inventory;
       // this.students = users.get("students");
       // this.teachers = users.get("teachers");
       // this.managers = users.get("managers");

    }

    public ManagementSystem(String configInventoryFile, String configUsersFile,
            String configVersion) {
        this.inventory = new Inventory(configInventoryFile, configVersion);
        this.students = ((HashMap<String, ArrayList<Student>>) ConfigXML.load(
                configUsersFile, configVersion)).get("students");
        this.teachers = ((HashMap<String, ArrayList<Teacher>>) ConfigXML.load(
                configUsersFile, configVersion)).get("teachers");
        this.managers = ((HashMap<String, ArrayList<Manager>>) ConfigXML.load(
                configUsersFile, configVersion)).get("managers");
        
    }

    public void checkLoan(Loan l) {	
    	Manager m = new Manager();
    	m = (Manager)(this.managers.get(0));
    	if(m.checkLoan(l, this.inventory) == true) {
    		ongoingValidationLoans.add(l);
    	}
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        String res = "";

        res += this.inventory.toString();
        res += "\n\n";
        res += "--- USERS ---";

        res += "\nManagers\n";
        for (User u : this.managers) {
            res += "\t" + u.toString() + "\n";
        }

        res += "\nStudents\n";
        for (User u : this.students) {
            res += "\t" + u.toString() + "\n";
        }

        res += "\nTeachers\n";
        for (User u : this.teachers) {
            res += "\t" + u.toString() + "\n";
        }
        
        res += "\n--- ON GOING VALIDATION LOANS ---";
        for (Loan l : this.ongoingValidationLoans) {
            res += "\t" + l.toString() + "\n";
        }

        return res;
    }
}
