package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Khloe Wright
 * @version 10/15/2023
 */


public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Default Constructor
	 */
	public IntegerSet() {
	}
	
	/**
	 * Constructor When Passing Set
	 * @param set that we want to initialize with our class
	 */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	/**
	 * Clear Method
	 * clears the internal representation of the set.
	 */
	public void clear() {
		this.set.clear();
	}
	
	/**
	 * Length Method
	 * @return the size of the set initialized with class
	 */
	public int length() {
		return this.set.size();
	}
	
	/**
	 * Equals Method
	 * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.  This overrides
     * the equal method from the Object class.
	 * @param o: the second set we are comparing to see if the two are equals
	 * @return a boolean indicating if the sets are equal or not.
	 */
	public boolean equals(Object o) {
		if (!(o instanceof IntegerSet)) {
			return false;
	    }
		
		IntegerSet setb = (IntegerSet) o;
		
		if (this.set.size() != setb.length()) {
			return false;
		}
		
		for (int i = 0; i < this.set.size(); i++) {
			int item = this.set.get(i);
			if (!setb.contains(item)) {
				return false;
			}
		}
		
		return true;

	}
	
	/**
	 * Contains Method
	 * @param value: integer we are looking for in our set
	 * @return a boolean indicating if the value is in our set or not.
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	}
	
	/**
	 * Largest Method
	 * @return the largest integer in the set.
	 * @throws IntegerSetException if the set is empty.
	 */
	public int largest() throws IntegerSetException {
		if (this.set.isEmpty()) {
			throw new IntegerSetException("set is empty");
		}
		int max = this.set.get(0);	
		for (int i = 1; i < this.set.size(); i++) {
			if (this.set.get(i) > max) {
				max = this.set.get(i);
			}
		}
		
		return max;
		
	}
	
	/**
	 * Smallest Method
	 * @return the smallest integer in the set
	 * @throws IntegerSetException if the set is empty. 
	 */
	public int smallest() throws IntegerSetException {
		if (this.set.isEmpty()) {
			throw new IntegerSetException("set is empty");
		}
		int min = this.set.get(0);
		for (int i = 1; i < this.set.size(); i++) {
			if (this.set.get(i) < min) {
				min = this.set.get(i);
			}
		}
		return min;
	}
	
	/**
	 * Add Method
	 * Adds an item to the set or does nothing it already there.
	 * @param item that we want to add into our set.
	 */
	public void add(int item) {
		if (!this.set.contains(item)) {
			this.set.add(item);		
		}
	}
	
	/**
	 * Remove method
	 * Removes an item from the set or does nothing if not there.
	 * @param item that we want to remove from our set.
	 */
	public void remove(int item) {
		if (this.set.contains(item)) {
			int index = this.set.indexOf(item);
			this.set.remove(index);
		}
	}
	
	/**
	 * Union Method
	 * Unionizes sets 1 and2 2. Saves that to set1.
	 * @param intSetb the second set we are unionizing.
	 */
	public void union(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
			int item = intSetb.set.get(i);
			if (!this.set.contains(item)) {
				this.set.add(item);		
			}
		}
	}
	
	/**
	 * Intersection
	 * Sets set1 to the intersection of set1 and set2. 
	 * @param intSetb the second set we're finding the intersection for.
	 */
	public void intersection(IntegerSet intSetb) {
		int length = this.length();
		int index = 0;
		while (length > 0) {
			int item = this.set.get(index);
			if (!intSetb.contains(item)) {
				this.remove(item);
			} else {
				index++;
			}
			length--;
		}
	}
	
	/**
	 * Difference
	 * Sets set1 to the difference of set1 - set2. 
	 * @param intSetb the second set we're taking the difference from.
	 */
	public void diff(IntegerSet intSetb) {
		int length = this.length();
		int index = 0;
		while (length > 0) {
			int item = this.set.get(index);
			if (intSetb.contains(item)) {
				this.remove(item);
			} else {
				index++;
			}
			length--;
		}
	}
	
	/**
	 * Complement
	 * Sets set1 to all elements that are not in set1 that are in intSetn.
	 * @param intSetb the second set we want to complement.
	 */
	public void complement(IntegerSet intSetb) {
		int length = this.set.size();
		for (int i = 0; i < intSetb.length(); i++) {
			int item = intSetb.set.get(i);
			if (!this.set.contains(item)) {
				this.set.add(item);
			}
		}
		
		while (length > 0) {
			this.set.remove(0); // removing index 0 
			length--;
		}
	}
	
	/**
	 * Empty
	 * @return a boolean to see if set is empty.
	 */
	boolean isEmpty() {
		return this.set.isEmpty();
	}
	
	/**
	 * toString
	 * turns our set (ArrayList) into a string.
	 * @return a string version of our set.
	 */
	public String toString() {
		return this.set.toString();
	}

}
