package DesignPatterns.Adapter.V1.BankAPI;

public interface BankAPI
{
    int checkBalance();
    void transferMoney(int amount);
}
