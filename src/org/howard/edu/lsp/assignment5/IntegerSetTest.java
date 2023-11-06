package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Khloe Wright
 * @version 11/06/2023
 */

public class IntegerSetTest {
	
	private IntegerSet set0;
	private IntegerSet set1;
	private IntegerSet set2;
	private IntegerSet set3;
	private IntegerSet set4;
	
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
		
		set3 = new IntegerSet();
		set3.add(4);
		set3.add(8);
		set3.add(12);
		
		set4 = new IntegerSet();
		set4.add(4);
		set4.add(8);
		set4.add(12);
	
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
		
		//removing an element and checking length
		set1.remove(2);
		assertEquals(set1.length(), 2);
		
		//checking length of empty set
		assertEquals(set0.length(), 0);
	}
	
	@Test
	@DisplayName("test equal")
	public void testEqual() {
		assertTrue(set3.equals(set4) == true);
		assertTrue(set2.equals(set3) == false);
	}
	
	@Test
	@DisplayName("test contains")
	public void testContains() {
		assertEquals(set1.contains(6), false);
		assertEquals(set1.contains(1), true);
		assertEquals(set0.contains(0), false);
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
		//getting largest from empty set
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
		// getting smallest from empty set
		Throwable exception = assertThrows(IntegerSetException.class, () -> set0.smallest());
		assertNotNull(exception.getMessage());
		assertEquals("set is empty", exception.getMessage());
	}
	
	@Test
	@DisplayName("test add")
	public void testAdd() {
		//adding to empty set
		set0.add(4);
		assertEquals(set0.toString(), "[4]");
		
		set1.add(4);
		assertEquals(set1.toString(), "[1, 2, 3, 4]");
	}
	
	@Test
	@DisplayName("test remove")
	public void testRemove() {
		//removing from an empty set-- does nothing
		set0.remove(34);
		assertEquals(set0.toString(), "[]");
		
		set2.remove(6);
		assertEquals(set2.toString(), "[3, 9]");
		
		//removing an element that isn't there
		set1.remove(5);
		assertEquals(set1.toString(), "[1, 2, 3]");
	}
	
	@Test
	@DisplayName("test union")
	public void testUnion() {
		set1.union(set2);
		assertEquals(set1.toString(), "[1, 2, 3, 6, 9]");
		
		//unionizing with an empty set
		set0.union(set3);
		assertEquals(set0.toString(), "[4, 8, 12]");
		
		//unionizing with two equal sets
		set3.union(set4);
		assertEquals(set3.toString(), "[4, 8, 12]");
	}
	
	@Test
	@DisplayName("test intersection")
	public void testIntersection() {
		set1.intersection(set2);
		assertEquals(set1.toString(), "[3]");
		
		//checking two sets that have no alike elements
		set2.intersection(set3);
		assertEquals(set2.toString(), "[]");
		
		//intersection with two equal sets
		set3.intersection(set4);
		assertEquals(set3.toString(), "[4, 8, 12]");
	}
	
	@Test
	@DisplayName("test difference")
	public void testDiff() {
		//testing difference with an empty set
		set2.diff(set0);
		assertEquals(set2.toString(), "[3, 6, 9]");
		
		set1.diff(set2);
		assertEquals(set1.toString(), "[1, 2]");
		
		// getting difference from two equal sets
		set3.diff(set4);
		assertEquals(set3.toString(), "[]");
	}
	
	@Test
	@DisplayName("test complement")
	public void testComplement() {
		set1.complement(set2);
		assertEquals(set1.toString(), "[6, 9]");
		
		//complement of two sets that have no alike elements
		set2.complement(set3);
		assertEquals(set2.toString(), "[4, 8, 12]");
		
		//complement of two alike sets
		set3.complement(set4);
		assertEquals(set3.toString(), "[]");
	}
	
	@Test
	@DisplayName("test isEmpty")
	public void testIsEmpty() {
		assertTrue(set0.isEmpty() == true);
		assertTrue(set3.isEmpty() == false);
	}
	
	@Test
	@DisplayName("test toString") 
	public void testToString() {
		assertEquals(set0.toString(), "[]");
		assertEquals(set2.toString(), "[3, 6, 9]");
	}
	

}
