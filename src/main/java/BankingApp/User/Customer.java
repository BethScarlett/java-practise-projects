package BankingApp.User;

public class Customer extends User implements Transactions {
    public Customer(String name, String accountType, float balance) {
        super(name, accountType, balance);
    }

    public void seeBalance() {
        System.out.println("You have £" + getBalance() + " in your account.");
    }

    public String depositMoney(float toDeposit) {
        if(toDeposit < 0) {
            return "Failure-Negative Withdrawal";
        } else {
            setBalance(getBalance() + toDeposit);
            return "Success";
        }
    }

    public String withdrawMoney(float toWithdraw) {
        if(toWithdraw > getBalance()) {
            return "Failure-Low Balance";
        } else if(toWithdraw < 0) {
            return "Failure-Negative Withdrawal";
        } else {
            setBalance(getBalance() - toWithdraw);
            return "Success";
        }

    }
}
