package dao_nguoc_mang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoMang {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    private int[] array;

    public int[] methodDaoMangInt(int[] phanTu) {
        array = new int[phanTu.length];
        for (int i = 0; i < array.length; i++) {
            stack.push(phanTu[i]);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        return array;
    }

    Stack<String> stack2 = new Stack<>();
    private String arrayChuoi;

    public void methodDaoMangString() {

        System.out.println("Nhập chuỗi để in ra đảo ngược");
        arrayChuoi = scanner.nextLine();
        String[] newChuoi = arrayChuoi.split("");// tách chuỗi  và trả về mảng chuỗi.
        for (String s : newChuoi) {
            System.out.println(s);//in ra binh thuong
            stack2.push(s);//CSDL Stack , khi push vao moi pop ra dc
        }
        System.out.println("Chuỗi nhập vào: " + arrayChuoi);

        System.out.println("Khi đảo ngược:");
        while (!stack2.empty()) {
            System.out.println(stack2.pop());
        }
        System.out.println(stack2.isEmpty());//check rong~
        System.out.println(stack2.size());//pop lay ra het roi
        System.out.println(stack); // lay ra = pop thi het phan tu
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int doDaiMang = scanner.nextInt();
        int newMang[] = new int[doDaiMang];
        for (int i = 0; i < newMang.length; i++) {
            System.out.println("Nhap phan tu thu " + i);
            newMang[i] = scanner.nextInt();
        }
        DaoMang daoMangI = new DaoMang();
        daoMangI.methodDaoMangInt(newMang);


        DaoMang daoMangS = new DaoMang();
        daoMangS.methodDaoMangString();


    }
}
