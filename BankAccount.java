package hackerrank.algorithms;

public class BankAccount {
    private String owner;
    private Double balance;

    public void deposit(Double depositAmount) {
        balance += depositAmount;
    }

    public Double withdraw(Double withdrawAmount) {
        if (withdrawAmount > balance)
            return -1.0;
        balance -= withdrawAmount;
        return withdrawAmount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        BankAccountBuilder
        this.balance = balance;
    }
}
