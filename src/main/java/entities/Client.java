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

    public Client(int account, String name, double initialDeposit){
        this.account = account;
        this.name = name;
        depositar(initialDeposit);
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

    public void depositar(double balance){

        this.balance += balance;
    }

    public void sacar(double balance){
        this.balance -= balance + 5;
    }

    public String toString(){
        return "Account "
                + account
                + ", Holder:"
                + name
                +", Balance: $ "
                + String.format("%.2f,",balance);
    }
}
