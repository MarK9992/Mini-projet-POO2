/**
 * @author Anaïs
 */
package view;

import model.Loan;
import model.ManagementSystem;
import model.users.User;

public class View {

	public void displayMenu() {
		System.out
		        .println("***** Welcome to the equipment management system *****\n");
		System.out.println("This is the state of the system :\n");
	}

	public void displaySystem(ManagementSystem s) {
		System.out.println("\n" + s.toString());
	}

	public void displayBorrow(User u, Loan l) {
		System.out.println("\n" + u.toString());
		System.out.println("borrows :");
		System.out.println(l.toString());
	}

	public void displayRestitute(User u, Loan l) {
		System.out.println("\n" + u.toString());
		System.out.println("restitutes :");
		System.out.println(l.toString());
	}

	public void displayExampleMessage() {
		System.out
		        .println("This is an example of borrowing and restituting :");

	}
}
