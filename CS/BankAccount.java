// Team Something - Sean, Tim, Bing
// APCS1 pd2
// HW #10 -- Mo Money Mo Problems ...but we can MAKE MO AWESOME
// 2017-10-03 

public class BankAccount {

    /* default constructor: initializes instance vars to default vals
       precondition:  none
       postcondition: instance vars have appropriate default vals
       ````````````````````````````````````````````````````*/
    public BankAccount() {
	name = "";
	passwd = "";
	pin = 0000;
	acctNum = 000000000;
	balance = 0; }

    /* overloaded constructor: allows caller to specify account 
                               number and passwd. Assigns defaults
                               to other instance vars.
       precondition:  params are passed in specified order
       postcondition: instance vars have values specified by params
       ````````````````````````````````````````````````````*/
    public BankAccount( int newAcctNum, String newPass ) {
	acctNum = newAcctNum;
	passwd = newPass;}

    /* overloaded constructor: allows caller to specify instance vars
       precondition:  params are passed in specified order
       postcondition: instance vars have values specified by params
       ````````````````````````````````````````````````````*/
    public BankAccount( int newAcctNum, String newPass, 
			double newBal, String newName, int newPin ) {
	acctNum = newAcctNum;
	passwd = newPass;
	balance = newBal;
	name = newName;
	pin = newPin;}

    //instance variables
	private String name;
        private String passwd;
	private int pin;
	private int acctNum;
	private double balance;
	
    //mutators
    public String setName( String newName ) {
	String oldName = name; //Sets value of "oldName" to name.
	name = newName; //Sets value of "name" to newName.
	return oldName; //Returns oldName.
    }

    public String setPasswd( String newPasswd ) {
	String oldPasswd = passwd; //Sets value of "oldPasswd" to passwd.
	passwd = newPasswd; //Sets value of "passwd" to newPasswd.
	return oldPasswd; //Returns oldPasswd.
    }

    public int setPin( int newPin ) {
	int oldPin = pin; //Sets value of "oldPin" to pin.
	if(newPin > 1000 && newPin < 9998) { //If the newPin is between 1000 and 9998...
	    pin = newPin;                    //set the value of "pin" to newPin.
	}
	else {           																							//Otherwise...
	    pin = 9999;  																							//Set the value of "pin" to 9999 and...
	    System.out.println("ERROR: PIN must be within the interval (1000, 9998)  \nYou entered: " + newPin);	//Prints error message.
	}
	return oldPin; //Returns oldPin.
	}

    public int setAcctNum( int newAcctNum ) {
      	int oldAcctNum = acctNum; //Sets value of "oldAcctNum" to acctNum.
	if(newAcctNum >= 100000000 && newAcctNum <= 999999998) { //If newAcctNum is between 100000000 and 999999998...
	    acctNum = newAcctNum;								 //Set value of "acctNum" to newAcctNum.
	}
	else {																																//Otherwise...
	    acctNum = 999999999;																											//Set value of "acctNum" to 999999999 and...
	    System.out.println("ERROR: Account number must be within the interval [100000000,999999998] \nYou entered: " + newAcctNum);		//Print error message.
	}
	return oldAcctNum; //Returns oldAcctNum
    }

    public double setBalance( double newBalance ) {
	double oldBalance = balance; //Sets value of "oldBalance" to balance.
	balance = newBalance; //Sets value of "balance" to newBalance.
	return oldBalance; //Returns oldBalance.
    }

    public void deposit( double depositAmount ) {
	balance = balance + depositAmount; //Adds the value of "depositAmount" to the value of "balance". This is the new value of "balance".
    }

    public Boolean withdraw(double withdrawAmount) {
	if( withdrawAmount > balance) {																								//If value of "withdrawAmount" is greater than the value of "balance"...
	    System.out.println("ERROR: You do not have enough money to withdraw $" + withdrawAmount + "\nYou have: $" + balance);	//Print error message.
	    return false; //Returns False
	}
	else {										//Otherwise...
	    balance = balance - withdrawAmount;		//Subtract value of "withdrawAmount" from the value of "balance" and set it as the new value of "balance".
	    return true; //Returns True
	}
    }

    public Boolean authenticate(int yourAcctNum, String yourPasswd) {
	if( yourAcctNum == acctNum && yourPasswd == passwd) { //If value of "yourAcctNum" is equal to value of "acctNum" and the value of "yourPasswd" is equal to the value of "passwd"...
	    return true;									  //Returns True.
	}
	else {				//Otherwise...
	    return false;	//Returns False.
	}
    }
    //overwritten toString()
    public String toString() { //Main Output
	String retStr = "\nAccount info:\n=======================";
	retStr = retStr + "\nName: " + name;
	retStr = retStr + "\nPassword: " + passwd;
	retStr = retStr + "\nPIN: " + pin;
	retStr = retStr + "\nAccount Number: " + acctNum;
	retStr = retStr + "\nBalance: " + balance;
	retStr = retStr + "\n=======================";
	return retStr;	//Returns retStr
    }


    //main method for testing
    public static void main( String[] args ) {
		//Sets test values:

		}//end main()
}//end class BankAccount
