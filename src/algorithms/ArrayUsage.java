package algorithms;

import java.util.Arrays;

public class ArrayUsage {

    public static void main(String[] args) {

        ArrayHelpers helpers = new ArrayHelpers();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.print("Generated Array: ");
        helpers.print(array);

        helpers.insertionSort(array);

        System.out.print("\nSorted Array: ");
        helpers.print(array);

        Arrays.sort(array);

    }
}
