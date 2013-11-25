package model;

import model.users.Manager;
import utils.Period;

public class Loan {
	private Period period;
	private Boolean isValid;
	private Manager manager;

	public Loan(Period period, Boolean isValid, Manager manager) {
	    this.period = period;
	    this.isValid = isValid;
	    this.manager = manager;
    }
	
	public Period getPeriod() {
    	return period;
    }

	public void setPeriod(Period period) {
    	this.period = period;
    }

	public Boolean getIsValid() {
    	return isValid;
    }

	public void setIsValid(Boolean isValid) {
    	this.isValid = isValid;
    }

	public Manager getManager() {
    	return manager;
    }

	public void setManager(Manager manager) {
    	this.manager = manager;
    }

}
