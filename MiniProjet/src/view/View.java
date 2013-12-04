package view;

import model.ManagementSystem;

public class View {
	
	public void displayMenu() {
		System.out.println("\n***** Welcome to the equipment management system *****\n");
	}
	
	public void displaySystem(ManagementSystem s) {
		System.out.println("\n\n" + s.toString());
	}
	
	
}
