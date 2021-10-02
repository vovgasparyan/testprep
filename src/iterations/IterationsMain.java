package iterations;

public class IterationsMain {
    public static void main(String[] args) {

        IterationExercises testObj = new IterationExercises();

        System.out.println("*** TASK 3.1 ***");
        long[] arr = new long[8];
        System.out.println("Sum of odd elements is: " + testObj.sumOddElements(arr));
        System.out.println();

        System.out.println("*** TASK 3.2 ***");
        double[] arr2 = new double[10];
        System.out.println("Sum of even elements is: " + testObj.sumEvenElements(arr2));
        System.out.println();


        System.out.println("*** TASK 3.3 ***");
        testObj.guessNum();
        System.out.println();

        System.out.println("*** TASK 3.4 ***");
        testObj.getOddCountCube();

    }
}
