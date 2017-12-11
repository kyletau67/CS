/*Kyle Tau
APCS1 pd 2
HW 13 --  May ah Hahv S'maur, Please?
2017-10-06 */

//class stats
public class Stats {
    //method for mean with integer parameters
    //returns integer
    public static int mean(int a, int b) {
	return (a + b) / 2;

    }

    //method for mean with floating point number parameters
    //returns floating point number
    public static double mean(double a, double b) {
	return (a + b) / 2;
    }

    //method for maximum number with integer parameters
    //returns integer
    public static int max(int a, int b) {
	if (a >=  b) {
	    return a;}
	else {
	    return b;}
    }

    //method for max with 3 integer params
    //returns max integer
    public static int max(int a, int b, int c) {
	if (a >= b) {
	    if (a >= c) {
		return a;}
	    else {
		return c;}
	}
	else {
	    if (b >= c) {
		return b;}
	    else {
		return c;}
	}
    }
    
    //method for maximum number with floating point number parameters
    //returns floating point number
    public static double max(double a, double b) {
	if (a >=  b) {
	    return a;}
	else {
	    return b;}
    }

    //method for max with 3 double params
    //returns max double number
    public static double max(double a, double b, double c) {
	if (a >= b) {
	    if (a >= c) {
		return a;}
	    else {
		return c;}
	}
	else {
	    if (b >= c) {
		return b;}
	    else {
		return c;}
	}
    }
    
    //method for geometric mean with integer parameters
    //returns integer
    public static int geoMean(int a, int b) {
	return (int) Math.sqrt(a * b);
    }

    //method for geoMean with 3 int params
    //have to double third or else it turns to 0 
    //returns int
    public static int geoMean(int a, int b, int c) {
	int product = a * b * c;
	double third = (1.0 / 3.0);
	return (int) Math.pow(product, third);
    }

    
    //method for geometric mean with floating point number parameters
    //returns floating point number
    public static double geoMean(double a, double b) {
	return Math.sqrt(a * b);
    }

    //method for geoMean with 3 double params
    //returns double
    public static double geoMean(double a, double b, double c) {
	double product = a * b * c;
	double third = (1.0 / 3.0);
	return  Math.pow(product, third);
    }

    /*main method testing */
    public static void main(String[] args) {
	Stats yes = new Stats();
	System.out.println("Mean of 4 and 8");
	System.out.println(yes.mean(4, 8));
	System.out.println("Mean of 0.1 and 0.2");
	System.out.println(yes.mean(0.1, 0.2));
	System.out.println("Max of 3 and 5");
	System.out.println(yes.max(3,5));
	System.out.println("Max of 3.52 and 3.51");
	System.out.println(yes.max(3.52, 3.51));
	System.out.println("Geometric Mean of 5 and 7");
	System.out.println(yes.geoMean(5, 7));
	System.out.println("Geometric Mean of 5.0 and 7.0");
	System.out.println(yes.geoMean(5.0, 7.0));
	//Tests for new methods are in class StatsDriver

    }
}
//end of class Stats
