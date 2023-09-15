package ss11_stack_queue;

import java.util.Stack;

public class ReverseElements<T> {

    public static void main(String[] args) {
        Stack<Integer> repStack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            repStack.push(i);
        }
        while (!repStack.isEmpty()) {
            System.out.println(repStack.pop());
        }

        System.out.println("---------------------------");


        Stack<String> repStack2 = new Stack<>();
        String chuoi = "water";

        String[] chuaChuoi = chuoi.split("");
        for (String s : chuaChuoi) {
            repStack2.push(s);
        }

        while (!repStack2.isEmpty()) {
            System.out.println(repStack2.peek());

        }

    }
}

