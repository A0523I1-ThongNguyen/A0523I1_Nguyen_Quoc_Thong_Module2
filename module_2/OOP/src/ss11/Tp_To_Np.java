package ss11;

import java.util.Scanner;
import java.util.Stack;

public class Tp_To_Np {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> number = new Stack<>();
        System.out.print("Nhập số thập phân: ");
        int n = Integer.parseInt(sc.nextLine());
        String nhiPhan = "";
        while (n>0){
            nhiPhan= (n%2) + nhiPhan;
            n = n /2;


        }
        System.out.println("HE nhi phan: " +nhiPhan);
    }
}
