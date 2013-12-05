package model;

import config.CommonConstants;
import model.equipment.Equipment;
import model.users.Manager;
import utils.Period;

public class Loan implements CommonConstants {

	// Fields

	private Equipment equipment;
	private Period borrowPeriod;
	private Boolean valid;
	private Manager manager;

	// Constructors

	public Loan() {
		this(INVENTORY.findAvailableEquipment(), new Period(), DEFAULTMANAGER);
	}

	public Loan(Equipment equipment, Period borrow, Manager manager) {
		this.equipment = equipment;
		this.borrowPeriod = borrow;
		this.valid = false;
		this.manager = manager; 								
	}

	// Methods

	public String toString() {
		return "Equipment: " + equipment + ", period: " + reservationPeriod + ", valid: "
		        + valid + ", manager: " + manager;
	}

	// Getters and setters

	public Period getPeriod() {
		return reservationPeriod;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
}
