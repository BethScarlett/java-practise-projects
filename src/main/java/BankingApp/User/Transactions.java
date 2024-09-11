package BankingApp.User;

public interface Transactions {

    void seeBalance();
    String depositMoney(float toDeposit);
    String withdrawMoney(float toWithdraw);
}
