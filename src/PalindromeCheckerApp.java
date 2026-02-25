import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {

    public static void main(String[] args) {


            String input = "refer";


            Deque<Character> deque = new ArrayDeque<>();


            for (char c : input.toCharArray()) {
                deque.add(c);
            }


            boolean isPalindrome = true;


            while (deque.size() > 1) {

                char front = deque.removeFirst();
                char back = deque.removeLast();

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
