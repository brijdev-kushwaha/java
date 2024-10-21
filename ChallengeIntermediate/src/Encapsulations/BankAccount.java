package Encapsulations;

public class BankAccount {
	private String accountHolderName;
	private int accountNumber;
	private int balance;
	
	public BankAccount(String accountHolderName, int accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}
	
	public void deposite(int money) {
	   if(money > 0) {
		   balance += money;
		   System.out.println("Money deposited succesfully: " + balance);
	   }else {
		   System.out.print("invailid Money.....");
	   }
	}
	
	
	public int withdraw(int money) {
		if(balance >= money) {
			balance -= money;
			System.out.println("Money withdraw succesfully: " + money );
		}else if(money > balance) {
			System.out.println("Insufficient balance"  );
		}
		else {
			money = balance;
			money = 0;
		}
		return money;
	}
	
	
	
		public void currentBalance() {
			this.balance = balance;
			System.out.print("Current balance in your account is : " + balance);
		}
		
		
		public static void main(String[] args) {
			BankAccount Bank = new BankAccount("Brijdev" , 752305523);
		    Bank.deposite(100);
		    Bank.withdraw(300);
		    Bank.currentBalance();
		   
		}
}
