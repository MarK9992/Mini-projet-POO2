package model.users;

import java.util.ArrayList;
import model.ManagementSystem;

import model.Loan;

import config.Model;
import config.StudentConstants;

public class Student extends Borrower implements StudentConstants {

    // Constructors
    
    public Student() {
        this("S", "unknown", new ArrayList<Loan>());
    }
    
    public Student(String i, String n, ArrayList<Loan> l) {
        super(i, n, l);
    }
    
    // Methods

    @Override
    public void borrow(Model m) {
        // TODO Auto-generated method stub
            
    }

    @Override
    public void restitute() {
        // TODO Auto-generated method stub
        
    }
    
    // Main
    
    public static void main(String[] args) {
        Student s1 = new Student();
        
        System.out.println(s1);
    }
}
