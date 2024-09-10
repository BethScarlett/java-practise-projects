package NumberGuessingGame.Game;

import NumberGuessingGame.CommandRunner.CommandRunner;
import NumberGuessingGame.NumUtils.GenerateRandomNumber;

import java.util.Scanner;

public class NumberGuesser extends Game {

    public NumberGuesser(String name) {
        super(name);
    }

    @Override
    public void play() {
        int numToGuess = GenerateRandomNumber.generateNum();
        int userGuess;
        boolean isGuessed = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ok, let's play.");
        System.out.println("A random number has been selected. Please enter your guess: ");

        while (!isGuessed) {
            while (!scanner.hasNextInt()) {
                System.out.println("Guess must be a number.");
                scanner.next();
            }

            userGuess = scanner.nextInt();

            String result = CommandRunner.validateGuess(userGuess, numToGuess);

            switch (result) {
                case "Too Low" :
                case "Too High" :
                    System.out.println("Your guess was: " + result + ". Try again: ");
                    break;
                case "Correct":
                    System.out.println("Congrats you've guessed the number!");
                    isGuessed = true;
                    break;
            }
        }
    }
}
