/* Q.9	Create a class, named Account and include the required attributes and behaviours in it. Inherit another class called “SavingsAccount” from it and add new attributes and behaviours, as needed. Inherit another class called “LoanAccount” from Account and add new attributes and
behaviours, as needed. Inherit another class called “HousingLoan” from LoanAccount and add new attributes and behaviours, as needed. Create objects of SavingsAccount and HousingLoan and perform the methods to
1. Open an account, 2. Deposit amount, 3. Withdraw amount, 4. Print the account details. (Consider applying the Access Modifiers also)

*/

public class Account{
    protected int accountNumber;
		protected double balance;

		public Account(int accountNumber) {
			this.accountNumber = accountNumber;
			this.balance = 0.0;
		}

		public void deposit(double amount) {
			balance += amount;
			System.out.println("Deposited " + amount + " into Account " + accountNumber);
		}

		public void withdraw(double amount) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Withdrawn " + amount + " from Account " + accountNumber);
			} else {
				System.out.println("Insufficient balance");
			}
		}

		public void printAccountDetails() {
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Balance: " + balance);
		}
	}

	class SavingsAccount extends Account {
		private double interestRate;

		public SavingsAccount(int accountNumber, double interestRate) {
			super(accountNumber);
			this.interestRate = interestRate;
		}

		public void addInterest() {
			balance += balance * interestRate;
			System.out.println("Interest added to Account " + accountNumber);
		}
	}

	class LoanAccount extends Account {
		private double interestRate;

		public LoanAccount(int accountNumber, double interestRate) {
			super(accountNumber);
			this.interestRate = interestRate;
		}

		public void addInterest() {
			balance += balance * interestRate;
			System.out.println("Interest added to Loan Account " + accountNumber);
		}
	}

	class HousingLoan extends LoanAccount {
		private int loanTerm;

		public HousingLoan(int accountNumber, double interestRate, int loanTerm) {
			super(accountNumber, interestRate);
			this.loanTerm = loanTerm;
		}

		public void printLoanTerms() {
			System.out.println("Loan Account Number: " + accountNumber);
			System.out.println("Loan Term: " + loanTerm + " years");
		}
}


//main  method 

public class MainQ9
{
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(101, 0.05);
		savingsAccount.deposit(1000);
		savingsAccount.addInterest();
		savingsAccount.printAccountDetails();

		HousingLoan housingLoan = new HousingLoan(201, 0.08, 20);
		housingLoan.deposit(200000);
		housingLoan.withdraw(50000);
		housingLoan.addInterest();
		housingLoan.printAccountDetails();
		housingLoan.printLoanTerms();
	}
}
/*
Output:
Deposited 1000.0 into Account 101
Interest added to Account 101
Account Number: 101
Balance: 1050.0
Deposited 200000.0 into Account 201
Withdrawn 50000.0 from Account 201
Interest added to Loan Account 201
Account Number: 201
Balance: 162000.0
Loan Account Number: 201
Loan Term: 20 years*/











