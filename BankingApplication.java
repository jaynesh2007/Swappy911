class IFE extends Exception {
    public IFE(String message) 
    {
        super(message);
    }
}

class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount + " | Current Balance: Rs " + balance);
    }
    
    public void withdraw(double amount) throws IFE {
        if (amount > balance) {
            throw new IFE("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawn: Rs " + amount + " | Remaining Balance: Rs " + balance);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(25000);
        
        try {
            account.withdraw(20000);
            account.withdraw(4000);
            account.withdraw(2000);
        } catch (IFE e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
