/* Kyle Tau
   APCS1 pd 2
   HW 21 -- Karmacomma
   2017-10-23 */

public class Commafier {
    //recursive commafier
    public String commafyR(int i) {
	String num = Integer.toString(i); //string of i
	int len = num.length();
	if (len <= 3) {
	    return num; } //no need to add commas
	else {
	    int parse = Integer.parseInt(num.substring(0,len-3)); //parse for the recursive call which requires integer parameter
	    return commafyR(parse) + "," + num.substring(len-3); //adds commas before the last 3 digits
	}
    }

    //for loop commafier
    public String commafyF(int i) {
	String num = Integer.toString(i); //string of i
	String str = ""; //string for stringified integer with ,
	int len = num.length();
	for (int x = 0 ; x < len; x += 1) {
	    if ((x % 3) == (len % 3) && len > 3) {
		str += "," + num.substring(x,x+1); //adds comma, then the hundreds number
	    }
	    else {
		str += num.substring(x,x+1); //adds the number with index x
	    }
	}
	return str; //return final string
    }

    //main method
    public static void main(String[] args) {
	Commafier me = new Commafier();
	/* System.out.println("===============Test Cases==============");
     	System.out.println(me.commafyR(5034500)); //returns 5,034,500
	System.out.println(me.commafyR(5034500)); //returns 5,034,500
	System.out.println(me.commafyR(503)); //returns 503	
	System.out.println(me.commafyF(503)); //returns 503 */
	for (String s: args) {
	    int p = Integer.parseInt(s);
	    System.out.println(me.commafyF(p));
	}
    }
}//end class Commafier
    
