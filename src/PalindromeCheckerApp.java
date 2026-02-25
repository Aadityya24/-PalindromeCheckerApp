import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "noon";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();
        boolean result1 = strategy.checkPalindrome(input);
        System.out.println("Stack Strategy: " + input + " -> " + (result1 ? "Palindrome" : "Not Palindrome"));

        strategy = new DequeStrategy();
        boolean result2 = strategy.checkPalindrome(input);
        System.out.println("Deque Strategy: " + input + " -> " + (result2 ? "Palindrome" : "Not Palindrome"));
    }
}

interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (stack.pop() != c) return false;
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }

        return true;
    }
}
