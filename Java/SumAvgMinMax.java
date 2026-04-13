//Stats calculator

public class Main {
    
    // Function to calculate sum
    public static double calculateSum(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    // Function to calculate average
    public static double calculateAverage(double[] numbers) {
        return calculateSum(numbers) / numbers.length;
    }
    
    // Function to find minimum
    public static double findMin(double[] numbers) {
        double min = numbers[0];
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
    // Function to find maximum
    public static double findMax(double[] numbers) {
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide numbers as command-line arguments.");
            return;
        }
        
        // Convert string arguments to double array
        double[] numbers = new double[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Double.parseDouble(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: All arguments must be valid numbers.");
            return;
        }
        
        // Calculate and print results
        System.out.printf("Sum: %.2f%n", calculateSum(numbers));
        System.out.printf("Average: %.2f%n", calculateAverage(numbers));
        System.out.printf("Minimum: %.2f%n", findMin(numbers));
        System.out.printf("Maximum: %.2f%n", findMax(numbers));
    }
}