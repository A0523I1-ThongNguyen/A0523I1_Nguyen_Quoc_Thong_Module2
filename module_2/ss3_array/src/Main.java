
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[];
        System.out.println("Nhap so luong phan tu mang");
        int soLuong = Integer.parseInt(scanner.nextLine());
        array = new int[soLuong];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang vua nhap : " + Arrays.toString(array));

        System.out.println("Nhap so can xoa");
        int x = Integer.parseInt(scanner.nextLine());

        int vitri = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                vitri = i;

                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];

                }
                array[array.length - 1] = 0;
                System.out.println(x + " o vi tri thu " + vitri);
            }
        }

        System.out.println(Arrays.toString(array));
    }
}