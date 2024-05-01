class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
        System.out.println("Current Balance: Rs. " + balance);
    }

    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
            System.out.println("Current Balance: Rs. " + balance);
        } else {
            throw new InsufficientFundsException("Not Sufficient Fund. Available balance: Rs. " + balance);
        }
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class P45_2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        account.deposit(5000);

        try {
            account.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(3500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
