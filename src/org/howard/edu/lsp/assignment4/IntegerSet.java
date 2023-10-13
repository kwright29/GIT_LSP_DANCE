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
}
