package iterations;

import java.util.Scanner;

public class IterationExercises {

    Scanner inputNumber = new Scanner(System.in);

    //3.1: Write a method to calculate the sum of odd elements in the given array of type long using for loop.
    public int sumOddElements(long[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] " + array[i]);
            if (i % 2 != 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    // 3.2: Write a method to calculate the sum of even elements in the given array of type double using foreach loop.
    public int sumEvenElements(double[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] " + array[i]);
            if (i % 2 == 0) {
                sum += array[i];
            }
        }

        return sum;
    }

    //3.3: Write a method to play a guessing game with the numbers between 1 and 10 use do-while loop.
    public void guessNum() {

        int randNumber = (int) (Math.random()*10);
        boolean userWon = false;

        do {
            System.out.println("Please insert your guess.");
            int guess = inputNumber.nextInt();
            System.out.println("You inserted: " + guess);
            if(guess == randNumber) {
                System.out.println("You won!");
                userWon = true;
            } else {
                System.out.println("Please be patient, you will definitely win.");
            }
        }
        while(!userWon);
    }


    //3.4: Write a method to print out cube of each odd number up until the input number. use while loop.
    public void getOddCountCube() {
        int i = 1;
        System.out.println("Enter number");
        int value = inputNumber.nextInt();
        while (i <= value) {
            if (i % 2 != 0) {
                System.out.println("Cube of " + i + " = " + (i * i * i));
            }
            i++;
        }
    }
}
