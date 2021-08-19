//package model.entities;

/*import model.execptions.BankExecptions;

public class Account {

    private Integer number;
    private String holder;
    private Double balance, withdrawLimit;


    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return this.number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getHolder() {
        return this.holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Double getBalance() {
        return this.balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Double getWithdrawLimit() {
        return this.withdrawLimit;
    }
    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
            validaOps(amount);
            balance -= amount;
       
    }
    private void validaOps(double amount){
        if (amount>getWithdrawLimit() || getBalance() <= 0){
            throw new BankExecptions("Dado incorreto");
        }
    }


    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            ", holder='" + getHolder() + "'" +
            ", balance='" + getBalance() + "'" +
            ", withdrawLimit='" + getWithdrawLimit() + "'" +
            "}";
    }

}*/