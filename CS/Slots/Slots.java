/*****************************************************
 * Kyle Tau
 * APCS1 pd 02
 * HW 26 -- Spin Class
 * 2017-11-03
 *****************************************************/

public class Slots
{

    private static final String[] FRUITS = {
	"lime", "lime", "lime", 
	"lemon", "lemon", "lemon", 
	"cherry", "cherry", "cherry", 
	"orange", "orange", "orange", 
	"grapefruit", "grapefruit", "grapefruit", 
	"tangerine", "tangerine", "tangerine", 
	"ugli", "ugli", "ugli",
	"peach", "peach", "peach"
    };
  
    private String[] _fruits; //to be init'd by each instance

    public static String[] copy(String[] a) {
	String[] newA = new String[a.length];
	for (int i = 0; i < a.length; i++) {
	    newA[i] = a[i]; //copy each value into the same index of the new array
	}
        return newA; 
    }

    public static String printA(String[] a, int up, int down) {
	//goes from "down" to up to but not including "up"
	String s = "{"; //opening bracket
	for (int i = down; i < up; i++) {
	    if (i < up - 1) {
		s += a[i] + ",\t";} //comma inbetween values, tab
	    else {
		s += a[i]; }//last value, no comma
	}
        return s + "}"; //closing bracket
    }
    /*=====================================
      Slots() -- default constructor
      pre:  constant array FRUITS exists, has been initialized
      post: mutable array _fruits contains same elements as FRUITS
      =====================================*/
    public Slots()
    {
	//allocate memory for _fruits based on size of FRUITS:
	_fruits = new String[FRUITS.length];
	//copy elements of FRUITS into _fruits:
	_fruits = copy(FRUITS);
    }


    /*=====================================
      String toString() -- overrides inherited toString()
      pre:  
      post: returns String of elements in slots 0 thru 2, separated by tabs
      =====================================*/
    public String toString()
    {
	return printA(_fruits, 3 , 0); //print with upper bound of 3 from 0
    }


    /*=====================================
      void swap(int,int) -- array swap util fxn
      pre:  _fruits array exists
      post: elements at indices i, j are swapped
      =====================================*/
    private void swap( int i, int j )
    {String hold = _fruits[i]; //keeps value of [i]
	_fruits[i] = _fruits[j]; // [i] becomes [j]
	_fruits[j] = hold; //[j] becomes previous [i]

    }


    /*=====================================
      void spinOnce() -- simulate a pull of the slot machine lever
      pre:  _fruits array exists
      post: randomized order of elements in _fruits array
      =====================================*/
    public void spinOnce()
    {
	for (int i = 0; i < _fruits.length; i++) {
	    swap((int) (Math.random() * 24), (int) (Math.random() * 24));
	}//for each index, swap two values from index 0-23 and 0-23 (24 values)
	    
    }


    /*=====================================
      boolean jackpot() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      false otherwise
      =====================================*/
    public boolean jackpot()
    {
	return (_fruits[0].equals(_fruits[1])) && (_fruits[1].equals(_fruits[2]));//if a = b and b = c (transitive)
    }


    /*=====================================
      boolean miniWin() -- checks for a winning combo
      pre:  _fruits is existing array
      post: returns true if first 3 slots represent winning combo,
      or if first 3 slots mutually distinct, 
      false otherwise
      =====================================*/
    public boolean miniWin()
    {//if you get a jackpot or distinct values
	boolean distinct = !(_fruits[0].equals(_fruits[1])) && !(_fruits[2].equals(_fruits[1])) && !(_fruits[0].equals(_fruits[2]));
        return (jackpot() || distinct);
    }


    //main() method for testing
    public static void main( String[] args )
    {
	//usage: move bar below down 1 line at a time to test functionality...
	
	  Slots machine01 = new Slots();
	  Slots machine02 = new Slots();

	  //test to verify slot machines function indepently
	  System.out.println();
	  System.out.println( "Machine01 initial state:\t" + machine01 );
	  System.out.println( "Machine02 initial state:\t" + machine02 );

	  System.out.println( "\nSpinning machine01...\n" );

	  machine01.spinOnce();

	  System.out.println();
	  System.out.println( "Machine01 state:\t" + machine01 );
	  System.out.println( "Machine02 state:\t" + machine02 );
	  System.out.println();


	  //test gamble-until-you-win mechanism

	  System.out.println( "Preparing to spin until a mini win! . . ." );
	  System.out.println( "------------------------------------" );

	  //if you haven't won, spin again until you win!
	  while( machine01.miniWin() == false ) {
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "LOSE\n" );
	  machine01.spinOnce();
	  }

	  System.out.println( "====================================" );
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "WIN\n" );



	  System.out.println( "Preparing to spin until...jackpot! . . ." );
	  System.out.println( "------------------------------------" );

	  //if you haven't won, spin again until you win!
	  while( machine01.jackpot() == false ) {
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "LOSE\n" );
	  machine01.spinOnce();
	  }

	  System.out.println( "====================================" );
	  System.out.println( "Your spin..." + "\t" + machine01 );
	  System.out.println( "JACKPOT!\n" );
	  /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class Slots
