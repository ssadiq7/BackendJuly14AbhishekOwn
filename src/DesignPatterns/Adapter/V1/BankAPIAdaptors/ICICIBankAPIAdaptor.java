package DesignPatterns.Adapter.V1.BankAPIAdaptors;

import DesignPatterns.Adapter.V1.BankAPI.BankAPI;
import DesignPatterns.Adapter.V1.BankAPI.ICICIBankAPI;

public class ICICIBankAPIAdaptor implements BankAPI {
    ICICIBankAPI icicibankAPI = new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return icicibankAPI.balanceCheck();
    }

    @Override
    public void transferMoney(int amount) {
        icicibankAPI.amountTransfer(amount);
    }
}
