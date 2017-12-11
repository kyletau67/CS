/* Kyle Tau
APCS1 pd 2
HW41 -- Array of Steel
2017-11-27 */

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    /* YOUR IMPLEMENTATION HERE */
      _data = new int[10];
      _size = 10;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
      String s = ""; //starting string
      s+="[";
      for (int i = 0; i < _size; i++) {
	  if (i == _size-1) {
	      s+= _data[i]; } //last element, no comma
	  else {
	      s+= _data[i] + ","; } //elements before the last
      }
      s+="]";  
      return s;
  }


  //double capacity of SuperArray
  private void expand()
  {
      int[] _newdata = new int[_size*2]; //doubles in size
      for (int i = 0; i < _size; i++) {
	  _newdata[i] = _data[i]; //fill in elements
      }
      _data = _newdata; //_data is replaced by the new version
      _size = _data.length; //resets size
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
      return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
      int temp = _data[index]; //holds old value
      _data[index] = newVal; //replace
      return temp; //old value
  }


  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
          /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
