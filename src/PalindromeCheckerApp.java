import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        long start, end;

        start = System.nanoTime();
        boolean reverseMethod = checkReverse(normalized);
        end = System.nanoTime();
        System.out.println("Reverse Method: " + reverseMethod + ", Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean twoPointerMethod = checkTwoPointer(normalized);
        end = System.nanoTime();
        System.out.println("Two-Pointer Method: " + twoPointerMethod + ", Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean stackMethod = checkStack(normalized);
        end = System.nanoTime();
        System.out.println("Stack Method: " + stackMethod + ", Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean dequeMethod = checkDeque(normalized);
        end = System.nanoTime();
        System.out.println("Deque Method: " + dequeMethod + ", Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean linkedListMethod = checkLinkedList(normalized);
        end = System.nanoTime();
        System.out.println("LinkedList Method: " + linkedListMethod + ", Time: " + (end - start) + " ns");

        start = System.nanoTime();
        boolean recursiveMethod = checkRecursive(normalized, 0, normalized.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive Method: " + recursiveMethod + ", Time: " + (end - start) + " ns");
    }

    static boolean checkReverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return s.equals(reversed);
    }

    static boolean checkTwoPointer(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean checkStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) stack.push(c);
        for (char c : s.toCharArray()) if (stack.pop() != c) return false;
        return true;
    }

    static boolean checkDeque(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) deque.add(c);
        while (deque.size() > 1) if (deque.removeFirst() != deque.removeLast()) return false;
        return true;
    }

    static boolean checkLinkedList(String s) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) list.add(c);
        while (list.size() > 1) if (list.removeFirst() != list.removeLast()) return false;
        return true;
    }

    static boolean checkRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return checkRecursive(s, start + 1, end - 1);
    }
}
