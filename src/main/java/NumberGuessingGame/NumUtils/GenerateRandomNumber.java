package NumberGuessingGame.NumUtils;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {

    public static int generateNum () {
        return ThreadLocalRandom.current().nextInt(0, 101);
    }

    public static int generateNum (int origin, int bound) {
        return ThreadLocalRandom.current().nextInt(origin, bound);
    }
}
