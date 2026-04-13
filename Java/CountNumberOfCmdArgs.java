public class Main{
    public static void main(String[] args) {
        // args.length gives the number of command-line arguments
        System.out.println("Number of arguments: " + args.length);
        
        // Optional: Print each argument
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}