package multiThreadingProblems.bankApplication;

public class WithdrawTask implements Runnable
{
    private BankAccount account;

    public WithdrawTask(BankAccount account)
    {
        this.account = account;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10000; i++)
        {
            account.withdraw(i);
        }
    }
}
