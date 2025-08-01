package multiThreadingProblems.bankApplication;

public class DepositTask implements Runnable
{
    private BankAccount account;

    public DepositTask(BankAccount account)
    {
        this.account = account;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10000; i++)
        {
            account.deposit(i);
        }
    }
}
