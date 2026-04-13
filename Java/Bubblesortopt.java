public class Bubblesortopt {

    // Optimized bubble sort (ascending order)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            // Inner loop: last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Original array: ");
        for (int x : data) {
            System.out.print(x + " ");
        }
        System.out.println();

        bubbleSort(data);

        System.out.print("Sorted array: ");
        for (int x : data) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}