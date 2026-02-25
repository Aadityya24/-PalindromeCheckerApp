import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "level";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {

            char front = list.removeFirst();
            char back = list.removeLast();

            if (front != back) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }
    }
}
