package model.users;

import java.util.ArrayList;

import model.Loan;

import config.TeacherConstants;

public class Teacher extends Borrower implements TeacherConstants {

    // Constructors
    
    public Teacher() {
        this("T", "unknown", new ArrayList<Loan>());
    }
    
    public Teacher(String i, String n, ArrayList<Loan> l) {
        super(i, n, l);
    }

    // Methods
    
    @Override
    public void borrow() {
        // TODO Auto-generated method stub
	    
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
