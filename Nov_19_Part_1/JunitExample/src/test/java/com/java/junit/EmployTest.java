package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testGettersAndSetters() {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Jansu");
		employ.setGender(Gender.FEMALE);
		employ.setDept("Java");
		employ.setDesig("Programmer");
		employ.setBasic(99999);
		
		assertEquals(1, employ.getEmpno());
		assertEquals("Jansu", employ.getName());
		assertEquals(Gender.FEMALE, employ.getGender());
		assertEquals("Java", employ.getDept());
		assertEquals("Programmer", employ.getDesig());
		assertEquals(99999, employ.getBasic(), 0);
	}
	
	@Test 
	public void testToString() {
		String result = "Employ [empno=1, name=Jansu, gender=FEMALE, dept=Java, "
				+ "desig=Programmer, basic=88822.0]";
		Employ employ2 = new Employ(1, "Jansu", Gender.FEMALE, "Java", 
				"Programmer", 88822);
		assertEquals(result, employ2.toString());
	}
	@Test
	public void testConstructors() {
		Employ employ1 = new Employ();
		Employ employ2 = new Employ(1, "Jansu", Gender.FEMALE, "Java", 
				"Programmer", 88822);
		assertEquals(1, employ2.getEmpno());
		assertEquals("Jansu", employ2.getName());
		assertEquals(Gender.FEMALE, employ2.getGender());
		assertEquals("Java", employ2.getDept());
		assertEquals("Programmer", employ2.getDesig());
		assertEquals(88822, employ2.getBasic(), 0);
	}

}
