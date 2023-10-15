package org.howard.edu.lsp.assignment4;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		//testing smallest and largest
		System.out.println("Value of Set 1 is: " + set1.toString());
		System.out.println("Smallest Value in Set 1: " + set1.smallest());
		System.out.println("Largest Value in Set 1: " + set1.largest());
		System.out.println();
		
		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		
		// testing union 
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set 1 is: " + set1.toString());
		System.out.println("Value of Set 2 is: " + set2.toString());
		set1.union(set2);
		System.out.println("Result of Union of Set 1 and Set 2: " + set1.toString());
		System.out.println();
		
		


	}

}
