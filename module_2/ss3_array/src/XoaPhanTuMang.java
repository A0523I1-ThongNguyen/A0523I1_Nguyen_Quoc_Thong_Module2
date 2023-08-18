import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Nhap so can xoa");
        int soCanXoa = Integer.parseInt(scanner.nextLine());
        int vitri = 0;
        int dk = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == soCanXoa) {
                System.out.println(soCanXoa + " o vi tri thu " + i);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == soCanXoa) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    dk++;
                }
                array[array.length - 1] = 0;

            }
            if (dk == 0) {
                System.out.println(soCanXoa + " Khong ton tai trong mang");
            }

        }
        System.out.println(Arrays.toString(array));

    }
}