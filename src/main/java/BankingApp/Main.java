package BankingApp;

import BankingApp.CommandRunner.CommandRunner;
import BankingApp.User.Customer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the my bank app! Please select one of the following options using 1, 2, 3 or 4: ");
        System.out.println("1 - See Balance");
        System.out.println("2 - Deposit Amount");
        System.out.println("3 - Withdraw Amount");
        System.out.println("4 - Exit app");

        Customer userOne = new Customer("Tiffany", "Business", 50000);

        CommandRunner ncr = new CommandRunner(userOne);

        while(ncr.run()) {
            System.out.println("1 - See Balance");
            System.out.println("2 - Deposit Amount");
            System.out.println("3 - Withdraw Amount");
            System.out.println("4 - Exit app");
        }

    }
}
