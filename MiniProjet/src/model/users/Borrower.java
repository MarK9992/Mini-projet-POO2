package model.users;

public abstract class Borrower extends User{
	
	public Borrower(String i, String n) {
	    super(i, n);
    }
	
	public abstract void borrow();
	public abstract void restitute();
}
