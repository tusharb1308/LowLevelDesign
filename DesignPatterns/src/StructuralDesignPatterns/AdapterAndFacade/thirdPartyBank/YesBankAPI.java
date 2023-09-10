package StructuralDesignPatterns.AdapterAndFacade.thirdPartyBank;

public class YesBankAPI {
    public float getBalance(String userBankAccountID){
        return 100.0f;
    }

    public void updateBankAccountDetails(String username, String accountNumber){
        // if something wrong goes throw exception here
    }

    public double pay(String fromUserId, String toUserId, double amount){
        return 1;
    }
}
