package DesignPatterns.Adapter.V0.PhonePeServices;

import DesignPatterns.Adapter.V0.BankAPI.YesBankAPI;

public class FastTagRecharge
{
    public boolean recharge(int amount, YesBankAPI yesBankAPI)
    {
        if(amount <= yesBankAPI.getBalance())
        {
            System.out.println("Recharge Successful");
            return true;
        }

        System.out.println("Insufficient Balance");
        return false;
    }
}
