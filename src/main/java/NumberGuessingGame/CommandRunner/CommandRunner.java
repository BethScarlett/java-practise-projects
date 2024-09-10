package NumberGuessingGame.CommandRunner;

import java.util.Scanner;

public class CommandRunner {

    public static boolean startGame () {
        String input =  "";
        System.out.println("Welcome to a simple number guessing game. Would you like to play? Type y to play or n to leave");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
            System.out.println("Invalid input. Please choose y or n: ");
            input = scanner.nextLine();
        }

        return switch (input) {
            case "y" -> true;
            case "n" -> false;
            default -> throw new IllegalStateException("Unexpected value: " + input);
        };
    }
}
