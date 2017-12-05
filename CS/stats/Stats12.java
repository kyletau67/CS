/*Kyle Tau
APCS1 pd 2
HW 12 --  stAtistically sPeaking
2017-10-05 */

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

    //method for maximum number with floating point number parameters
    //returns floating point number
    public static double max(double a, double b) {
	if (a >=  b) {
	    return a;}
	else {
	    return b;}
    }

    //method for geometric mean with integer parameters
    //returns integer
    public static int geoMean(int a, int b) {
	int c = (a * b);
	return (int) Math.sqrt(a * b);
    }

    //method for geometric mean with floating point number parameters
    //returns floating point number
    public static double geoMean(double a, double b) {
	return Math.sqrt(a * b);
    }

    /*main method testing, in order:
      int mean, double mean, int max, double max, int geoMean, and double geoMean */
    public static void main(String[] args) {
	Stats yes = new Stats();
	System.out.println(yes.mean(4, 8));
	System.out.println(yes.mean(0.1, 0.2));
	System.out.println(yes.max(3,3));
	System.out.println(yes.max(3.52, 3.51));
	System.out.println(yes.geoMean(5, 7));
	System.out.println(yes.geoMean(5.0, 7.0));
    }
}
//end of class Stats
