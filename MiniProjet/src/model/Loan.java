package model;

import model.equipment.Equipment;
import model.users.Manager;
import utils.Period;
import model.ManagementSystem;

public class Loan {

	// Fields

	private Equipment equipment;
	private Period borrowPeriod;
	private Period reservationPeriod;
	private Boolean valid;

	// Constructors

	public Loan() {
		this(null, new Period());
	}

	public Loan(Equipment equipment, Period borrow) {
		this.equipment = equipment;
		this.borrowPeriod = borrow;
		this.valid = false;								
	}

	// Methods

	public String toString() {
		return "Equipment: " + equipment + ", period: " + reservationPeriod + ", valid: "
		        + valid;
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
}
