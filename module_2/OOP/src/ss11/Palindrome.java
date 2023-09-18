package ss11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = scanner.nextLine();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
            queue.add(c);
        }
        System.out.println("stack khi push: " + stack);
        System.out.println("queue khi add: " + queue);

//        boolean isPalindrome = Palindrome.checkPalindrome(stack,queue);
        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.checkPalindrome(stack, queue);
        if (isPalindrome) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("Is not Palindrome");
        }

    }

    public boolean checkPalindrome(Stack stack, Queue queue) {
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return true;
    }

}
