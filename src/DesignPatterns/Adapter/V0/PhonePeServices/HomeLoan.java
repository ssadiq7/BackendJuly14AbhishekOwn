package DesignPatterns.Adapter.V0.PhonePeServices;

import DesignPatterns.Adapter.V0.BankAPI.YesBankAPI;

public class HomeLoan
{
    public boolean checkEligibility(int amount, YesBankAPI yesBankAPI)
    {
        /* The amount in account should be at least 10% of loan amount */
        if(yesBankAPI.getBalance() >= 0.1 * amount)
        {
            System.out.println("Eligible for a home loan");
            return true;
        }

        System.out.println("Amount in savings isn't sufficient");
        return false;
    }
}
