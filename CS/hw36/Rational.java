/* Kyle Tau
   APCS1 pd 2
   HW 36 -- Be Rational
   2017-11-17 */

public class Rational {
    int p;
    int q;
    //default constructor, value at 0/1
    public Rational() {
	p = 0;
	q = 1; }
    //overloaded constructor, value at a/b
    public Rational(int a, int b) {
	if (b == 0) {
	    System.out.println("That is not a possible rational number. P is now 0, and Q is now 1.");
	    p = 0;
	    q = 1; }
	else {
	    p = a;
	    q = b;
	}
    }
    //toString method
    public String toString() {
	return "The number is ...  " + p + "/" + q; }
    //float value
    public double floatValue() {
	return (p * 1.0) / (q); }//turns p into float, divide p/q, which is float 
    public void multiply(Rational a) {
	p *= a.p; //this Rational's p with the parameter's p
	q *= a.q; //this Rational's q with the parameter's q
	//System.out.println(p);
	//System.out.println(q);	
    }
    public void divide(Rational a) {
	p /= a.p; //this Rational's p with the parameter's p
	q /= a.q; //this Rational's q with the parameter's q
	//System.out.println(p);
	//System.out.println(q);	
    }
    public static void main(String[] args) {
	Rational r = new Rational(2,3); //Stores rational number 2/3
	Rational s = new Rational(1,2); //Stores rational number 1/2
	Rational t = new Rational(); //default Rational
	Rational u = new Rational(3,0); //error, changes values to 0 and 1
	r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2
	System.out.println(r.floatValue()); // 0.333
	r.divide(s); //r changes back to 2/3
	System.out.println(r); //0.6666
	System.out.println(r.floatValue()); //0.66666
	System.out.println(t); // 0.0
	System.out.println(u); // 0.0
    }
}
