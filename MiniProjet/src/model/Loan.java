package model;

import config.Model;
import model.equipment.Equipment;
import model.users.Borrower;
import model.users.Manager;
import utils.Period;
import model.ManagementSystem;

public class Loan {

    // Fields

    private Model model;
    private String equipmentID;
    private Period period;
    private Boolean valid;
    private Borrower borrower;

    // Constructors

    public Loan() {
        this(null, new Period(), null);
    }

    public Loan(Model model, Period p, Borrower borrower) {
        this.model = model;
        this.period = p;
        this.borrower = borrower;
        this.valid = false;
    }

    // Methods

    public String toString() {
        return "EquipmentID: " + equipmentID + ", model: " + model
                + ", period: " + period + ", valid: " + valid;
    }

    // Getters and setters

    public String getEquipmentID() {
        return equipmentID;
    }

    public Model getModel() {
        return model;
    }

    public Period getPeriod() {
        return period;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
