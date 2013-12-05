package model.users;

import java.util.ArrayList;

import utils.Period;

import model.Loan;

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
    public void restitute() {
        // TODO Auto-generated method stub
        
    }
    
    // Main
    
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        
        System.out.println(t1);
    }
}
