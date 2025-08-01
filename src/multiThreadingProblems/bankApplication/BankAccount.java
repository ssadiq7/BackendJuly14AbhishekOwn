package multiThreadingProblems.bankApplication;

public class BankAccount
{
    private long balance;

    public long getBalance() {
        return balance;
    }

    public BankAccount(long balance)
    {
        this.balance = balance;
    }

    public synchronized void deposit(int amount)
    {
        balance += amount;
    }

    public synchronized void withdraw(int amount)
    {
        balance -= amount;
    }
}
