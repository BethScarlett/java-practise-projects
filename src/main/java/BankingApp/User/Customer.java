package BankingApp.User;

import java.text.DecimalFormat;

public class Customer extends User implements Transactions {
    private final DecimalFormat df = new DecimalFormat("0.00");

    public Customer(String name, String accountType, double balance) {
        super(name, accountType, balance);
    }

    public void seeBalance() {
        System.out.println("You have £" + df.format(getBalance()) + " in your account.");
    }

    public String depositMoney(double toDeposit) {
        if(toDeposit < 0) {
            return "Failure-Negative Input";
        } else {
            setBalance(getBalance() + toDeposit);
            return "Success";
        }
    }

    public String withdrawMoney(double toWithdraw) {
        if(toWithdraw > getBalance()) {
            return "Failure-Low Balance";
        } else if(toWithdraw < 0) {
            return "Failure-Negative Input";
        } else {
            setBalance(getBalance() - toWithdraw);
            return "Success";
        }

    }
}
