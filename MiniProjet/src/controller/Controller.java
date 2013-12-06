package controller;

import java.util.Calendar;

import config.Model;
import model.ManagementSystem;
import model.users.Student;
import utils.Period;
import view.View;

public class Controller {
	private View view;
	private ManagementSystem system;

	public Controller() {
		this.view = new View();
		this.system = new ManagementSystem("inventory", "users", "v1");
		
	}

	public void start() {
		// Welcoming display
		this.view.displayMenu();
		
		// State of the inventory and the users
		this.view.displaySystem(this.system);
		
		// TODO launch borrow demo
		Calendar startDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		endDate.set(2013, 07, 12);
	
		this.system.checkLoan(this.system.getStudents().get(0).book(Model.IPAD3, new Period(startDate,endDate)));
		

	}
}
