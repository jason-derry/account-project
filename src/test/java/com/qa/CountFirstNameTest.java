//package com.qa;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Before;
//import org.junit.Test;
//
//public class CountFirstNameTest {
//	
//	AccountService ac1 = new AccountService();
//	
//	@Before
//	public void addNames() {
//		ac1.addAccount("Jeff", "Bridges");
//		ac1.addAccount("Jeremy", "Kyle");
//		ac1.addAccount("Jeff", "Dunham");
//		ac1.addAccount("Jeremy", "Clarkson");
//		ac1.addAccount("Jeff", "Bezos");
//		ac1.addAccount("Michael", "Scarn");
//		ac1.addAccount("Jeff", "Goldblum");
//	}
//	@Test public void testCountFirstName() {
//		assertEquals(4, ac1.countFirstName("jeff"));
//	}
//	
//	@Test public void testCountFirstName2() {
//		assertEquals(2, ac1.countFirstName("jeremy"));
//	}
//	
//	@Test public void testCountFirstName3() {
//		assertEquals(1, ac1.countFirstName("michael"));
//	}
//	
//
//}
