/*
Kyle Tau
APCS1 Pd2
HW9 -- CMYM
2017-10-02
*/

// Team Members: Maxwell, Angela, Kyle
// Team Name: JP Morgan-Chase

public class BankAccount {
    public String name;
    private String password;
    private int pin;
    private int acctNum;
    private double balance;

    public static void main(String[] args){
	BankAccount JPMorgan = new BankAccount(); // creating new instance of BankAccount in order to use the methods
	
	JPMorgan.setAttributes("Angela Kyle Maxwell", "abc123", 1234, 123456789, 8000000);
	// 1 2 3 4 5 6 7 8 M's in my bank account
	JPMorgan.withdraw(1000);
	JPMorgan.deposit(.01);
        JPMorgan.printInfo();
	
    }// end main

    private void setAttributes (String newName, String newPass, int newPin, int newAcctNum, double newBalance) { // takes parameters for the value of each instance variable
	name = newName; // setting each variable to the appropriate value
	password = newPass;
	pin = newPin;
	acctNum = newAcctNum;
	balance = newBalance;
    }

    private void printInfo () { // just supposed to print out the accounts info 
	System.out.println("Holder's Name: " + name);
	System.out.println("Password: " + password);
	System.out.println("4-Digit Pin: " + pin);	
	System.out.println("9-Digit Account Number: " + acctNum);
	System.out.println("Current Balance: $" + balance);
    }

    private void withdraw (double amount) { // subtracting money from the account balance
	balance -= amount;
    }
    
    private void deposit (double amount) { // adding money to the account balance
	balance += amount;
    }
      
}//end BankAccount
