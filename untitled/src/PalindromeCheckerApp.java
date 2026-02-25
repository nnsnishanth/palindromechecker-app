public class PalindromeCheckerApp { */
    public static void runUC2() {

        System.out.println("---- UC2: Half-Length Comparison ----");

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome + "\n");
    }

/**
}
