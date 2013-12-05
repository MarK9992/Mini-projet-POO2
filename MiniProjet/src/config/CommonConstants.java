package config;

import java.util.ArrayList;

import model.Inventory;
import model.users.Borrower;
import model.users.Manager;

public interface CommonConstants {
    ArrayList<Manager> MANAGERLIST = new ArrayList();
    ArrayList<Borrower> BORROWERLIST = new ArrayList();
    Inventory INVENTORY = new Inventory();
    Manager DEFAULTMANAGER = MANAGERLIST.get(0);
}
