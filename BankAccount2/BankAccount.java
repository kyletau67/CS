// Team Noodles, Team :Kyle Tau, Soojin Choi, Victor Lin
// APCS1 pd02
// HW10 -- No Money Mo Problems
// 2017-10-03

public class BankAccount
{
  //instance variables
  private String name;
  private String passwd;
  private int pin;
  private int acctNum;
  private double balance;


  //mutators
  
  //changes account name, returns name prior to change
  public String setName( String newName )
  {
    String oldName = name;
    name = newName;
    return oldName;
  }

  //changes account password, returns password prior to change
  public String setPasswd( String newPasswd )
  {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  //changes PIN, returns PIN prior to change
  public int setPin( int newPin )
  {
    int oldPin = pin;
	// if it is out of bounds [1000,9998], PIN set to 9999
	if (newPin > 9998 || newPin < 1000){
		pin = 9999;
		System.out.println("Invalid PIN");
		System.out.println("PIN must be between 1000 and 9998 inclusive");
		return oldPin;
	}
	else{
		pin = newPin;
		return oldPin;
	}
  }

  //changes account number, returns account number prior to change
  public int setAcctNum( int newAcctNum )
  {
	int oldAcctNum = acctNum;
	//if it is out of bounds [100000000,999999998], account number set to 999999999
	if (newAcctNum > 999999998 || newAcctNum < 100000000){
		acctNum = 999999999;
		System.out.println("Invalid Account Number");
		System.out.println("Account Number must be between 100000000 and 999999998 inclusive");
		return oldAcctNum;
	}
	else{
		acctNum = newAcctNum;
		return oldAcctNum;
	}
  }

  //changes balance instance var, returns balance prior to change
  public double setBalance( double newBalance )
  {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }

  //deposit money
  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }
  
  //returns error if the requested amount exceeds amount in balance, returns true and withdraws money otherwise
  public boolean withdraw( double withdrawAmount){
	if (withdrawAmount > balance){
		System.out.println("Your requested amount exceeds account value");
		System.out.println("withdrawal denied");
		return false;
	}
	else{
		balance = balance - withdrawAmount;
		return true;
	}
  }

  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }

  // returns true if inputs match BankAccount identification, false otherwise
  public boolean authenticate(int accountNum, String accountPass){
	if (accountNum == acctNum && accountPass == passwd){
		return true;
	}
	else{
		return false;
	}
  }

  //main method for testing
  public static void main( String[] args )
  {
	 BankAccount richard = new BankAccount();
	 richard.setBalance(0.0);
	 richard.setName("steve");
	 richard.setPasswd("hellosteve123");
	 richard.setPin(1234);
	 richard.setAcctNum(123456789);
	 System.out.println(richard);
	 richard.deposit(452.45);
	 System.out.println(richard);
	 richard.withdraw(452.45);
	 System.out.println(richard);
	 System.out.println(richard.authenticate(richard.acctNum,richard.passwd));
  }//end main()

}//end class BankAccount
