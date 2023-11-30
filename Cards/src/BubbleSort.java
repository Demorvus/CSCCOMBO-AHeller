public class BubbleSort {
    public static <T extends Comparable<T>> void bubbleSort(T[] A) {
        for (int i = 0; i < A.length - 1; i++) { // insert i'th record
            for (int j = 1; j < A.length - i; j++) {
                if (A[j - 1].compareTo(A[j]) > 0) {
                    swap(A, j - 1, j);
                }
            }
        }
    }

    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // Example usage
        Integer[] array = {4, 2, 7, 1, 9, 5};
        bubbleSort(array);

        System.out.print("Sorted Array: ");
        for (Integer element : array) {
            System.out.print(element + " ");
        }
    }
}