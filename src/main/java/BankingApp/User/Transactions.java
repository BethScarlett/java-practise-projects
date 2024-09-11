package BankingApp.User;

public interface Transactions {

    void seeBalance();
    void depositMoney(float toDeposit);
    String withdrawMoney(float toWithdraw);
}
