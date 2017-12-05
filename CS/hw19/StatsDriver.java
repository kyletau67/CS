// Bill Ni 
// APCS1 pd2 
// HW13--May ah Hahv S'maur, Please?
// 2017-10-06

public class StatsDriver {
	public static void main( String[] args ){

		System.out.println("Mean tests for (5,6) and (5,7)");

		System.out.println(Stats.mean(5,6)); // test for truncation, should return 5
		System.out.println(Stats.mean(5,7)); // test for correct answer, should return 6

		System.out.println("===============");
		System.out.println("Mean tests for (5.0,6.0) and (5.0,7.0)");

		System.out.println(Stats.mean(5.0,6.0)); // should return 5.5
		System.out.println(Stats.mean(5.0,7.0)); // should return 6.0

		System.out.println("===============");
		System.out.println("Max tests for (6,5),(6,6) and (5,6)");

		System.out.println(Stats.max(6,5)); // should return 6
		System.out.println(Stats.max(6,6)); // should return 6
		System.out.println(Stats.max(5,6)); // should return 6

		System.out.println("===============");
		System.out.println("Max tests for (1,2,3),(1,3,2),(2,1,3),(2,3,1),(3,1,2),(3,2,1),(1,1,3),(1,3,1),(3,1,1),(3,3,1),(3,1,3),(1,3,3) and (3,3,3)");

		System.out.println(Stats.max(1,2,3)); // should return 3
		System.out.println(Stats.max(1,3,2)); // should return 3
		System.out.println(Stats.max(2,1,3)); // should return 3
		System.out.println(Stats.max(2,3,1)); // should return 3
		System.out.println(Stats.max(3,1,2)); // should return 3
		System.out.println(Stats.max(3,2,1)); // should return 3
		System.out.println(Stats.max(1,1,3)); // should return 3
		System.out.println(Stats.max(1,3,1)); // should return 3
		System.out.println(Stats.max(3,1,1)); // should return 3
		System.out.println(Stats.max(3,3,1)); // should return 3
		System.out.println(Stats.max(3,1,3)); // should return 3
		System.out.println(Stats.max(1,3,3)); // should return 3
		System.out.println(Stats.max(3,3,3)); // should return 3

		System.out.println("===============");
		System.out.println("Max tests for (1.0,2.0,3.0),(1.0,3.0,2.0),(2.0,1.0,3.0),(2.0,3.0,1.0),(3.0,1.0,2.0),(3.0,2.0,1.0),(1.0,1.0,3.0),(1.0,3.0,1.0),(3.0,1.0,1.0),(3.0,3.0,1.0),(3.0,1.0,3.0),(1.0,3.0,3.0) and (3.0,3.0,3.0)");

		System.out.println(Stats.max(1.0,2.0,3.0)); // should return 3.0
		System.out.println(Stats.max(1.0,3.0,2.0)); // should return 3.0
		System.out.println(Stats.max(2.0,1.0,3.0)); // should return 3.0
		System.out.println(Stats.max(2.0,3.0,1.0)); // should return 3.0
		System.out.println(Stats.max(3.0,1.0,2.0)); // should return 3.0
		System.out.println(Stats.max(3.0,2.0,1.0)); // should return 3.0
		System.out.println(Stats.max(1.0,1.0,3.0)); // should return 3.0
		System.out.println(Stats.max(1.0,3.0,1.0)); // should return 3.0
		System.out.println(Stats.max(3.0,1.0,1.0)); // should return 3.0
		System.out.println(Stats.max(3.0,3.0,1.0)); // should return 3.0
		System.out.println(Stats.max(3.0,1.0,3.0)); // should return 3.0
		System.out.println(Stats.max(1.0,3.0,3.0)); // should return 3.0
		System.out.println(Stats.max(3.0,3.0,3.0)); // should return 3.0

		System.out.println("===============");
		System.out.println("Max tests for (6.0,5.0),(6.0,6.0) and (5.0,6.0)");

		System.out.println(Stats.max(6.0,5.0)); // should return 6.0
		System.out.println(Stats.max(6.0,6.0)); // should return 6.0
		System.out.println(Stats.max(5.0,6.0)); // should return 6.0

		System.out.println("===============");
		System.out.println("GeoMean tests for (4,9) and (5,6)");

		System.out.println(Stats.geoMean(4,9)); // should return 6
		System.out.println(Stats.geoMean(5,6)); // should return 5

		System.out.println("===============");
		System.out.println("GeoMean tests for (2,2,2),(4,2,1) and (3,4,5)");

		System.out.println(Stats.geoMean(2,2,2)); // should return 2
		System.out.println(Stats.geoMean(4,2,1)); // should return 2
		System.out.println(Stats.geoMean(3,4,5)); // should return 3

		System.out.println("===============");
		System.out.println("GeoMean tests for (4.0,9.0) and (5.0,6.0)");

		System.out.println(Stats.geoMean(4.0,9.0)); // should return 6.0
		System.out.println(Stats.geoMean(5.0,6.0)); // should return 5.477225575051661

		System.out.println("===============");
		System.out.println("GeoMean tests for (2.0,2.0,2.0),(4.0,2.0,1.0) and (3.0,4.0,5.0)");

		System.out.println(Stats.geoMean(2.0,2.0,2.0)); // should return 2.0
		System.out.println(Stats.geoMean(4.0,2.0,1.0)); // should return 2.0
		System.out.println(Stats.geoMean(3.0,4.0,5.0)); // should return 3.91486764

		System.out.println("===============");
		System.out.println("gcd test for (0,0),(0,1),(1,0),(5,0),(0,5),(15,20),(20,15)");
		System.out.println(Stats.gcd(0,0)); //should return 0
		System.out.println(Stats.gcd(0,1)); //should return 1
		System.out.println(Stats.gcd(1,0)); //should return 1
		System.out.println(Stats.gcd(5,0)); //should return 5
		System.out.println(Stats.gcd(0,5)); //should return 5
		System.out.println(Stats.gcd(15,20)); //should return 5
		System.out.println(Stats.gcd(20,15)); //should return 5

		System.out.println("===============");
		System.out.println("gcdER test for (0,0),(0,1),(1,0),(5,0),(0,5),(15,20),(20,15)");
		System.out.println(Stats.gcdER(0,0)); //should return 0
		System.out.println(Stats.gcdER(0,1)); //should return 1
		System.out.println(Stats.gcdER(1,0)); //should return 1
		System.out.println(Stats.gcdER(5,0)); //should return 5
		System.out.println(Stats.gcdER(0,5)); //should return 5
		System.out.println(Stats.gcdER(15,20)); //should return 5
		System.out.println(Stats.gcdER(20,15)); //should return 5

		System.out.println("===============");
		System.out.println("gcdEW test for (0,0),(0,1),(1,0),(5,0),(0,5),(15,20),(20,15)");
		System.out.println(Stats.gcdEW(0,0)); //should return 0
		System.out.println(Stats.gcdEW(0,1)); //should return 1
		System.out.println(Stats.gcdEW(1,0)); //should return 1
		System.out.println(Stats.gcdEW(5,0)); //should return 5
		System.out.println(Stats.gcdEW(0,5)); //should return 5
		System.out.println(Stats.gcdEW(15,20)); //should return 5
		System.out.println(Stats.gcdEW(20,15)); //should return 5
	}
}