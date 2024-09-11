package BankingApp.CommandRunner;

import BankingApp.User.Customer;

import java.util.Scanner;

public class CommandRunner {

    static Customer customer;

    public CommandRunner(Customer customer) {
        CommandRunner.customer = customer;
    }

    public static boolean run() {
        Scanner sc =  new Scanner(System.in);

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please select 1, 2, 3 or 4 and press enter: ");
            sc.next();
        }

        int input = sc.nextInt();

        switch (input) {
            case 1:
                customer.seeBalance();
                break;
            case 2:
                //Run Deposit Amount
                break;
            case 3:
                //Run Withdraw Amount
                break;
            case 4:
                return false;
            default:
                System.out.println("Your input is outside the available options. Please select 1, 2, 3 or 4 and press enter: ");
        }
        return true;
    }

    //User should be welcomed and be given four options
    //See Balance
    //Deposit amount
    //Withdraw amount
    //Exit app

    //Options should be selected using 1, 2, 3, 4

    //See Balance should simply display user's balance

    //Deposit amount should request an amount to deposit
    //Checks need to be done to confirm it is a valid amount (i.e not a negative)
    //Return String should be handled appropriately
    //String should be split on "-" and switch used to determine next move
    //Success should simply tell user the transaction was successful
    //Failure-Negative Input should tell user the transaction failed due to a negative amount being selected for deposit
    //Once transaction is complete new balance should be displayed & user should be sent to menu to select a new option

    //Withdraw amount should request an amount to withdraw
    //Checks need to be done to confirm it is a valid amount (i.e not a negative)
    //Return String should be handled appropriately
    //String should be split on "-" and switch used to determine next move
    //Success should simply tell user the transaction was successful
    //Failure-Low Balance should tell user the transaction failed due to their balance being too low
    //Failure-Negative Input should tell user the transaction failed due to a negative amount being selected for deposit
    //Once transaction is complete new balance should be displayed & user should be sent to menu to select a new option

    //Exit app should return false to exit app
}
