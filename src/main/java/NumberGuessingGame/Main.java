package NumberGuessingGame;

import NumberGuessingGame.CommandRunner.CommandRunner;
import NumberGuessingGame.Game.Game;
import NumberGuessingGame.Game.NumberGuesser;

public class Main {
    public static void main(String[] args) {
        while(CommandRunner.startGame()) {
            Game game = new NumberGuesser("Number Guesser");
            game.play();
        }
    }
}
