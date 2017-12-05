/* Kyle Tau
APCS1 pd 2
HW 22 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
2017-10-24 */


/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  //A: We can use this string and indexOf to check for vowels in strings
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )  {
      //We learned .toLowerCase() from Codingbat, and now the methods are not case-sensitive
      letter = letter.toLowerCase();
      w = w.toLowerCase();
      return w.indexOf(letter) != -1; //if the index is -1, then the letter is not found in the string w
  
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )  {
      return hasA(VOWELS, letter); //is the letter in string VOWELS?
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )  {
      int count = 0; //initialize number of vowels
      int len = w.length();
      for (int i = 0; i < len; i++) {
	  if (isAVowel(w.substring(i,i+1))) {
	      count += 1; } //if the letter is a vowel, add 1 to the count
      }
      return count;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )  {
      return countVowels(w) > 0; //if there is more than 1 vowel, the string has a vowel
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )  {
      String str = ""; //string for vowel addition
      int len = w.length();
      if (hasAVowel(w)) { //if it doesn't have a vowel, don't bother, otherwise go ahead! 
	      for (int i = 0; i < len; i++) {
		  if (isAVowel(w.substring(i,i+1))) {
		      str += w.substring(i,i+1); } //if it is a vowel, add it to the string of vowels
	      }
	  }
      return str;
  }


  public static void main( String[] args )   {
      Pig wilbur = new Pig();
      //3 test cases for each method
      System.out.println("======hasA Tests======");
      System.out.println(wilbur.hasA("wilbur","w")); //true
      System.out.println(wilbur.hasA("apple", "A"));  //true
      System.out.println(wilbur.hasA("APPLES","o"));  //false    
      System.out.println("======isAVowel Tests======");
      System.out.println(wilbur.isAVowel("a")); //true
      System.out.println(wilbur.isAVowel("E")); //true
      System.out.println(wilbur.isAVowel("s")); //false
      System.out.println("======countVowels Tests======");
      System.out.println(wilbur.countVowels("eating")); //3
      System.out.println(wilbur.countVowels("APPLE"));  //2
      System.out.println(wilbur.countVowels("rhythm")); //0
      System.out.println("======hasAVowel Tests======");
      System.out.println(wilbur.hasAVowel("elephant")); //true
      System.out.println(wilbur.hasAVowel("STOMPiNG")); //true
      System.out.println(wilbur.hasAVowel("rhythm"));   //false
      System.out.println("======allVowels Tests======");
      System.out.println(wilbur.allVowels("elephant"));    //eea
      System.out.println(wilbur.allVowels("olotohujuku")); //ooouuu
      System.out.println(wilbur.allVowels("sdfghjkl"));    //empty string
      
      
      
			 
  }//end main()

}//end class Pig
