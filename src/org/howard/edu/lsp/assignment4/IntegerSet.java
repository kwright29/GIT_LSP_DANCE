package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	// Default Constructor
	public IntegerSet() {
	}
	
	// Constructor if you want to pass in already initialized 
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	//Clears the internal representation of the set
	public void clear() {
		this.set.clear();
	}
	
	//Returns length of the set
	public int length() {
		return this.set.size();
	}
	
	/*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.  This overrides
     * the equal method from the Object class.
     */
	public boolean equals(Object o) {
		//TODO implement method
		return false;
	}
	
	//Returns true if the set contains the value
	public boolean contains(int value) {
		return this.set.contains(value);
	}
	
	//Returns largest item in the set; Throws a IntegerSetException if the set is empty
	public int largest() throws IntegerSetException {
		if (this.set.isEmpty()) {
			throw new IntegerSetException();
		}
		int max = this.set.get(0);	
		for (int i = 1; i < this.set.size(); i++) {
			if (this.set.get(i) > max) {
				max = this.set.get(i);
			}
		}
		
		return max;
		
	}
	
	//Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException {
		if (this.set.isEmpty()) {
			throw new IntegerSetException();
		}
		int min = this.set.get(0);
		for (int i = 1; i < this.set.size(); i++) {
			if (this.set.get(i) < min) {
				min = this.set.get(i);
			}
		}
		return min;
	}
	
	// Adds an item to the set or does nothing it already there	
	public void add(int item) {
		if (!this.set.contains(item)) {
			this.set.add(item);		
		}
	}
	
	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		if (this.set.contains(item)) {
			this.set.remove(item);
		}
	}
	
	// Set union
	public void union(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
			int item = this.set.get(i);
			if (!this.set.contains(item)) {
				this.set.add(item);		
			}
		}
		// TODO return string of current set
	}
	
	// Set intersection, all elements in s1 and s2
	public void intersection(IntegerSet intSetb) {
		for (int i = 0; i < this.set.size(); i++) {
			int item = intSetb.set.get(i);
			if (!intSetb.contains(item)) {
				this.set.remove(item);
			}
		}
		// TODO return string of current set
	}
	
	// Set difference
	public void diff(IntegerSet intSetb) {
		for (int i = 0; i < this.set.size(); i++) {
			int item = this.set.get(i);
			if (intSetb.contains(item)) {
				this.set.remove(item);	}
		}
		// TODO return string of current set
	}
	

}
