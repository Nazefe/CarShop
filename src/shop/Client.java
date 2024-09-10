package shop;

public class Client {
    private String name;
    private String surname;
    private int bank_account;
    private boolean balance;

    public Client(String name, String surname, int bank_account, boolean balance) {
        this.name = name;
        this.surname = surname;
        this.bank_account = bank_account;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBank_account() {
        return bank_account;
    }

    public void setBank_account(int bank_account) {
        this.bank_account = bank_account;
    }

    public boolean isBalance() {
        return balance;
    }

    public void setBalance(boolean balance) {
        this.balance = balance;
    }
}
