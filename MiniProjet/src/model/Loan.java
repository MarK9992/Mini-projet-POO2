package model;

import model.equipment.Equipment;
import model.users.Manager;
import utils.Period;

public class Loan {

	// Fields

	private Equipment equipment;
	private Period reservationPeriod;
	private Period borrowPeriod;
	private Boolean valid;
	private Manager manager;

	// Constructors

	public Loan() {
		// TODO when the inventory class will be ready
	}

	public Loan(Equipment equipment, Period borrow, Period reservation, Manager manager) {
		this.equipment = equipment;
		this.reservationPeriod = reservation;
		this.borrowPeriod = borrow;
		this.valid = false;
		this.manager = manager; // should be a constant DEFAULTMANAGER or a
								// method attributeManager(...) somewhere
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
