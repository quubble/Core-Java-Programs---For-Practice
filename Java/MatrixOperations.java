//**Here's a complete Java program with functions for matrix addition, subtraction, and multiplication using user input.**

//**Complete Program**


import java.util.Scanner;

public class MatrixOperations {
    
    // Function to read matrix from user
    public static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    
    // Function to print matrix
    public static void printMatrix(int[][] matrix, String name) {
        System.out.println("\n" + name + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Function 1: Matrix Addition
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    
    // Function 2: Matrix Subtraction
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
    
    // Function 3: Matrix Multiplication
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Matrix dimensions for addition/subtraction (same size)
        System.out.print("Enter rows for Matrix A & B: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns for Matrix A & B: ");
        int cols = sc.nextInt();
        
        // Read Matrix A and B
        int[][] matrixA = readMatrix(sc, rows, cols);
        int[][] matrixB = readMatrix(sc, rows, cols);
        
        // Addition
        System.out.println("\n=== MATRIX ADDITION ===");
        printMatrix(matrixA, "Matrix A");
        printMatrix(matrixB, "Matrix B");
        printMatrix(addMatrices(matrixA, matrixB), "A + B");
        
        // Subtraction
        System.out.println("\n=== MATRIX SUBTRACTION ===");
        printMatrix(matrixA, "Matrix A");
        printMatrix(matrixB, "Matrix B");
        printMatrix(subtractMatrices(matrixA, matrixB), "A - B");
        
        // Multiplication (can have different columns for B)
        System.out.print("\nEnter columns for Matrix B (for multiplication): ");
        int colsB = sc.nextInt();
        matrixB = readMatrix(sc, rows, colsB);
        
        System.out.println("\n=== MATRIX MULTIPLICATION ===");
        printMatrix(matrixA, "Matrix A (" + rows + "x" + cols + ")");
        printMatrix(matrixB, "Matrix B (" + rows + "x" + colsB + ")");
        printMatrix(multiplyMatrices(matrixA, matrixB), "A x B");
        
        sc.close();
    }
}


/*  **Sample Output**
```
Enter rows for Matrix A & B: 2
Enter columns for Matrix A & B: 3
Enter elements:
Element [0][0]: 1
Element [0][1]: 2
Element [0][2]: 3
...
Enter elements:
Element [0][0]: 4
Element [0][1]: 5
Element [0][2]: 6
...

=== MATRIX ADDITION ===
Matrix A:
1	2	3	
4	5	6	
Matrix B:
4	5	6	
7	8	9	
A + B:
5	7	9	
11	13	15	

=== MATRIX SUBTRACTION ===
...
```

**Key Features**
- **Addition/Subtraction**: Same dimensions required
- **Multiplication**: RowsA × ColsB result, ColsA = RowsB
- **User-friendly input**: Element-by-element entry
- **Clean functions**: Each operation separated
- **Formatted output**: Clear matrix display with labels

**Time Complexity**
- Addition/Subtraction: O(rows × cols)
- Multiplication: O(rows × colsA × colsB)

*/