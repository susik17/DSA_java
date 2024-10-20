import java.util.*;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        
        // Read the input from the user
        String name = sc.nextLine();
      
        
        // Output the input back to the user
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner
        sc.close();
    }
}
