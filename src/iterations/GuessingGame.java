package iterations;

import java.util.Scanner;

public class GuessingGame {

    public void play() {
        int randNumber = (int) (Math.random() * 10);
        Scanner inputScanner = new Scanner(System.in);

        boolean userWon = false;

        do {
            System.out.println("Please insert your guess.");
            int guess = inputScanner.nextInt();
            System.out.println("You inserted: " + guess);
            if(guess == randNumber) {
                System.out.println("You won!");
                userWon = true;
            } else {
                System.out.println("Your guess was incorrect.\nTry again.");
            }
        }
        while(!userWon);
    }
}
