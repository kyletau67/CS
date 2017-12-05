/* Team Cherzerd but better (Mohtasim Howlader, Bill Ni & Kyle Tau)
   APCS1 pd 2
   HW 24 -- Imetay Otay Ineshay
   2017-10-29 */

/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *          9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' @ @ `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 * TO DO:
 * work with capitalization
 * work with the cases for letter y
 
 * Summary:
        We first added the capitalization and 'y' methods, which capitalizes a word or either counts y as a consonant or vowel, respectively. Then we added the punctuation method, only looking at punctuations normally found at the end of a word. This method takes the punctuation and puts it at the end of the word after it has been translated. 
 
 ***/

import java.util.Scanner;
public class Pig
{
    //Q: How does this initialization make your life easier?
    //A: So we can keep using this to check for vowels and consonants!
    private static String VOWELS = "aeiouAEIOU"; //all of the vowels, is not final because need to be able to add or remove "y" from it
    private static String endPunct = "!.,:;?)"; // end punctuations
    private static String startPunct = "("; //start punctiation
    private static String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; //alphabet

    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
    return (w.indexOf(letter) > -1);
    }//end hasA()

    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) 
    {
    return hasA(VOWELS, letter); //is the letter in string VOWELS?
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
    public static int countVowels( String w ) 
    {
    int total = 0;
    int origLength = w.length();
    for (int i = 0; i < origLength; i++){
        if (isAVowel(w.substring(i,i+1))){
        total += 1;
        }
    }
    return total;
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
      =====================================*/
    public static boolean hasAVowel( String w ) 
    {
    return countVowels(w) > 0; //if there is more than 1 vowel, the string has a vowel
    }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w ) 
    {
    String rtrnStr = "";
    String currLetter = "";
    int origLength = w.length();
    for (int i = 0; i < origLength; i++){
        currLetter = w.substring(i,i+1);
        if (isAVowel(currLetter)){
        rtrnStr += currLetter; //if it is a vowel, add the letter to the string of vowels 
        }
    }
    return rtrnStr;
    }

    //pre: w != null
    //post: firstVowel("") --> ""
    //      firstVowel("zzz") --> ""
    //      firstVowel("meatball") --> "e"
    public static String firstVowel(String w){
    if (hasAVowel(w)) {
        return allVowels(w).substring(0,1); }//looks for the first vowel in the string of all vowels only if the string has vowels
    else {
        return ""; } //nothing if the string has no vowels
    }
    //pre: w != null and w.length() > 0
    //post: beginsWithVowel("apple")  --> true
    //      beginsWithVowel("strong") --> false
    public static boolean beginsWithVowel(String w){
    return isAVowel(w.substring(0,1)); //is the first letter a vowel?
    }

    
    //pre: w.length() > 0
    //post: engToPig("apple")  --> "appleway"
    //      engToPig("strong") --> "ongstray"
    //      engToPig("java")   --> "avajay"
    public static String engToPig(String w) { 
        String rtrstr =""; //final string to return
       
        if (beginsWithVowel(w)) { //checks if beginsWithVowel(check above)
            rtrstr = w + "way";  //adds "way"
        }
        else if (hasAVowel(w)) { //if it has a vowel at all
            rtrstr = w.substring(w.indexOf(firstVowel(w))) + w.substring(0, w.indexOf(firstVowel(w))) + "ay" ; //adds substring from first vowel onwards + substring of beginning to first vowel + "ay"
        }
        else {
            VOWELS += "yY"; 
            rtrstr = engToPig(w); //does engtopig again but this time counting "y" as a vowel
            VOWELS = VOWELS.substring(0,9); //removes y from VOWELS
         }
            return punct(cap(rtrstr)); //adjusts proper capitalization, and then punctuation
    }

    //pre: w.length()>0
    //post: cap("elloHay") --> "Ellohay"  
    public static String cap(String w) {
        if (w.toLowerCase().equals(w)){ //if there are no capitals
            return w; // //then just return the word as is
        }
        else{
           // for (int i=0; i<w.length(); i++) {
            
            return w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase(); //if there is a capital then make the first only the first letter capital and the rest lowercase
        }
    }
    
    //pre: w.length()>0
    //post: punct("Ello!hay")--> "Ellohay!" 
    public static String punct(String w) {
        int len = w.length();
        String newW = ""; //just letters
        String start= ""; //string of start punctuations
        String end = ""; //string of end punctuations
        for (int i = 0; i < len; i++) {
            if (endPunct.indexOf(w.substring(i, i+1)) != -1) {
                end += w.substring(i, i+1); } //if there is an end punctuation put it in the end NOT counting apostrophes  
            else if (startPunct.indexOf(w.substring(i,i+1)) != -1) {
                start += w.substring(i, i+1); } //if there is a start punctution, put it in start
            else {
                newW += w.substring(i, i+1); } //string of just the letters 
                }
        return start + newW + end; } //word with the correct punctuations at the beginning and end
                
                
  //just shortened system.out.println
    public static void sop(String inStr){
        System.out.println(inStr); 
    }

    public static void main( String[] args ) 
    {
    
        Scanner sc = new Scanner(System.in); //creates Scanner instance
        while (sc.hasNext()) { //while there is a next word
            sop(engToPig(sc.next())); //perform engtopig translation on the next word
        } 
    
 /* //old test cases
    sop("hasA tests:");
    sop("" + hasA("h","a")); //false
    sop("" + hasA("h","h")); //true
    sop("" + hasA("hi","a")); //false
    sop("" + hasA("hi","i")); //true
    sop("" + hasA("hi","h")); //true
    sop("" + hasA("hiya","a")); //true
    sop("" + hasA("hiya","k")); //false
    sop("" + hasA("hiya","h")); //true
    sop("===========");

    sop("isAVowel tests:");
    sop("" + isAVowel("a")); //true
    sop("" + isAVowel("e")); //true
    sop("" + isAVowel("i")); //true
    sop("" + isAVowel("o")); //true
    sop("" + isAVowel("u")); //true
    sop("" + isAVowel("b")); //false
    sop("" + isAVowel("k")); //false
    sop("" + isAVowel("h")); //false
    sop("===========");

    sop("countVowels tests:");
    sop("" + countVowels("t")); //0
    sop("" + countVowels("th")); //0
    sop("" + countVowels("the")); //1
    sop("" + countVowels("ther")); //1
    sop("" + countVowels("there")); //2
    sop("" + countVowels("theref")); //2
    sop("" + countVowels("therefo")); //3
    sop("" + countVowels("therefor")); //3
    sop("" + countVowels("therefore")); //4
    sop("===========");

    sop("hasAVowel tests:");
    sop("" + hasAVowel("a")); //true
    sop("" + hasAVowel("b")); //false
    sop("" + hasAVowel("lol")); //true
    sop("" + hasAVowel("why")); //false
    sop("" + hasAVowel("ok")); //true
    sop("" + hasAVowel("hiya")); //true
    sop("" + hasAVowel("hy")); //false
    sop("" + hasAVowel("no")); //true
    sop("===========");

    sop("allVowels tests:");
    sop("" + allVowels("t")); //
    sop("" + allVowels("th")); //
    sop("" + allVowels("the")); //e
    sop("" + allVowels("ther")); //e
    sop("" + allVowels("there")); //ee
    sop("" + allVowels("theref")); //ee
    sop("" + allVowels("therefo")); //eeo
    sop("" + allVowels("therefor")); //eeo
    sop("" + allVowels("therefore")); //eeoe
    sop("===========");

    sop("firstVowel tests:");
    sop("" + firstVowel("")); //empty string
    sop("" + firstVowel("zzz")); //empty string
    sop("" + firstVowel("meatball")); //e
    sop("===========");

    sop("beginsWithVowel tests:");
    sop("" + beginsWithVowel("apple")); //true
    sop("" + beginsWithVowel("strong")); //false
    sop("===========");
        
    sop("engToPig tests:");
    sop("" + engToPig("apple"));  //appleway
    sop("" + engToPig("strong")); //ongstray
    sop("" + engToPig("java"));   //avajay
    sop("" + engToPig("Hello"));  //ellohay
    sop("" + engToPig("flynn"));  //ynnflay
    sop("===========");
*/
    
    }//end main()

}//end class Pig
