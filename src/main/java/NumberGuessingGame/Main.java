package NumberGuessingGame;

import NumberGuessingGame.CommandRunner.CommandRunner;
import NumberGuessingGame.Game.Game;
import NumberGuessingGame.Game.NumberGuesser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to a simple number guessing game. Would you like to play? Type y to play or n to leave: ");
        while(CommandRunner.startGame()) {
            Game game = new NumberGuesser("Number Guesser");
            game.play();
            System.out.println("Would you like to play again? Y for yes or N for no: ");
        }
    }
}
