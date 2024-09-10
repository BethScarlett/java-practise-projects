package NumberGuessingGame.NumUtils;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {
    static Scanner scanner = new Scanner(System.in);

    public static int generateRandNum () {
        System.out.println("Would you like to enter a custom range for your random number? (y/n): ");
        String input;
        input = scanner.nextLine();

        while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
            System.out.println("Invalid input. Please choose y or n: ");
            input = scanner.nextLine();
        }

        switch (input) {
            case "y": {
                int numOne, numTwo;
                System.out.println("Ok, please enter your min number: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Input must be a number.");
                    scanner.next();
                }
                numOne = scanner.nextInt();
                System.out.println("Now enter your maximum number: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Input must be a number.");
                    scanner.next();
                }
                numTwo = scanner.nextInt() + 1;
                return GenerateRandomNumber.generateNum(numOne, numTwo);
            }
            case "n" :
                return GenerateRandomNumber.generateNum();
        }
        return -1;
    }

    public static int generateNum () {
        return ThreadLocalRandom.current().nextInt(0, 101);
    }

    public static int generateNum (int origin, int bound) {
        if(origin > bound) {
            System.out.println("Switching numbers due to min being greater");
            int temp = origin;
            origin = bound;
            bound = temp;
        }
        return ThreadLocalRandom.current().nextInt(origin, bound);
    }
}
