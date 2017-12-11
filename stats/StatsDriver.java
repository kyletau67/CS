public class StatsDriver {
    public static void main(String[] args) {
	Stats yes = new Stats();
	System.out.println("Max of 3, 4, and 5");
	System.out.println(yes.max(3, 4, 5));
	System.out.println("Max of 4, 3, and 5");
	System.out.println(yes.max(4, 3, 5));
	System.out.println("Max of 5, 3, and 4");
	System.out.println(yes.max(5, 3, 4));
	System.out.println("Max of 4.8, 3.6, and 5.3");
	System.out.println(yes.max(4.8, 3.6, 5.3));
	System.out.println("Max of 2.4, 3.6, and 1.5");
	System.out.println(yes.max(2.4, 3.6, 1.5));
	System.out.println("Geometric Mean of 5, 6, and 7");
	System.out.println(yes.geoMean(5, 6, 7));
	System.out.println("Geometric Mean of 2, 8, and 7");
	System.out.println(yes.geoMean(2, 8, 7));
	System.out.println("Geometric Mean of 5.1, 3.3, and 7.5");
	System.out.println(yes.geoMean(5.1, 3.3, 7.5));
	System.out.println("Geometric Mean of 3.1, 3.3, and 2.1");
	System.out.println(yes.geoMean(3.1, 3.3, 2.1));
    }
}
