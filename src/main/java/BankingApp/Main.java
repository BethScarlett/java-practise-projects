package BankingApp;

import BankingApp.CommandRunner.CommandRunner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the my bank app! Please select one of the following options using 1, 2, 3 or 4: ");
        System.out.println("1 - See Balance");
        System.out.println("2 - Deposit Amount");
        System.out.println("3 - Withdraw Amount");
        System.out.println("4 - Exit app");

        while(CommandRunner.run()) {
            System.out.println();
        }

    }
}
