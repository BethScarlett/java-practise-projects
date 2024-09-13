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
                withdrawMoney();
                break;
            case 4:
                return false;
            default:
                System.out.println("Your input is outside the available options. Please select 1, 2, 3 or 4 and press enter: ");
        }
        return true;
    }

    public void depositMoney() {
        System.out.println("How much do you wish to deposit? Please enter a non-negative number greater than zero: ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a non-negative number greater than zero: ");
            sc.next();
        }

        String result = customer.depositMoney(sc.nextDouble());

        while (!result.equalsIgnoreCase("Success")) {
            System.out.println("Error: " + result.split("-")[1]);
            System.out.println("Please enter another amount: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a non-negative number greater than zero: ");
                sc.next();
            }

            result = customer.depositMoney(sc.nextDouble());
        }
    }

    public void withdrawMoney() {
        customer.seeBalance();
        System.out.println("How much do you wish to withdraw? Please enter a non-negative number greater than zero: ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a non-negative number greater than zero: ");
            sc.next();
        }

        String result = customer.withdrawMoney(sc.nextDouble());

        while (!result.equalsIgnoreCase("Success")) {
            System.out.println("Error: " + result.split("-")[1]);
            System.out.println("Please enter another amount: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a non-negative number greater than zero: ");
                sc.next();
            }

            result = customer.withdrawMoney(sc.nextDouble());
        }
    }
}