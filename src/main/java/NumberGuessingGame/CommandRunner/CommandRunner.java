package NumberGuessingGame.CommandRunner;

import java.util.Scanner;

public class CommandRunner {

    public static boolean startGame () {
        String input;
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

    public static String validateGuess(int userGuess, int numToGuess) {
        if(userGuess < numToGuess) {
            return "Too Low";
        } else if (userGuess > numToGuess) {
            return "Too High";
        } else {
            return "Correct";
        }
    }
}
