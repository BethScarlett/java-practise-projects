package BankingApp.CommandRunner;

import BankingApp.User.Customer;

import java.util.Scanner;

public class CommandRunner {

    static Customer customer;
    Scanner sc =  new Scanner(System.in);

    public CommandRunner(Customer customer) {
        CommandRunner.customer = customer;
    }

    public boolean run() {
        //Scanner sc =  new Scanner(System.in);

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
                depositMoney();
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

    //Deposit amount should request an amount to deposit
    //Checks need to be done to confirm it is a valid amount (i.e not a negative)
    //Return String should be handled appropriately
    //String should be split on "-" and switch used to determine next move
    //Success should simply tell user the transaction was successful
    //Failure-Negative Input should tell user the transaction failed due to a negative amount being selected for deposit
    //Once transaction is complete new balance should be displayed & user should be sent to menu to select a new option


    public void depositMoney() {
        System.out.println("How much do you wish to deposit? Please enter a non-negative number greater than zero: ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a non-negative number greater than zero: ");
            sc.next();
        }

        String result = customer.depositMoney(sc.nextDouble());

        while (!result.equalsIgnoreCase("Success")) {
            System.out.println("Invalid input. Please enter a non-negative number greater than zero: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a non-negative number greater than zero: ");
                sc.next();
            }

            result = customer.depositMoney(sc.nextDouble());
        }
    }

    //Withdraw amount should request an amount to withdraw
    //Checks need to be done to confirm it is a valid amount (i.e not a negative)
    //Return String should be handled appropriately
    //String should be split on "-" and switch used to determine next move
    //Success should simply tell user the transaction was successful
    //Failure-Low Balance should tell user the transaction failed due to their balance being too low
    //Failure-Negative Input should tell user the transaction failed due to a negative amount being selected for deposit
    //Once transaction is complete new balance should be displayed & user should be sent to menu to select a new option
}