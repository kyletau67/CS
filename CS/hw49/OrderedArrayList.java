/*Kyle Tau
APCS1 pd 2
HW49 -- Halving the Halves
2017-12-07*/

/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList()
    {
	_data = new ArrayList<Comparable>();    
    }


    public String toString()
    {
	return _data.toString(); 
    }


    public Comparable remove( int index )
    {	
	return _data.remove(index); 
    }


    public int size()
    { 
	return _data.size();
    }

    
    public Comparable get( int index )
    { 
	return _data.get(index); 
    }


    /***
     * add takes as input any comparable object 
     * (i.e., any object of a class implementing interface Comparable)
     * inserts newVal at the appropriate index
     * maintains ascending order of elements
     * uses a linear search to find appropriate index
     ***/
    public void add( Comparable newVal )
    { 
	for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { 
		//newVal < oal[p]
		_data.add( p, newVal );
		return; //Q:why not break?
	    }
	}
	_data.add( newVal ); //newVal > every item in oal, so add to end 
    }

    public void addBin( Comparable newVal) {
	if (size() == 0) {
	    _data.add(newVal); }
	else {
	    addBin(newVal,0,size()); }
    }
    
    public void addBin( Comparable newVal, int lo, int hi) {
	int avg = (int) ((hi + lo) / 2);
        if (size() == 1) {
	    if (newVal.compareTo(_data.get(avg)) < 0) {
		_data.add(0, newVal); }
	    else {
		_data.add(newVal);}
	    return;
	}
	if (lo == hi) {
	    _data.add(lo, newVal);
	    return;}
      	else {
	    if (avg == 0) {
		if ((newVal.compareTo(_data.get(avg)) > 0)&&(newVal.compareTo(_data.get(avg+1)) < 0)) {
		    System.out.println("hi");
		    _data.add(avg+1, newVal); }
		else if (newVal.compareTo(_data.get(avg+1)) >= 0){
		    System.out.println("bye");
		    _data.add(newVal); }
		else {
		    _data.add(avg, newVal); }
	    }//takes care of 2 element range
	    else if (newVal.compareTo(_data.get(avg-1)) < 0) {
		addBin(newVal, lo, avg-1);
	    }
	    else {
		addBin(newVal, avg, hi+1);
	    } //recursively breaks down into a 2 element range
		}
    }

    // main method solely for testing purposes
    public static void main( String[] args )
    {
	OrderedArrayList Franz = new OrderedArrayList();

	// testing linear search
	for( int i = 0; i < 15; i++ ) {
	    Franz.addBin( (int)( 50 * Math.random() ) );
	    System.out.println(Franz); }
	System.out.println( Franz );

	//check for sorted-ness
	//if msg does not appear, list was sorted
	for( int i=0; i<Franz.size()-1; i++ ) {
	    System.out.println("at i: " + Franz.get(i) );
	    if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
		System.out.println( " *** NOT sorted *** " );
		break;
	    }
	}
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class OrderedArrayList
