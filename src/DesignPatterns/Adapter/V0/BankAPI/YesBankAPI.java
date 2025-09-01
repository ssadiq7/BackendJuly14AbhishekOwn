package DesignPatterns.Adapter.V0.BankAPI;

public class YesBankAPI
{
    public int getBalance()
    {
        System.out.println("Yes Bank checking balance");
        return 100;
    }

    public void moneyTransfer(int amount)
    {
        System.out.println("Transferred " + amount + " via Yes Bank");
    }
}
