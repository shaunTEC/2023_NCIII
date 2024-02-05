public abstract class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}

class SavingAccount extends Account {
    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        if(amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw successful.\nRemaining Balance: " + getBalance());
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful.\nNew balance: " + getBalance());
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful.\nRemaining balance: " + getBalance());
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful.\nNew balance: " + getBalance());
    }
}

class Testing {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(2000);

        savingAccount.withdraw(500);
        savingAccount.deposit(200);

        checkingAccount.withdraw(1000);
        checkingAccount.deposit(500);
    }
}