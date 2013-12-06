package model.users;

import java.util.ArrayList;

import model.Loan;
import utils.Period;
import config.Model;

public class Teacher extends Borrower {

    // Constructors
    
    public Teacher() {
        this("T", "unknown", new ArrayList<Loan>());
    }
    
    public Teacher(String i, String n, ArrayList<Loan> l) {
        super(i, n, l, "teacher");
    }

    // Methods
    
    @Override
    public Loan book(Model m, Period p) {
        Loan l = new Loan(m, p, this);
        
        return l;
    }

    @Override
    public void restitute(Loan e) {
        // TODO Auto-generated method stub
        
    }
}
