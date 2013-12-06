package controller;

import java.util.Calendar;

import model.Loan;
import model.ManagementSystem;
import model.users.Student;
import model.users.Teacher;
import utils.Period;
import view.View;
import config.Model;

public class Controller {
	private View view;
	private ManagementSystem system;

	public Controller(String nameFileInventory, String nameFileUser,String versionFiles) {
		this.view = new View();
		this.system = new ManagementSystem(nameFileInventory, nameFileUser, versionFiles);
		
	}

	public void startDemo() {
		// Welcoming display
		this.view.displayMenu();
		
		// State of the inventory and the users
		this.view.displaySystem(this.system);
		
		this.view.displayExampleMessage();
		
		// Example with a student
		Student s = this.system.getStudents().get(0);
		
		Calendar startDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		endDate.set(2013, 07, 12);
		
		Loan l = s.book(Model.IPAD3, new Period(startDate,endDate));
		this.system.checkLoan(l);
		
		this.view.displayBorrow(s, l);
		this.system.restitute(l);
		this.view.displayRestitute(s, l);
		
		// Example with a teacher
		
		Teacher t = this.system.getTeachers().get(0);
		
		Loan l2 = s.book(Model.XPERIAZ, new Period(startDate,endDate));
		this.system.checkLoan(l2);
		
		this.view.displayBorrow(t, l2);
		this.system.restitute(l2);
		this.view.displayRestitute(t, l2);
		

	}
}
