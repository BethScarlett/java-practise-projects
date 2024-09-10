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
        System.out.println("Ok, let's play.");

        int numToGuess = GenerateRandomNumber.generateNum();

        System.out.println("A random number has been selected. Please enter your guess: ");

        Scanner scanner = new Scanner(System.in);

        int userGuess = scanner.nextInt();

        while (!CommandRunner.validateGuess(userGuess, numToGuess).equals("Correct")) {
            System.out.println("Your guess was: " + CommandRunner.validateGuess(userGuess, numToGuess) + ". Try again: ");
            userGuess = scanner.nextInt();
        }

        System.out.println("Congrats you've guess the number!");
    }
}
