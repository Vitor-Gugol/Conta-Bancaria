package entities;

public class Client {

    private int account;
    private String name;
    private double balance;

    public Client() {
    }


    public Client(int account, String name) {
        this.account = account;
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositar(double balance){
        this.balance += balance;
    }

    public void sacar(double balance){
        this.balance -= balance;
    }


}
