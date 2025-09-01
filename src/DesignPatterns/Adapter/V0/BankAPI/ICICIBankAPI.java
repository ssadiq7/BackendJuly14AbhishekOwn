package DesignPatterns.Adapter.V0.BankAPI;

public class ICICIBankAPI
{
    public int balanceCheck()
    {
        System.out.println("ICICI Bank checking balance");
        return 100;
    }

    public void amountTransfer(int amount)
    {
        System.out.println("Transferred " + amount + " via ICICI Bank");
    }
}
