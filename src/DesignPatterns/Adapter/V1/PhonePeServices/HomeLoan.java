package DesignPatterns.Adapter.V1.PhonePeServices;

import DesignPatterns.Adapter.V1.BankAPI.BankAPI;
import DesignPatterns.Adapter.V1.BankAPI.YesBankAPI;

public class HomeLoan
{
    public boolean checkEligibility(int amount, BankAPI bankAPI)
    {
        /* The amount in account should be at least 10% of loan amount */
        if(bankAPI.checkBalance() >= 0.1 * amount)
        {
            System.out.println("Eligible for a home loan");
            return true;
        }

        System.out.println("Amount in savings isn't sufficient");
        return false;
    }
}
