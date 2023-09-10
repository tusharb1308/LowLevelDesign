package StructuralDesignPatterns.AdapterAndFacade.thirdPartyBank;

public class BankAccountDetails {
    private String username;
    private String accountNumber;
    private String ifscCode;

    public BankAccountDetails(String username, String accountNumber, String ifscCode){
        this.username = username;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    public BankAccountDetails(){}
}
