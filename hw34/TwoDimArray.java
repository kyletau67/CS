// Kyle Tau
// APCS1 pd 2
// HW34 -- 2D arrays
// 2017-11-17


public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
      for (int i = 0; i < a.length; i++) {//each row
	  for (int j = 0; j < a[i].length; j++) {//each column
	      System.out.print(" " + a[i][j]);//print the value with spaces
	  }
	  System.out.print("\n"); }//new line after each row
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    for(int[] r: a){
	for(int j: r){//element j in row r
		System.out.print(" " + j);
	    }
	    System.out.print("\n");
	}

  }

  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
      int sum = 0;
      for (int r = 0; r < a.length; r++) {//r for row
	  for (int c = 0; c < a[r].length; c++) {
	      sum += a[r][c]; }//add element at row r and column c
      }
      return sum;
  }

  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
      int sum = 0;
      for (int i = 0; i < m.length; i++) {
	  sum += sumRow(i, m); } //add on the sum of each row
      return sum;
  }
    

  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
      int sum = 0;
      for (int i = 0; i < a[r].length; i++) {
	  sum += a[r][i]; }// add to sum element in row r, index i
      return sum;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
      int sum = 0;
      for (int e: m[r]) {//for each element in m[r] <--row of int[][] m
	  sum += e; }
      return sum;
  }
    

  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      System.out.println("=====================================");
      System.out.println("m1:");
      print1(m1); //all 0's
      System.out.println("m2:");      
      print1(m2); //2x3
      System.out.println("m3:");      
      print1(m3); //1 value, 2 values, 3 values
      System.out.println("=====================================");
      System.out.println("m1:");      
      print2(m1); //all 0's
      System.out.println("m2:");      
      print2(m2); //2x3
      System.out.println("m3:");      
      print2(m3); //1 value, 2 values, 3 values
      System.out.println("=====================================");
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));//0
      System.out.println("sum m2 : " + sum1(m2));//27
      System.out.println("sum m3 : " + sum1(m3));//21
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));//0
      System.out.println("sum m2 : " + sum2(m2));//27
      System.out.println("sum m3 : " + sum2(m3));//21
          /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class TwoDimArray
