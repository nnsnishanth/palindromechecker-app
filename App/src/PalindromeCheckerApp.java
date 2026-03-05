import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    // Simple Two-Pointer Method
    public static boolean twoPointer(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Stack Method
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reverse = "";
        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }

        return input.equals(reverse);
    }

    // Deque Method
    public static boolean dequeMethod(String input) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App - Usecase 13");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        // Measure Two-Pointer
        long start1 = System.nanoTime();
        boolean r1 = twoPointer(input);
        long end1 = System.nanoTime();

        // Measure Stack
        long start2 = System.nanoTime();
        boolean r2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Measure Deque
        long start3 = System.nanoTime();
        boolean r3 = dequeMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + r1 + " Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Result: " + r2 + " Time: " + (end2 - start2) + " ns");
        System.out.println("Deque Result: " + r3 + " Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}