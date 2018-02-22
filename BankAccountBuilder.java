package hackerrank.algorithms;

public class BankAccountBuilder {
    private String owner;
    private Double balance;

    public BankAccountBuilder setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public BankAccountBuilder setBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    public BankAccount createBankAccount() {
        return new BankAccount(owner, balance);
    }
}