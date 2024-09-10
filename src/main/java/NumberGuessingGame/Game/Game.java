package NumberGuessingGame.Game;

public abstract class Game {

    private String name;

    public Game(String name) {
        this.name = name;
    }

    public abstract void play();
}
