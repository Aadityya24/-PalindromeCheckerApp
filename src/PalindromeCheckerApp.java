import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Deed";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        if (input == null) return false;

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        char[] chars = normalized.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
