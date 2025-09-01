package DesignPatterns.Adapter.V0;

import DesignPatterns.Adapter.V0.BankAPI.YesBankAPI;
import DesignPatterns.Adapter.V0.PhonePeServices.FastTagRecharge;
import DesignPatterns.Adapter.V0.PhonePeServices.HomeLoan;

public class PhonePe
{
    private FastTagRecharge fastTagRecharge;
    private HomeLoan homeLoan;
    private YesBankAPI yesBankAPI;

    public PhonePe()
    {
        fastTagRecharge = new FastTagRecharge();
        homeLoan = new HomeLoan();
        yesBankAPI = new YesBankAPI();
    }

    public boolean rechargeFastTag(int amount)
    {
        return fastTagRecharge.recharge(amount, yesBankAPI);
    }

    public boolean availLoan(int amount)
    {
        boolean eligibility = homeLoan.checkEligibility(amount, yesBankAPI);
        if(eligibility)
        {
            System.out.println("Loan can be disbursed");
            return true;
        }

        System.out.println("Qualification criteria for loan of " + amount + " not met.");
        return false;
    }
}
