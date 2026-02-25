import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "racecar";

        boolean isPalindrome = check(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }
    }

    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}
