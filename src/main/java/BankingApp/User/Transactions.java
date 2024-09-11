package BankingApp.User;

public interface Transactions {

    void seeBalance();
    String depositMoney(double toDeposit);
    String withdrawMoney(double toWithdraw);
}
