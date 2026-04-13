//The transpose of a matrix swaps its rows and columns, so element at position (i,j) moves to (j,i). Here's a complete Java function program to compute and print the transpose.

//## Core Function


/*
public class MatrixTranspose {
    // Function to compute transpose of matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}

*/

//## Complete Example Program


public class MatrixTranspose {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        System.out.println("Original matrix:");
        printMatrix(matrix);
        
        int[][] transposed = transpose(matrix);
        System.out.println("\nTransposed matrix:");
        printMatrix(transposed);
    }
}

/*

## Sample Output
```
Original matrix:
1 2 3 
4 5 6 

Transposed matrix:
1 4 
2 5 
3 6 
```

## Key Points
- Time complexity: O(rows × cols)
- Space complexity: O(cols × rows) for new matrix
- Works for any rectangular matrix
- For square matrices, you can modify in-place by swapping elements across diagonal [geeksforgeeks](https://www.geeksforgeeks.org/java/java-transpose-matrix/)

*/

