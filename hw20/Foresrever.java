/* Kyle Tau
   APCS1 pd 2
   HW 20 -- For the Love of Strings 
   2017-10-19 */

public class Foresrever {
    //Fence method using a for loop
    public String fenceF(int posts) {
	String fence = "";
	for (int p = posts; p > 1 ; p --) {
	    fence += "--|";
	}
	if (posts > 0) {
	    return "|" + fence; //adds starting post to the fence
	}
	else {
	    return ""; } //returns empty string if posts is 0
    }

    //reversing a string using a for loop
    public String reverseF(String s) {
	String rev = ""; //string that will be the reverse
	int len = s.length(); 
        for (int x = len; x >= 0 ; x--) {
	    if (x == len) {
		rev+= s.substring(x); }
	    else {
		rev += s.substring(x,x+1); //adds 1 letter at a time going backward
	    }
	}
	return rev; 
    }

    //reversing a string using a recursion method
    public String reverseR(String s) {
	int len = s.length();
	if (len == 1) {
	    return s; //don't need to reverse
	}
	else {
	    return s.substring(len-1) + reverseR(s.substring(0,len-1)); //last letter + the reverseR of the string after the last letter is cut off
	}
    }

    public static void main(String[] args) {
	Foresrever me = new Foresrever();
	//tests for fenceF
	System.out.println("==========fenceF tests==========");
	System.out.println(me.fenceF(4)); //4 posts
	System.out.println(me.fenceF(0)); //empty string
	System.out.println(me.fenceF(1)); //returns |
	System.out.println(me.fenceF(-1)); //empty string

	//tests for reverseF
	System.out.println("==========reverseF tests==========");
	System.out.println(me.reverseF("stressed")); //desserts
	System.out.println(me.reverseF("racecar")); //racecar
	System.out.println(me.reverseF("naM norI ma I")); //I am Iron Man
	System.out.println(me.reverseF("987654321.0")); //0.123456789

	//tests for reverseR
	System.out.println("==========reverseR tests==========");
	System.out.println(me.reverseR("stressed")); //desserts
	System.out.println(me.reverseR("racecar")); //racecar
	System.out.println(me.reverseR("aciremA niatpaC ma I")); //I am Captain America
	System.out.println(me.reverseR("987654321.0")); //0.123456789
    }
} //end class
	   
	
