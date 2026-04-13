//Access cmd arguments 

public class AccessCmdArgs {
    public static void main(String[] args) {
        // Check if arguments exist
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }
        
        // Access individual arguments
        System.out.println("First argument: " + args[0]);
        if (args.length > 1) {
            System.out.println("Second argument: " + args[1]);
        }
        
        // Loop through all arguments
        System.out.println("All arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}