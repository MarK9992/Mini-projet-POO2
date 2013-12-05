package model.users;

import java.util.Calendar;

import utils.Period;
import config.BorrowerConstants;
import model.Inventory;
import model.Loan;
import model.equipment.Equipment;

public class Manager extends User implements BorrowerConstants {
    
    // Constructors
    
    public Manager() {
        this("M", "unknown");
    }
    
    public Manager(String i, String n) {
        super(i, n);
    }
    
    // Methods
    
    /**
     * Returns true and sets the unavailabalityPeriod of the equipment 
     * if the loan is valid or false if not.
     * @param l
     * @param i
     * @return
     */
    public boolean checkLoan(Loan l, final Inventory i) {
        Borrower bwer = l.getBorrower();
        Period period = l.getPeriod();
        Equipment stuff = i.findAvailableEquipment(l.getModel());
        final int LOAN_DURATION_LIMIT;
        final int LOAN_RESERVATION_LIMIT;
        
        // Checks if the loan is valid
        if(stuff == null)
            return false;
        if(bwer.getType().equals("teacher"))
        {
            LOAN_DURATION_LIMIT = TEACHER_LOAN_DURATION_LIMIT;
            LOAN_RESERVATION_LIMIT = TEACHER_LOAN_RESERVATION_LIMIT;
        }
        else {
            LOAN_DURATION_LIMIT = STUDENT_LOAN_DURATION_LIMIT;
            LOAN_RESERVATION_LIMIT = STUDENT_LOAN_RESERVATION_LIMIT;
        }
        if(period.getDuration() > LOAN_DURATION_LIMIT
                || period.daysFromNow() > LOAN_RESERVATION_LIMIT)
            return false;
        
        // Updates the stuff, the loan and the borrower
        stuff.getUnavailabalityPeriods().add(period);
        l.setEquipmentID(stuff.getId());
        bwer.getLoanList().add(l);
        
        return true;
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
