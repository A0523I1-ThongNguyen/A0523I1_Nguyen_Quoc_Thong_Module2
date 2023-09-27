package ss15_exception.Triangle;

import ss15_exception.Triangle.IllegalTriangleException;

import java.util.Scanner;
public class TestException {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start");
        boolean flag = false;
        do {
            flag = false;
            try {
                System.out.println("Nhap canh a");
                Integer edgeA = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap canh b");
                Integer edgeB = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap canh c");
                Integer edgeC = Integer.parseInt(scanner.nextLine());
                checkEdge(edgeA, edgeB, edgeC);
                System.out.println(edgeA + ", " +edgeB + " va "+ edgeC + " La 3 canh cua tam giac");
            } catch (IllegalTriangleException e) {
                flag = true;
                System.out.println(e.getMessage());
                System.out.println("Khong thoa dieu kien de tao thanh tam giac");
            }catch (NumberFormatException e){
                flag = true;
                System.out.println("Chi nhap so");
            }
        } while (flag);

    }

    public static boolean checkEdge(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || c <= 0) {
            throw new IllegalTriangleException("3 canh phai lon hon 0");
        } else if (a + b < c || b + c < a || a + c < b) {
            throw new IllegalTriangleException("Tong 2 canh phai lon hon canh con lai");
        }
        return true;
    }
}
