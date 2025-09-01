package DesignPatterns.Adapter.V1.PhonePeServices;

import DesignPatterns.Adapter.V1.BankAPI.BankAPI;
import DesignPatterns.Adapter.V1.BankAPI.YesBankAPI;

public class FastTagRecharge
{
    public boolean recharge(int amount, BankAPI bankAPI)
    {
        if(amount <= bankAPI.checkBalance())
        {
            System.out.println("Recharge Successful");
            return true;
        }

        System.out.println("Insufficient Balance");
        return false;
    }
}
