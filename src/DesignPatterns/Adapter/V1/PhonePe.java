package DesignPatterns.Adapter.V1;

import DesignPatterns.Adapter.V1.BankAPI.BankAPI;
import DesignPatterns.Adapter.V1.BankAPI.YesBankAPI;
import DesignPatterns.Adapter.V1.BankAPIAdaptors.YesBankAPIAdaptor;
import DesignPatterns.Adapter.V1.PhonePeServices.FastTagRecharge;
import DesignPatterns.Adapter.V1.PhonePeServices.HomeLoan;

public class PhonePe
{
    private FastTagRecharge fastTagRecharge;
    private HomeLoan homeLoan;
    private BankAPI bankAPI;

    public PhonePe()
    {
        fastTagRecharge = new FastTagRecharge();
        homeLoan = new HomeLoan();
        bankAPI = new YesBankAPIAdaptor();
    }

    public boolean rechargeFastTag(int amount)
    {
        return fastTagRecharge.recharge(amount, bankAPI);
    }

    public boolean availLoan(int amount)
    {
        boolean eligibility = homeLoan.checkEligibility(amount, bankAPI);
        if(eligibility)
        {
            System.out.println("Loan can be disbursed");
            return true;
        }

        System.out.println("Qualification criteria for loan of " + amount + " not met.");
        return false;
    }
}
