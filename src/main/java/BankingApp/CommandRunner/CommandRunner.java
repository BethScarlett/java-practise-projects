package BankingApp.CommandRunner;

public class CommandRunner {

    public static boolean run() {
        System.out.println("Welcome to the my bank app! Please select one of the following options using 1, 2, 3 or 4: ");
        System.out.println("1 - See Balance");
        System.out.println("2 - Deposit Amount");
        System.out.println("3 - Withdraw Amount");
        System.out.println("4 - Exit app");
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
