package exception;


public class Test {
    public static void main(String[] args) {

    }
}
/*
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        try {
            // Get the name from the console
            String name = getNameFromConsole();

            // Check the name and throw CustomException if it's incorrect
            if (!isValidName(name)) {
                throw new CustomException("Invalid name entered: " + name);
            }

            // Rest of your code goes here

        } catch (CustomException e) {
            // Handle your custom exception
            System.err.println("CustomException caught: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static String getNameFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        return scanner.nextLine();
    }

    private static boolean isValidName(String name) {
        // Your logic to determine if the name is valid or not
        // For example, you might check length, characters, etc.
        return name.length() > 0;
    }
}

// CustomException.java
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}


 */