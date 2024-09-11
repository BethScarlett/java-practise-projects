package BankingApp.User;

public class Customer extends User implements Transactions {
    public Customer(String name, String accountType, float balance) {
        super(name, accountType, balance);
    }

    public void seeBalance() {
        System.out.println("You have £" + getBalance() + " in your account.");
    }

    public void depositMoney(float toDeposit) {
        setBalance(getBalance() + toDeposit);
    }

    public String withdrawMoney(float toWithdraw) {
        if(toWithdraw > getBalance() || toWithdraw < 0) {
            return "Failure";
        } else {
            setBalance(getBalance() - toWithdraw);
            return "Success";
        }

    }
}
