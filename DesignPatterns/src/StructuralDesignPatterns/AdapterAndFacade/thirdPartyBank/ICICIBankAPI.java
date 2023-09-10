package StructuralDesignPatterns.AdapterAndFacade.thirdPartyBank;

public class ICICIBankAPI {
    public float checkBalance(String customerID){
        return 100.0f;
    }

    public char addBankAccount(BankAccountDetails bankAccountDetails){
        return 'Y';
    }

    public char makePayment(BankAccountDetails fromUser, BankAccountDetails toUser, double amount){
        return 'Y';
    }
}
