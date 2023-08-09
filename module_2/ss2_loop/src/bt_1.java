import java.util.Scanner;

public class bt_1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong HCN");
        int cr = scanner.nextInt();
        System.out.println("Nhap chieu dai HCN");
        int cd = scanner.nextInt();
        for (int i = 0; i < cr; i++) {
            for (int j = 0; j < cd; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }


        System.out.println("Nhap do dai tam giac vuong");
        int tgv = scanner.nextInt();
        for (int i = 0; i < tgv; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("Nhap do dai tam giac vuong nguoc");
        int tgvNguoc = scanner.nextInt();
        for (int i = tgvNguoc; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
 /*        System.out.println("Nhap do dai tam giac can");
        int tgCan = scanner.nextInt();
        for (int i = 0; i < tgCan; i++) {
            for (int j = 0; j < 2 * tgCan + 1; j++) {
                if (j >= tgCan - i - 1 && j <= tgCan + i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("\n");
                }
            }
            System.out.print(" ");
        }*/

    }

}









