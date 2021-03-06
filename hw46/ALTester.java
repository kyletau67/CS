/*Kyle Tau
APCS1 pd 2
HW46 -- Al<B> Sorted! 
2017-12-4*/

import java.util.ArrayList;

public class ALTester {

    public static void populate(ArrayList<Comparable> a) {
	for (int i = 0; i < 23; i++) {
	    a.add((int) (Math.random() * 10)); //add a number (0-9) 23 times
	}
    }

    public static boolean sorted(ArrayList<Comparable> a) {
	boolean s = false;
	for (int i = 0; i < 22; i++) {
	    if (a.get(i).compareTo(a.get(i+1)) <= 0) {
		s = true; }
	    else if (a.get(i).compareTo(a.get(i+1)) > 0) {
		s = false;
		break; //once false, a is not sorted
	    }
	}
	return s;
	
    }
	
    public static void main(String[] args) {
	ArrayList<Comparable> array = new ArrayList<Comparable>();
      	populate(array);
	System.out.println(array.size()); //23
	System.out.println(array); //contents of array
	System.out.println(sorted(array)); 
			   
    }
}
