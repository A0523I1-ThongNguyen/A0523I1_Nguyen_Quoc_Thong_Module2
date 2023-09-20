package ss11;

import java.util.Scanner;
import java.util.Stack;

public class Dau_Ngoac_Use_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (true) {
            Dau_Ngoac_Use_Stack dauNgoac = new Dau_Ngoac_Use_Stack();
            System.out.println("Nhap bieu thuc check dau ngoac");
            String bt = scanner.nextLine();
            if (dauNgoac.check(bt)) {
                System.out.println("Well");
            } else{
                System.out.println("????");
            }
//            char input = scanner.next().charAt(0);
//            if (Character.isLetter(input)) {
//                break; }
        }
    }

    public boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character sym = str.charAt(i);
            if (sym == '(') {
                stack.push(sym);
            } else if (sym == ')') {
                if (stack.isEmpty()){
                    return false;
                }
                Character left =  stack.pop();
                if (sym == '(' && left != ')'){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
