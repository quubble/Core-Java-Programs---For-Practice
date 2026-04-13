//Array Min Max elements

import java.util.Scanner;

public class ArrayMinMax {
    
    // Function to find largest and smallest elements
    public static void findMinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        findMinMax(arr);
    }
}