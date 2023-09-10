package StructuralDesignPatterns.AdapterAndFacade;

import StructuralDesignPatterns.AdapterAndFacade.thirdPartyBank.BankAccountDetails;
import StructuralDesignPatterns.AdapterAndFacade.thirdPartyBank.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter{

    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAPIAdapter(){
        this.iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public int getBalance(String userBankAccountId) {
        int balance = (int)iciciBankAPI.checkBalance("customerId");
        return balance;
    }

    @Override
    public boolean addBankAccount(String username, String bankAccountNumber) {
        String ifsc = "";
        BankAccountDetails bankAccountDetails = new BankAccountDetails(username, bankAccountNumber, ifsc);
        char result = iciciBankAPI.addBankAccount(bankAccountDetails);

        return result == 'Y';
    }

    @Override
    public boolean transfer(String fromUserName, String toUserName, int amount) {
        BankAccountDetails fromUser = new BankAccountDetails(fromUserName, "", "");
        BankAccountDetails toUser = new BankAccountDetails(toUserName, "", "");
        double amountTransfer = amount;
        char result = iciciBankAPI.makePayment(fromUser, toUser, amountTransfer);

        return result == 'Y';
    }
}
