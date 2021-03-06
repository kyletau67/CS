/*Kyle Tau
APCS1 pd 2
HW 38 -- Put It Together
2017-11-21*/

/* This class first initializes a 5x5 array of Strings, with each element being the row number repeated twice and the column number repeated twice. This allows us to easily see later on which values have swapped (by looking at the row and column values). The initialize() method creates the array with the specified elements. The print() method prints out the array. The swap() method takes in user input for the row and column of the two places that the user wants to swap. The program ends after 1 swap.
 */

import cs1.Keyboard;

public class Swapper {
    public int row1;
    public int row2;
    public int column1;
    public int column2;

    String[][] array = new String[5][5];
    public void initialize() {
	for (int r = 0; r < array.length; r++) {
	    for (int c = 0; c < array[0].length; c++) {
		array[r][c] = "" + r + r + c + c; }
	}}
    public void print() {
	for(String[] r: array){
	    for(String j: r){//element j in row r
		System.out.print(" "+j);
	    }
	    System.out.print("\n\n");
	}

    }
    public void swap() {
	System.out.println("Location of 1st String (Row)");
	row1 = Keyboard.readInt();
	System.out.println("Location of 1st String (Column)");
	column1 = Keyboard.readInt();
	System.out.println("Location of 2nd String (Row)");
	row2 = Keyboard.readInt();
	System.out.println("Location of 2nd String (Column)");
	column2 = Keyboard.readInt();
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
