package model.users;

import java.util.ArrayList;

import model.Loan;
import utils.Period;
import config.Model;

public abstract class Borrower extends User {
    
    // Fields
    
    private ArrayList<Loan> loanList = new ArrayList<Loan>() ;
    private final String type;
    
    // Constructors

	public Borrower() {
        this("B", "unknown", new ArrayList<Loan>(), "unknown");
    }
    
    public Borrower(String i, String n, ArrayList<Loan> l, String t) {
        super(i, n);
              
        this.loanList = l;
        type = t;
    }

    // Methods
    
    public abstract Loan book(Model m, Period p);
    public abstract void restitute(Loan e);
    
    public String toString() {
        return super.toString()+", loan list: "+loanList;
    }
    
    // Getters and setters
    public void setLoanList(ArrayList<Loan> loanList) {
    	this.loanList = loanList;
    }
    
    public ArrayList<Loan> getLoanList() {
        return loanList;
    }
    
    public String getType() {
        return type;
    }
}
