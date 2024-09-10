package NumberGuessingGame;

import NumberGuessingGame.CommandRunner.CommandRunner;

public class Main {
    public static void main(String[] args) {
        while(CommandRunner.startGame()) {
            System.out.println("Running Game");
        }
    }
}
