// Team Cherzerd (Bill Ni & Kyle Tau)
// APCS1 pd2 
// HW19--gcd 3 ways
// 2017-10-18

public class Stats{
    public static void main( String[] args ){}

    public static int mean(int a, int b){
	return ((a + b) / 2);
    }

    public static double mean(double a, double b){
	return ((a + b) / 2);
    }

    public static int max(int a, int b){
	if (a >= b) {
	    return a;
	} else {
	    return b;
	}
    }

    public static int max(int a, int b, int c){
	return max(max(a,b),c);
    }

    public static double max(double a, double b){
	if (a >= b) {
	    return a;
	} else {
	    return b;
	}
    }

    public static double max(double a, double b, double c){
	return max(max(a,b),c);
    }

    public static int min(int a, int b){
	if (a <= b) {
	    return a;
	} else {
	    return b;
	}
    }
    
    //methods to find the smaller of given ints
    public static int min(int a, int b, int c){
	return min(min(a,b),c);
    }

    public static double min(double a, double b){
	if (a <= b) {
	    return a;
	} else {
	    return b;
	}
    }

    public static double min(double a, double b, double c){
	return min(min(a,b),c);
    }

    public static int geoMean(int a, int b){
	return (int) Math.sqrt(a * b);
    }

    public static int geoMean(int a, int b, int c){
	return (int) Math.pow((a * b * c), (1.0 / 3));
    }

    public static double geoMean(double a, double b){
	return Math.sqrt(a * b);
    }

    public static double geoMean(double a, double b, double c){
	return Math.pow((a * b * c), (1.0 / 3));
    }
    
    //gcd methods
    public static int gcd(int a, int b){
	int d = 1; //divisor that increases by 1 each loop
	int c = min(a,b); //minimum of a and b
	int gcd = 0; //variable that gets replaced if BE in loop holds true
	while (d <= c){
	    if ((a % d == 0) && (b % d == 0)){
		gcd = d; //if both params are divisible by d, gcd is replaced
	    }
	    d += 1; //force is added to d to make it more brute
	}
	return gcd; //returns the biggest value of d that works, AKA greatest common divisor
    }

    /*
      Euclid's Algo

      1. Maintain 2 parameters
      2. Find the greater one
      3. Replace it with itself modulo the other one
      4. Repeat until one of them reaches 0
      5. Return non-zero variable
    */

    public static int gcdER(int a, int b){
	//if either a or b is 0, that means in the previous call, a == b, so the GCD has been found due to the algorithm
	if (a == 0){
	    return b;
	}else if (b == 0){
	    return a; 
	}else{
	    int maxAB = max(a,b); //maximum of a and b 
	    int minAB = min(a,b); //minimum of a and b
	    return gcdER(maxAB % minAB, minAB); //recursive call, bigger number of a and b is replaced by the modulo of the bigger and smaller int
	}
    }

    public static int gcdEW(int a, int b){
	//if either a or b is not 0, the GCD has not been found
	while (a != 0 && b != 0){
	    if (a > b){
		a = a % b; //b gets subtracted as many times as possible from a, and the result is the new a 
	    }else{
		b = b % a; //a gets subtracted as many times as possible from b, and the result is the new b
	    } //loop continues until one of them becomes 0
	}
	return max(a,b); //returns the result that is not 0
    }
}
