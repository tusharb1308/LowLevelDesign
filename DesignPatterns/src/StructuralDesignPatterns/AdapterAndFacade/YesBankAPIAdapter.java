package StructuralDesignPatterns.AdapterAndFacade;

import StructuralDesignPatterns.AdapterAndFacade.thirdPartyBank.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{
    private YesBankAPI yesBankAPI;

    public YesBankAPIAdapter(){
        this.yesBankAPI = new YesBankAPI();
    }
    @Override
    public int getBalance(String userBankAccountId) {
        return 0;
    }

    @Override
    public boolean addBankAccount(String username, String bankAccountNumber) {
        return false;
    }

    @Override
    public boolean transfer(String fromUserName, String toUserName, int amount) {
        return false;
    }
}
