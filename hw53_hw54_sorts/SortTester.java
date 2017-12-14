/* Team aefHiKlsy (Hasif Ahmed, Kyle Tau)
   APCS1 pd 2
   HW53 -- Solid Comparative Analysis
   2017-12-13 */

import java.util.ArrayList;

public class SortTester {
    public static ArrayList<Comparable> inAscent(ArrayList<Comparable> data) {
	//sets up data in ascending order
	MySorts.silentSort(data);
	return data;
	
    }
    public static ArrayList<Comparable> inDescent(ArrayList<Comparable> data) {
	//sets up data in descending order
        MySorts.silentSort(data);
	ArrayList<Comparable> copy = new ArrayList<Comparable>();//copy of data
	for (Comparable i: data) {
	    copy.add(0,i); }
	return copy;
    }
    public static void SOP(ArrayList<Comparable> x) {
	System.out.println(x);
    }
    public static void main(String[] args) {
	ArrayList<Comparable> data = new ArrayList<Comparable>();
	SOP(data);    
	data = MySorts.populate(10, 0, 100); //creates elements
	SOP(data);
  
	System.out.println("==========BubbleSort Tests:==========");
	ArrayList<Comparable> bestCaseBub = new ArrayList<Comparable>();
	ArrayList<Comparable> worstCaseBub = new ArrayList<Comparable>();
	bestCaseBub = inAscent(data);
	worstCaseBub = inDescent(data);
	System.out.println("==========BEST CASE==========");
	MySorts.bubbleSort(bestCaseBub);
	//best case is the list being already sorted, minimal swaps
	System.out.println("==========WORST CASE==========");
	//worst case is the list being reversely sorted, maximum swaps
	MySorts.bubbleSort(worstCaseBub);
	System.out.println("==========END BubbleSort TESTS==========");
	//have to iterate through whole list anyway, the case difference is in # of swaps
	
	System.out.println("==========SelectionSort Tests:==========");
	ArrayList<Comparable> bestCaseSel = new ArrayList<Comparable>();
	ArrayList<Comparable> worstCaseSel = new ArrayList<Comparable>();
	bestCaseSel = inAscent(data);
	worstCaseSel = inDescent(data);
	System.out.println("==========BEST CASE==========");
	MySorts.selectionSort(bestCaseSel);
	//best case is the list being already sorted, minimal swaps
	System.out.println("==========WORST CASE==========");
	//worst case is the list being reversely sorted, have to do more swaps
	MySorts.selectionSort(worstCaseSel);
	System.out.println("==========END SelectionSort TESTS==========");
	//have to iterate through whole list anyway, the case difference is in # of swaps

	System.out.println("==========InsertionSort Tests:==========");
	ArrayList<Comparable> bestCaseIns = new ArrayList<Comparable>();
	ArrayList<Comparable> worstCaseIns = new ArrayList<Comparable>();
	bestCaseIns = inAscent(data);
	worstCaseIns = inDescent(data);
	System.out.println("==========BEST CASE==========");
	MySorts.insertionSort(bestCaseIns);
	//best case is the list being already sorted, minimal swaps
	System.out.println("==========WORST CASE==========");
	//worst case is the list being reversely sorted, have to do more swaps
	MySorts.insertionSort(worstCaseIns);
	System.out.println("==========END InsertionSort TESTS==========");
	//have to iterate through whole list anyway, the case difference is in # of swaps
    }
	
}
