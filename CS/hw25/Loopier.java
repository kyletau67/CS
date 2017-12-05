/* Kyle Tau
   APCS1 pd 2
   HW 25 -- All Hallow's Eve
   2017-10-31 */

public class Loopier {
    public static void populate(int[] a) {
	int i = 0;
	while (i < a.length) {
	    a[i] = (int) (Math.random() * 10000000);
	    i++; //for each index, overwrite with number Math.random() * 10mil
	}
    }

    public static String printA(int[] a) {
	String s = "{"; //opening bracket
	for (int i = 0; i < a.length; i++) {
	    if (i < a.length - 1) {
		s += a[i] + ", ";} //comma inbetween values
	    else {
		s += a[i]; }//last value, no comma
	}
        return s + "}"; //closing bracket
    }
    
    public static int linSearch(int[] a, int target) {
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == target) {
		return i;} //loops through array, returns index when the element is equal to the target
	}
	return -1;
    }

    public static int[] breakarray(int[] a) {
	int[] newA = new int[a.length-1];//one less than array a
	if (a.length > 1) {
	    for (int i = 1; i <= a.length - 1; i++) {
		newA[i-1] = a[i]; //new array is filled with numbers of a from index 1 to the end
	    }}
	return newA; } //new array
    
    public static int linSearchR(int[] a, int target) {
	if (a.length == 0) {
	    return -1; } //doesn't exist
	else if (linSearchR(breakarray(a), target) == -1){
	    return -1; } //doesn't exist either
	else if (a[0] == target) {
	    return 0; } //don't increase index
	else { 
	    return 1 + linSearchR(breakarray(a), target); } //increase index by 1
    }

    public static int freq(int[] a, int target) {
	int freq = 0;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == target) {
		freq += 1; }}//increase freq by 1 when target is found
	return freq;
    }

    public static int freqRec(int[] a, int target) {
	if (a.length == 0) {
	    return 0; } //no frequency in empty array, end of function
	else if (a[0] == target) {
	    return 1 + freqRec(breakarray(a), target); } //frequency added by 1, continue to next index 
	else {
	    return 0 + freqRec(breakarray(a), target); } //not found, still continue to next index
    }
    
    public static void main(String[] args) {
	Loopier me = new Loopier();
	int[] a = new int[10]; //array of ten
	int[] b = new int[5]; //array of five
	me.populate(a);
	me.populate(b);
	System.out.println("========================");
	System.out.println("tests on array a:");
	System.out.println("print a: " + me.printA(a));
	System.out.println("freqRec of 0: " + me.freqRec(a, 0)); //frequency of 0
	a[5] = 0;
	System.out.println("print a: " + me.printA(a));
	System.out.println("After changing element 0 to 0:");
	System.out.println("linSearch -1: " + me.linSearch(a, -1)); //-1
	System.out.println("linSearch 0: " + me.linSearch(a, 0)); //0
	System.out.println("freqRec 0: " + me.freqRec(a, 0));//frequency of 0: at least 1
	System.out.println("freq 0: " + me.freq(a, 0));//same as freqRec
	System.out.println("========================");

	System.out.println("tests on array b:");
	System.out.println("print b: " + me.printA(b));
	System.out.println("freqRec 5: " + me.freqRec(a, 5));//frequency of 5
	System.out.println("After changing elements 0, 1 to 5:");
	b[0] = 5;
	b[1] = 6;
	System.out.println("print b: " + me.printA(b));
	System.out.println("linSearchR 5: " + me.linSearchR(b, 5)); //0
	System.out.println("freqRec 5: " + me.freqRec(b, 6));//frequency of 5: at least 2
	System.out.println("freq 5: " + me.freq(b, 5));//same as freqRec
	System.out.println("========================");
	
    }//end main()
}//end Loopier
