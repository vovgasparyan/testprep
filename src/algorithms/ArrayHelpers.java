package algorithms;

public class ArrayHelpers {

    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

    /* Move elements of arr[0, i-1], that are
    greater than key, to one position ahead
    of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public void print(int[] array) {
        System.out.print("[");
        for (int elem: array) {
            System.out.print(elem + ",");
        }
        System.out.print("]");
    }
}
