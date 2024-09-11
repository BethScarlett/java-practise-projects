package BankingApp.User;

public abstract class User {
    private String name;
    private String accountType;
    private float balance;

    public User(String name, String accountType, float balance) {
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
