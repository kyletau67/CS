/*Kyle Tau (in collaboration with Cheryl Qian and Bill Ni)
  APCS1 pd 2 
  HW 17 -- Do I repeat myself?
  2017-10-16 */

public class Repeater {

    //While loop method for posts
    public String fenceW(int numPosts) {
	String fences = "";
	while (numPosts >= 0){
	    if (numPosts == 0){
		fences += ""; }
	    else if (numPosts == 1){
		fences = "|" + fences; }
	    else{
		fences += "--|"; //adds --| until numPosts == 1
	    }
	    numPosts -= 1;
	}
	return fences;
    }

    //Recursive method for posts
    public String fenceR(int numPosts) {
	if (numPosts <= 0) {
	    return ""; } //returns nothing if param isn't positive (secondary base case)
	else if (numPosts == 1) {
	    return "|"; } //primary base case for when numPosts is 1
	else {
	    return "|--" + fenceR(numPosts - 1); } //recursive call of method, adds |--, then reduces numPosts by 1
    }

    //main method to test methods
    public static void main(String[] args) {
	//new Repeater to test non-static methods, tests 3, 5, 10, -1, and 0 as params
	Repeater me = new Repeater();
	System.out.println(me.fenceW(3));
	System.out.println(me.fenceR(3));  //returns |--|--|
	System.out.println(me.fenceW(5));
	System.out.println(me.fenceR(5));  //returns |--|--|--|--|
	System.out.println(me.fenceW(10));
	System.out.println(me.fenceR(10)); //returns |--|--|--|--|--|--|--|--|--|
	System.out.println(me.fenceW(-1));
	System.out.println(me.fenceR(-1)); //returns empty string
	System.out.println(me.fenceW(0));
	System.out.println(me.fenceR(0));  //returns empty string
    }
}//end class Repeater
