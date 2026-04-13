//Find duplicate elements in an array

/*Here's a Java function program to find duplicate elements in an array using HashSet (most efficient approach).**

**Complete Program**
```java*/

import java.util.*;

public class FindDuplicates {
    
    // Function to find and print duplicate elements
    public static void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : arr) {
            if (!seen.add(num)) {  // add() returns false if already exists
                duplicates.add(num);
            }
        }
        
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.print("Duplicate elements: ");
            for (int dup : duplicates) {
                System.out.print(dup + " ");
            }
            System.out.println();
        }
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
        
        findDuplicates(arr);
    }
}


/* **Sample Output**
```
Enter array size: 8
Enter 8 elements:
1 2 3 4 2 5 3 6
Duplicate elements: 2 3 

Enter array size: 5
Enter 5 elements:
1 2 3 4 5
No duplicates found.
```

**How HashSet Works**
```
Array: [1, 2, 3, 4, 2, 5, 3, 6]
seen.add(1) → true (add 1)
seen.add(2) → true (add 2)  
seen.add(3) → true (add 3)
seen.add(4) → true (add 4)
seen.add(2) → false (duplicate! add to duplicates)
seen.add(5) → true (add 5)
seen.add(3) → false (duplicate! add to duplicates)
seen.add(6) → true (add 6)
Result: duplicates = {2, 3}
```

**Key Features**
- **O(n) time complexity** using HashSet
- **Handles multiple duplicates** (prints each unique duplicate once)
- **Space efficient**: O(n) extra space
- **Clean output**: Clear "No duplicates found" message
- **User input**: Dynamic array size and values
*/

/* **Alternative Brute Force (O(n²))**
```Java


// Nested loops approach (less efficient)
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            System.out.print(arr[i] + " ");
            break;
        }
    }
}


/*HashSet is recommended** for interviews and production code due to linear time complexity. */

