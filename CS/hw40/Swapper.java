/*Kyle Tau
APCS1 pd 2
HW 38 -- Put It Together
2017-11-21*/

/* This class first initializes a 10x10 array of Strings, with each element being the row number repeated twice and the column number repeated twice. This allows us to easily see later on which values have swapped (by looking at the row and column values). The initialize() method creates the array with the specified elements. The print() method prints out the array. The swap() method takes in user input for the row and column of the two places that the user wants to swap. The program ends after 1 swap.
 */

/* I added labels to the rows and columns when printing the array out. I also added a checking function replace() that makes sure the user inputs a usable number for this array. */

import cs1.Keyboard;

public class Swapper {
    public int row1 = -1;
    public int row2 = -1;
    public int column1 = -1;
    public int column2 = -1;

    String[][] array = new String[10][10];
    
    public void initialize() {
	for (int r = 0; r < array.length; r++) {
	    for (int c = 0; c < array[0].length; c++) {
		array[r][c] = "" + r + r + c + c; }
	}
    }
    
    public void print() {
	System.out.print("     ");
	for (int c = 0; c < array.length; c++) {
	    System.out.print("Col" + c + "  "); }
	System.out.print("\n\n");
	for(int r = 0; r < array.length; r++) {
	    //for(String[] r: array){
	    System.out.print("Row" + r);
	    for(String j: array[r]){//element j in row r
		System.out.print(" " + j + " ");
	    }
	    System.out.print("\n\n");
	}
    }
    
    public void replace(int k) {
	k = Keyboard.readInt();
	while (k < 0 || k > 10) {
	    System.out.println("PLEASE ENTER A NUMBER IN THE INTERVAL [0,9]");
	    k = Keyboard.readInt();
	}
    }
    
    public void swap() {
	System.out.println("Location of 1st String (Row)");
	replace(row1);
	System.out.println("Location of 1st String (Column)");
	replace(column1);
	System.out.println("Location of 2nd String (Row)");
	replace(row2);
	System.out.println("Location of 2nd String (Column)");
	replace(column2);
	System.out.println("\nSwap: "+array[row1][column1]+" and "+array[row2][column2]+"\n");
	String temp = array[row1][column1];
	array[row1][column1] = array[row2][column2];
	array[row2][column2] = temp;
	print();
    }
	
    
    public static void main(String[] args) {
	Swapper a = new Swapper();
	a.initialize();
	a.print();
	a.swap();
    }
}
