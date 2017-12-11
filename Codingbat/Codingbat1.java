public class Codingbat1 {
    public String helloName(String name) {
	return "Hello " + name + "!";
    }
    public String makeAbba(String a, String b) {
	return a + b + b + a;
    }
    public String doubleChar(String str) {
	String doubled = "";
	int len = str.length();
	for (int x = 0; x < len; x++) {
	    doubled += str.substring(x,x+1) + str.substring(x,x+1);
	}
	return doubled;
    }
    public int countHi(String str) {
	int len = str.length();
	int count = 0;
	for (int i = 0; i <= (len-2); i++) {
	    System.out.println(str.substring(i, i+2));
	    if (str.substring(i,i+2).equals("hi")) {
		count += 1;
	    }
	}
	return count;
    }
    public boolean catDog(String str) {
	int len = str.length();
	int catcount = 0;
	int dogcount = 0;
	for (int i = 0; i <= len - 3; i++) {
	    if (str.substring(i,i+3).equals("cat")) {
		catcount += 1;
	    }
	    if (str.substring(i,i+3).equals("dog")) {
		dogcount += 1;
	    }
	}
	return catcount == dogcount;
    }
    public int countCode(String str) {
	int len = str.length();
	int count = 0;
	for (int i = 0; i <= len -4; i++) {
	    if (str.substring(i,i+2).equals("co")){
		if (str.substring(i+3,i+4).equals("e")) {
		    count += 1;
		}
	    }
	}
	return count;
    }
    public boolean endOther(String a, String b) {
	int aLen = a.length();
	int bLen = b.length();
        a = a.toLowerCase();
	b = b.toLowerCase();
	if (aLen > bLen) {
	    return a.substring(aLen-bLen).equals(b);
	}
	else {
	    return b.substring(bLen-aLen).equals(a);
	}
    }
    public boolean xyzThere(String str) {
	int len = str.length();
	boolean there = false;
	for (int i = 0; i <= len-3; i++) {
	    if (str.substring(i,i+3).equals("xyz")) {
		there = true; }
	    if (str.substring(i,i+1).equals(".")) {
		i ++;
	    }

	}
	return there;
    }

    public static void main(String[] args) {
	Codingbat1 me = new Codingbat1();
	System.out.println(me.doubleChar("yes"));
	System.out.println(me.countHi("hiiohireuhi"));
	System.out.println(me.catDog("catdog"));
	System.out.println(me.countCode("cozexxcope"));
	System.out.println(me.endOther("yea", "noYea"));
	System.out.println(me.xyzThere("abc.xyz"));
	System.out.println(me.xyzThere("abcxyz."));
	
    }
}
