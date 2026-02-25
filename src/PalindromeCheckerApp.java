import java.util.*;
public class PalindromeCheckerApp {

    public static void main(String[] args){
        System.out.println("Welcome all to my App");
        System.out.println("Version: 1.0");
        System.out.println("System inatialized Sucessfully");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        if (input.equals(reversed) && isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();

    }
}
