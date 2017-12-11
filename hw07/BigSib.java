/*Kyle Tau
APCS1 pd 2
HW07 -- On the Origins of a BigSib
2017-09-26*/


public class BigSib {
    //constructor
    public BigSib(String msg) {
	helloMsg = msg;
	    }
    public BigSib() {
        //do nothing
    }
    private String helloMsg;
    public static void main(String[] args) {
    }
    public String greet(String name) {
	String thing;
	    thing = helloMsg;
	    thing += " ";
	    thing += name;
	return thing; 
    }
}

/*I got the desired output but I only used the special constructor*/
