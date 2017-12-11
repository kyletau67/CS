// Kyle Tau
// APCS1 pd2
// HW45 -- In America, the Driver Sits on the Left
// 2017-12-4

/***************************
 * class SuperArray version 3.0
 * Wrapper class for array. Facilitates resizing,
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 *
 * ...and now SuperArray complies with the specifications of the
 * ListInt interface. (ListInt.java must be in same dir as this file)
 ***************************/

public class SuperArray implements List
{
    private Object[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray()
    {
	_data = new Object[10];
	_size = 0;
    }


    //output SuperArray in [a,b,c] format
    public String toString()
    {
	String foo = "[";
	for( int i = 0; i < _size; i++ ) {
	    foo += _data[i] + ",";
	}
	if ( foo.length() > 1 )
	    //shave off trailing comma
	    foo = foo.substring( 0, foo.length()-1 );
	foo += "]";
	return foo;
    }


    //double capacity of SuperArray
    private void expand()
    {
	Object[] temp = new Object[ _data.length * 2 ];
	for( int i = 0; i < _data.length; i++ )
	    temp[i] = _data[i];
	_data = temp;
    }


    //accessor -- return value at specified index
    public Object get( int index )
    {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException("Index out of bounds."); }
	return _data[index];
    }


    //mutator -- set value at index to newVal,
    //           return old value at index
    public Object set( int index, Object o )
    {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException("Index out of bounds."); }	
	Object temp = _data[index];
	_data[index] = o;
	return temp;
    }


    //adds an item after the last item
    public boolean add( Object x )
    {
	add( _size, x );
	return true;
    }


    //inserts an item at index
    public void add( int index, Object x )
    {
	if (index != _size) {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException("Index out of bounds."); }}
	//first expand if necessary
	if ( _size >= _data.length )
	    expand();
	for( int i = _size; i > index; i-- ) {
	    _data[i] = _data[i-1]; //each slot gets value of left neighbor
	}
	_data[index] = x;
	_size++;
    }


    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    //returns removed value
    public Object remove( int index )
    {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException("Index out of bounds."); }
	Object retObjct = _data[index];
	for( int i = index; i < _size - 1; i++ ) {
	    _data[i] = _data[i+1];
	}
	_size--;
	return retObjct;
    }


    //return number of meaningful items in _data
    public int size()
    {
	return _size;
    }



    //main method for testing
    public static void main( String[] args )
    {
	List mayfield = new SuperArray();
	System.out.println("Working with List type SuperArray");
	System.out.println("Printing empty SuperArray mayfield...");
	System.out.println(mayfield);

	mayfield.add(5);
	mayfield.add(4);
	mayfield.add(3);
	mayfield.add(2);
	mayfield.add(1);
	mayfield.add("hello");
	//mayfield.set(100000, 5); //error
	//mayfield.get(-5); //error
	System.out.println("Printing populated SuperArray mayfield...");
	System.out.println(mayfield);
    
	SuperArray mayfield2 = new SuperArray();
	System.out.println("====================================================");
	System.out.println("Now working with SuperArray");
	mayfield2.add("oh");
	mayfield2.add(4);
	mayfield2.add(3.5);
	mayfield2.add(2);
	mayfield2.add("hi");
	System.out.println("Printing populated SuperArray mayfield...");
	System.out.println(mayfield2);
	mayfield2.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield2);
	mayfield2.remove(3);
	System.out.println("Printing SuperArray mayfield post-remove...");
	System.out.println(mayfield2);

	mayfield2.add(3,99);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield2);
	mayfield2.add(2,88);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield2);
	mayfield2.add(1,77);
	System.out.println("Printing SuperArray mayfield post-insert...");
	System.out.println(mayfield2);
	//mayfield2.remove(12231312); //error
	//mayfield2.add(-1,5); //error
	//mayfield2.set(100000, 5); //error
	//mayfield2.get(-5); //error
    }//end main()


}//end class

