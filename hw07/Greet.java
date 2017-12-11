public class Greet {
    public static void main(String[] args) {
        String greeting;
	BigSib richard = new BigSib("Word up");
	BigSib tom = new BigSib("Salutations");
	BigSib kong = new BigSib("Hey ya");
	BigSib mom = new BigSib("Sup");
	greeting = richard.greet("freshman");
	System.out.println(greeting);
	greeting = tom.greet("Dr. Spaceman");
	System.out.println(greeting);
	greeting = kong.greet("Kong Fooey");
	System.out.println(greeting);
	greeting = mom.greet("mom");
	System.out.println(greeting);
    }
}
