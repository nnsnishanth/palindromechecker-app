
    /**
     * UseCase1PalindromeCheckerApp
     * -----------------------------------
     * Palindrome Checker Application
     * Version: 1.0
     * @author: nnsnishanth
     * UC1: Application Entry & Welcome Message
     */

    public class PalindromeCheckerApp {

        // Application constants
        private static final String APP_NAME = "Palindrome Checker App";
        private static final String APP_VERSION = "Version 1.0";

        /**
         * Main method - Entry point of the application
         * JVM invokes this method automatically.
         */
        public static void main(String[] args) {

            // Display welcome message
            System.out.println("========================================");
            System.out.println("        " + APP_NAME);
            System.out.println("        " + APP_VERSION);
            System.out.println("========================================");

            System.out.println("\nWelcome to the Palindrome Checker Application!");
            System.out.println("This application will help you verify whether");
            System.out.println("a given string is a palindrome.\n");

            // Application flow continues to next use case
            System.out.println("Application started successfully...");
        }
    }


