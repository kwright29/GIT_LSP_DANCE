package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	
	private IntegerSet set0;
	private IntegerSet set1;
	private IntegerSet set2;
	
	@BeforeEach
	void setUp() {
		set0 = new IntegerSet();
		
		set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2 = new IntegerSet();
		set2.add(3);
		set2.add(6);
		set2.add(9);
	
	}
	
	@Test
	@DisplayName("test clear")
	public void testClear() {
		set1.clear();
		assertTrue(set1.isEmpty() == true);
		assertTrue(set2.isEmpty() == false);
	}
	
	@Test
	@DisplayName("test length")
	public void testLength() {
		assertEquals(set1.length(), 3);
		assertEquals(set0.length(), 0);
	}
	
	@Test
	@DisplayName("test contains")
	public void testContains() {
		assertEquals(set1.contains(6), false);
		assertEquals(set1.contains(1), true);
	}
	
	@Test
	@DisplayName("test largest")
	public void testLargest() throws IntegerSetException {
		assertEquals(set1.largest(), 3);
		assertEquals(set2.largest(), 9);
	}
	
	@Test
	@DisplayName ("test largest, throws exception")
	public void testLargest_throwsException() throws IntegerSetException {
		Throwable exception = assertThrows(IntegerSetException.class, () -> set0.largest());
		assertNotNull(exception.getMessage());
		assertEquals("set is empty", exception.getMessage());
	}
	
	@Test
	@DisplayName("test smallest")
	public void testSmallest() throws IntegerSetException {
		assertEquals(set1.smallest(), 1);
		assertEquals(set2.smallest(), 3);
	}
	
	@Test
	@DisplayName ("test smallest, throws exception")
	public void testSmallest_throwsException() throws IntegerSetException {
		Throwable exception = assertThrows(IntegerSetException.class, () -> set0.smallest());
		assertNotNull(exception.getMessage());
		assertEquals("set is empty", exception.getMessage());
	}
	
	@Test
	@DisplayName("test add")
	public void testAdd() {
		set0.add(4);
		set1.add(4);
		assertEquals(set0.toString(), "[4]");
		assertEquals(set1.toString(), "[1, 2, 3, 4]");
	}
	
	@Test
	@DisplayName("test remove")
	public void testRemove() {
		set2.remove(6);
		assertEquals(set2.toString(), "[3, 9]");
		
		set1.remove(5);
		assertEquals(set1.toString(), "[1, 2, 3]");
	}
	
	

}
