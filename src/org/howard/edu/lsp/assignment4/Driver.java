package org.howard.edu.lsp.assignment4;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		IntegerSet set0 = new IntegerSet();
		set0.add(2);
		set0.add(4);
		set0.add(6);
		
		// testing length, contains, clear, remove, and isEmpty
		System.out.println("Value of Set 0 is: " + set0.toString());
		System.out.println("Length of Set 0 is: " + set0.length());
		System.out.println("True of False -> Set 0 contains the number 8: " + set0.contains(8));
		set0.remove(4);
		System.out.println("Value of Set 0 is: " + set0.toString());
		set0.clear();
		System.out.println("Value of Set 0 is: " + set0.toString());
		System.out.println("True or False -> Set 0 is empty: " + set0.isEmpty());
		System.out.println();
		
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
		
		IntegerSet set3 = new IntegerSet();
		set3.add(3);
		set3.add(6);
		set3.add(9);
		set3.add(12);
		
		IntegerSet set4 = new IntegerSet();
		set4.add(4);
		set4.add(8);
		set4.add(12);
		set4.add(16);

		// testing intersection
		System.out.println("Intersection of Set3 and Set4");
		System.out.println("Value of Set 3 is: " + set3.toString());
		System.out.println("Value of Set 4 is: " + set4.toString());
		set3.intersection(set4);
		System.out.println("Result of Intersection of Set 3 and Set 4: " + set3.toString());
		System.out.println();




		
		

		



	}

}
