//Team Noodles - Soojin, Victor, Kyle
//APCS1 pd2
//HW 11 -- Breaking the Bank
//2017-10-04

public class Teller {
    public static void main(String[] args) {
	//OVERLOADED CONSTRUCTOR CALL 1
	BankAccount tom = new BankAccount(111111111, "hello123");
	System.out.println(tom);
	System.out.println("------------------------------------------------------------------------");

	//OVERLOADED CONSTRUCTOR CALL 2
	BankAccount todd = new BankAccount(123456789, "moneybags", 2345.23, "Todd Shirley", 9876);
	System.out.print(todd);
	System.out.println("------------------------------------------------------------------------");

	//NORMAL CALLING OF BANKACCOUNT
       	BankAccount bob = new BankAccount();
       	bob.setName("Bob Dylan");
       	bob.setPasswd("password");
       	bob.setPin(123456);
       	bob.setAcctNum(14445464);
       	bob.setBalance(500);
       	bob.withdraw(1000);
       	bob.deposit(250);
      	bob.authenticate(999999999, "password");
	System.out.println(bob);
	System.out.println("------------------------------------------------------------------------");
    }
}
