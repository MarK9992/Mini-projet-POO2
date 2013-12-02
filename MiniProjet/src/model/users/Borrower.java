package model.users;

import java.util.ArrayList;

import model.Loan;

public abstract class Borrower extends User {
    
    // Fields
    
    private ArrayList<Loan> loanList;
    
    // Constructors
    
    public Borrower() {
        this("B", "unknown", new ArrayList<Loan>());
    }
    
    public Borrower(String i, String n, ArrayList<Loan> l) {
        super(i, n);
        loanList = l;
    }

    // Methods
    
    public abstract void borrow();
    public abstract void restitute();
    
    public String toString() {
        return super.toString()+", loan list: "+loanList;
    }
    
    // Getters and setters

    public ArrayList<Loan> getLoanList() {
        return loanList;
    }
}
