/* Kyle Tau
APCS1 pd 2
HW51 -- Selection
2017-12-11 */

/***************************************
 * class SelectionSort -- implements SelectionSort algorithm
 ***************************************/

import java.util.ArrayList;

public class SelectionSort 
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data ) 
  {
      for (int p = 1; p < data.size(); p++) {
	  System.out.println("pass "+p);
	  int loInd = p-1;//the starting point of the search
	  for (int i = p-1; i < data.size()-1; i++) {
	      //System.out.println("index "+i);
	      if (data.get(loInd).compareTo(data.get(i+1)) > 0) {
		  loInd = i+1; //replace loInd with the index of the smallest value
	      }
	      //System.out.println(data.get(loInd));
	      //at the latest occurence, this should print out the lowest value in the array from p-1 to the last index
	  }
	  if (!(loInd == p-1)) {//if the lowest val is not already in place
	      data.set(p-1, data.set(loInd, data.get(p-1)));
	      //System.out.println("Swapped");
	      //System.out.println(data);
	      }
      }
  }//end selectionSortV


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable>
    selectionSort( ArrayList<Comparable> input ) 
  {
      ArrayList<Comparable> foo = new ArrayList<Comparable>();//copy of input
      for (Comparable i : input) {
	  foo.add(i); }//copy values
      selectionSortV(foo);//selectionsort on copy
      return foo; 
  }//end selectionSort 


  public static void main( String [] args ) 
  {
          /*===============for VOID methods=============
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );


      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      selectionSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );

      ============================================*/


    	ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n" 
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n" 
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
          /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class SelectionSort
