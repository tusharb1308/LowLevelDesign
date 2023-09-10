package StructuralDesignPatterns.AdapterAndFacade;

public interface BankAPIAdapter {
    int getBalance(String userBankAccountId);
    boolean addBankAccount(String username, String bankAccountNumber);
    boolean transfer(String fromUserName, String toUserName, int amount);
}
