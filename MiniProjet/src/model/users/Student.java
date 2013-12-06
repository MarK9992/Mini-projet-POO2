package model.users;

import java.util.ArrayList;

import model.Loan;
import utils.Period;
import config.Model;

public class Student extends Borrower {

    // Constructors
    
    public Student() {
        this("S", "unknown", new ArrayList<Loan>());
    }
    
    public Student(String i, String n, ArrayList<Loan> l) {
        super(i, n, l, "student");
    }
    
    // Methods

    @Override
    public Loan book(Model m, Period p) {
            Loan l = new Loan(m, p, this);
            return l;
    }

    @Override
    public void restitute(Loan e) {
    	
    }
}
