//**Here's a complete Java program with all three functions: array sorting (asc/desc), missing number (1-N), and second largest element.**

//**Complete Program**


import java.util.Scanner;
import java.util.Arrays;

public class ArrayFunctions {
    
    // Function 1: Sort array ascending
    public static void sortAscending(int[] arr) {
        Arrays.sort(arr);
        System.out.print("Ascending: ");
        printArray(arr);
    }
    
    // Function 2: Sort array descending
    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        reverseArray(arr);
        System.out.print("Descending: ");
        printArray(arr);
    }
    
    // Function 3: Find missing number in array (1 to N)
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    
    // Function 4: Find second largest element
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    
    // Helper function to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Helper function to reverse array (for descending sort)
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example 1: Array operations
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("\n--- Array Operations ---");
        int[] ascCopy = arr.clone();
        int[] descCopy = arr.clone();
        
        sortAscending(ascCopy);
        sortDescending(descCopy);
        System.out.println("Second largest: " + findSecondLargest(arr));
        
        // Example 2: Missing number (1 to N)
        System.out.print("\nEnter size for missing number test (N-1 elements): ");
        int n = scanner.nextInt();
        int[] missingArr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements (missing one from 1-" + n + "):");
        for (int i = 0; i < n - 1; i++) {
            missingArr[i] = scanner.nextInt();
        }
        System.out.println("Missing number: " + findMissingNumber(missingArr, n));
        
        scanner.close();
    }
}


/* **Sample Output**
```
Enter array size: 6
Enter elements:
64 34 25 12 22 90

--- Array Operations ---
Ascending: 12 22 25 34 64 90 
Descending: 90 64 34 25 22 12 
Second largest: 64

Enter size for missing number test (N-1 elements): 6
Enter 5 elements (missing one from 1-6):
1 2 3 5 6
Missing number: 4
```

**Function Details**

**1. Sorting (O(n log n))**
- Ascending: `Arrays.sort()` directly
- Descending: `Arrays.sort()` + reverse

**2. Missing Number (O(n))**
```
Expected sum 1-N: n(n+1)/2
Actual sum: sum of array elements
Missing = expected - actual
```

**3. Second Largest (O(n))**
- Single pass: track largest and second largest
- Handles duplicates correctly

**Time Complexities**
- Sort: O(n log n)
- Missing number: O(n)
- Second largest: O(n)

*/

