/*Kyle Tau
APCS1 pd 2
HW48 -- Keep Guessing
2017-12-06 */

/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

import cs1.Keyboard;

public class GuessNumber 
{
    //instance vars
    private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) 
    {
        _lo = a;
	_hi = b;
	_target = (int) (Math.random()*(b-a+1) + a);
	_guessCtr = 0;
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec() 
    {
	int guess;
	System.out.print("Guess a Number from "+_lo+"-"+_hi+":");
	guess = Keyboard.readInt();
	if (guess > _hi || guess < _lo) {
	    System.out.println("Not in range. Try Again.");
	    playRec(); }
	else if (guess > _target) {
	    System.out.println("Too High. Try Again.");
	    _guessCtr++;
	    _hi = guess;
	    playRec(); }
	else if (guess < _target) {
	    System.out.println("Too Low. Try Again.");
	    _guessCtr++;
	    _lo = guess;
	    playRec(); }
	else {
	    System.out.println("You've done it! In only "+_guessCtr+" tries.");
	}
	    
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() 
    {
	boolean done = false;
	int guess;
	while (done == false) {
	    System.out.print("Guess a Number from "+_lo+"-"+_hi+":");
	    guess = Keyboard.readInt();
	    if (guess > _hi || guess < _lo) {
		System.out.println("Not in range. Try Again.");
	    }
	    else if (guess > _target) {
		System.out.println("Too High. Try Again.");
		_guessCtr++;
		_hi = guess; }
	    else if (guess < _target) {
		System.out.println("Too Low. Try Again.");
		_lo = guess;
		_guessCtr++;}
	    else {
		++_guessCtr;
		System.out.println("You've done it! In only "
				   + _guessCtr + " tries.");
		done = true; }
	}
	
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() 
    { 
	//use one or the other below:
	playRec();
	//playIter();
    }


    //main method to run it all
    public static void main( String[] args ) 
    {

	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
	g.play();
		/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class
