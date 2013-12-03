package model;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import model.equipment.Equipment;
import model.equipment.Ipad3;
import model.equipment.Vengeance2100;
import model.equipment.XperiaZ;

import org.junit.Test;

public class InventoryTest {

	@Test
	public void addTest() {	
		Inventory r = new Inventory();
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());

		assertEquals(3, r.getNumberElements());
		System.out.println(r.toString());
	}
	
	@Test
	public void removeTest() {
		Ipad3 ip = new Ipad3();
		Vengeance2100 v = new Vengeance2100();
		
		Inventory r = new Inventory();
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		
		assertEquals(3, r.getNumberElements());
		System.out.println(r.toString());
		
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(ip);
		r.addEquipment(v);
		
		assertEquals(7, r.getNumberElements());
		System.out.println(r.toString());
		
		r.removeEquipment(ip);
		r.removeEquipment(v);
		
		assertEquals(5, r.getNumberElements());
		System.out.println(r.toString());
	}
	
	@Test
	public void getNumberElementsTest() {
		Inventory r = new Inventory();
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		
		assertEquals(3, r.getNumberElements());
		
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		
		assertEquals(5, r.getNumberElements());
	}
	
	@Test
	public void isInStockTest() {
		Ipad3 ip = new Ipad3();
		Ipad3 ip2 = new Ipad3();
		Vengeance2100 v = new Vengeance2100();
		
		Inventory r = new Inventory();
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(ip);
		r.addEquipment(v);
		
		assertEquals(true, r.isInStock(ip));
		assertEquals(false, r.isInStock(ip2));
		assertEquals(true, r.isInStock(v));
	}
	
	@Test
	public void findEquipmentTest() {
		Ipad3 ip = new Ipad3();
		Ipad3 ip2 = new Ipad3();
		Vengeance2100 v = new Vengeance2100();
		
		Inventory r = new Inventory();
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(new XperiaZ());
		r.addEquipment(ip);
		r.addEquipment(v);
		
		Ipad3 e1 =  (Ipad3) r.findEquipment(ip);
		Vengeance2100 e2 =  (Vengeance2100) r.findEquipment(v);
		
		assertEquals(true, e1.equals(ip));
		assertEquals(true, e2.equals(v));
		assertNull(r.findEquipment(ip2));
	}

}
