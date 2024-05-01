public class P2_8 
{

   	private String depositorName;
    	private String accountNumber;
    	private String accountType;
    	private double balance;

    	public P2_8(String depositorName, String accountNumber, String accountType, double initialBalance) 
	{
        	this.depositorName = depositorName;
        	this.accountNumber = accountNumber;
        	this.accountType = accountType;
        	this.balance = initialBalance;
    	}

    	public void deposit(double amount) 
	{
        	if (balance + amount >= 1000) 
		{
            		balance += amount;
            		System.out.println("Deposit of " + amount + " Rp successful.");
        	} 
		else 
		{
            		System.out.println("Insufficient balance. Minimum balance should be maintained.");
        	}
    	}

    	public void displayInfo() 
	{
        	System.out.println("Depositor Name: " + depositorName);
       		System.out.println("Account Number: " + accountNumber);
        	System.out.println("Account Type: " + accountType);
        	System.out.println("Balance: " + balance + " Rp");
    	}

    	public static void main(String[] args) 
	{
        	P2_8 myAccount = new P2_8("Gulam Shekhani", "123456789", "Savings", 1500.0);

        	System.out.println("Initial Account Information:");
        	myAccount.displayInfo();

        	myAccount.deposit(500.0);

        	System.out.println("\nUpdated Account Information after deposit:");
        	myAccount.displayInfo();
    }
}
