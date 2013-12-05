package model.users;

import java.util.ArrayList;

import utils.Period;

import config.Model;

import model.Loan;

public abstract class Borrower extends User {
    
    // Fields
    
    private ArrayList<Loan> loanList;
    private final String type;
    
    // Constructors
    
    public Borrower() {
        this("B", "unknown", new ArrayList<Loan>(), "unknown");
    }
    
    public Borrower(String i, String n, ArrayList<Loan> l, String t) {
        super(i, n);
        loanList = l;
        type = t;
    }

    // Methods
    
    public abstract Loan book(Model m, Period p);
    public abstract void restitute();
    
    public String toString() {
        return super.toString()+", loan list: "+loanList;
    }
    
    // Getters and setters

    public ArrayList<Loan> getLoanList() {
        return loanList;
    }
    
    public String getType() {
        return type;
    }
}
