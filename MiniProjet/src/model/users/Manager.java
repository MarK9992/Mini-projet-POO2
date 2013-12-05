package model.users;

import config.BorrowerConstants;
import model.Loan;

public class Manager extends User implements BorrowerConstants {
    
    // Constructors
    
    public Manager() {
        this("M", "unknown");
    }
    
    public Manager(String i, String n) {
        super(i, n);
    }
    
    // Methods
    
    public void checkLoan(Loan l) {

    }
    
    public void putAway(Loan l) {
        // TODO
    }
    
    // Main
    
    public static void main(String[] args) {
        Manager m1 = new Manager();
        
        System.out.println(m1);
    }
}
