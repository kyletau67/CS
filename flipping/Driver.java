/*Kyle Tau
  APCS1 pd 2
  HW16 -- Get It While You Can
  2017-10-11*/

public class Driver
{
    public static void main( String[] args )
    {
	//variable to count number of matches
	int matches = 0; 

	//test default constructor
   
	Coin mine = new Coin();

	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );

    
	/* COMMENTING PREVIOUS ASSIGNMENT'S PRINTS TO HAVE LESS OUTPUT IN TERMINAL
	//test toString() methods of each Coin
	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);
   
	//test flip() method
	System.out.println("\nAfter flipping...");
	yours.flip();
	wayne.flip();
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//test equals() method
	if ( yours.equals(wayne) ) 
	System.out.println( "Matchee matchee!" );
	else
	System.out.println( "No match. Firestarter you can not be." );*/

    
	//these flipping while loops *FLOW CONTROL*
	//until x heads, x = 67
	while (mine.headsCtr < 67) {
	    mine.flip(); }
	System.out.println("-----------------Up to 67 Heads-----------------");
	System.out.println("Heads Count: " + mine.headsCtr);
	System.out.println("Tails Count: " + mine.tailsCtr);
	System.out.println("Total Flips: " + mine.flipCtr);

	//until there are 10 matches
	while (matches < 10) {
	    yours.flip();
	    wayne.flip();
	    if (yours.equals(wayne)) {
		matches += 1; }
	}
	System.out.println("-----------------Up to 10 matches----------------");
	System.out.println("Number of Matches: " + matches);
	System.out.println("Out of " + yours.flipCtr + " Flips");

	//14007 is the lowest multiple of 2001 that is greater than 13000
	while (matches != 14007) {
		yours.flip();
		wayne.flip();
		if (yours.equals(wayne)) {
		    matches += 1; }
	}
	System.out.println("-----------------So many matches-----------------");
	System.out.println("Number of Matches: " + matches);
	System.out.println(matches / 2001 + " * 2001");
	System.out.println("Out of " + yours.flipCtr + " Flips");
	    
    }//end main()

}//end class
