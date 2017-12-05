/* Kyle Tau
   APCS1 pd 2
   HW 37 -- Be More Rational
   2017-11-21 */

public class Rational {
    private int p;
    private int q;
    //default constructor, value at 0/1
    public Rational() {
	p = 0;
	q = 1; }
    //overloaded constructor, value at a/b
    public Rational(int a, int b) {
	this();
	if (b == 0) {
	    System.out.println("That is not a possible rational number. P is now 0, and Q is now 1.");
	}
	else {
	    p = a;
	    q = b;
	}
    }
    //toString method
    public String toString() {
	return "The number is ...  " + p + " / " + q;}
    
    //float value
    public double floatValue() {
	return (double) p / q; }//turns p into float, divide p/q, which is float 
    public void multiply(Rational a) {
	p *= a.p; //this Rational's p with the parameter's p
	q *= a.q; //this Rational's q with the parameter's q
	//System.out.println(p);
	//System.out.println(q);	
    }
    public void divide(Rational a) {
	if (a.p != 0) {
	    p *= a.q; //this Rational's p with the parameter's q
	    q *= a.p; //this Rational's q with the parameter's p
	}
	else {
	    System.out.println("Invalid Division: Cannot divide by 0");
	}
	//System.out.println(p);
	//System.out.println(q);	
    }

    public void add(Rational a) {
	if (a.p != 0) {
	    p *= a.q; //multiply by demoninator of parameter Rational
	    p += (a.p * q); //add numerator of parameter multiplied by this denominator 
	    q *= a.q; //common denominator
	}
    }

    public void subtract(Rational a) {
	if (a.p != 0) {
	    p *= a.q; //multiply by demoninator of parameter Rational
	    p -= (a.p * q); //subtract numerator of parameter multiplied by this denominator 
	    q *= a.q; //common denominator
	}
    }
	    
    public int gcd() {
        return gcd2(p, q); //gcd of p,q
    }
    
    public int gcd2 ( int a, int b){ // Does a recursive algorithm of GCD
        if (a % b == 0) {
	    return b;
        }
        return gcd2( b, a%b);
    }

    public void reduce() {
	int tempgcd = gcd(); //so the gcd doesnt change inbetween steps
	p /= tempgcd;
	q /= tempgcd; 
    }

    public int compareTo(Rational a) {
	//floatValue for utmost accuracy
	if (this.floatValue() == a.floatValue()) {
	    return 0; } 
	else if (this.floatValue() > a.floatValue()) {
	    return 1; }
	else {
	    return -1; }
    }
    
    public static void main(String[] args) {
	Rational r = new Rational(2,3); //Stores rational number 2/3
	Rational s = new Rational(1,2); //Stores rational number 1/2
	Rational t = new Rational(); //default Rational
	Rational u = new Rational(3,0); //error, changes values to 0 and 1
	r.add(s); //should turn to 7/6
	System.out.println(r); // 7/6
	r.subtract(s); //back to 2/3
	System.out.println(r); //turn to 8/12 aka 2/3 
	System.out.println(r.gcd());// 4
	r.reduce(); //reduces to 2/3
	System.out.println(r); // 2/3
	System.out.println(r.gcd()); // 1
	System.out.println(t.compareTo(u)); //0 
	System.out.println(r.compareTo(s)); //1
	
    }
}
