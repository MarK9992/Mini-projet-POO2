package controller;

import model.ManagementSystem;
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

	}
}
