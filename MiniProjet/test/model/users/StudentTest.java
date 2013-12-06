package model.users;

import model.ManagementSystem;

import org.junit.Test;

import utils.Period;

import config.Model;

public class StudentTest {

	@Test
	public void book() {
		ManagementSystem m = new ManagementSystem("inventory", "users", "v1");
		Student t = new Student();
		m.checkLoan(t.book(Model.XPERIAZ, new Period()));
		System.out.println(m.toString());

	}

}
