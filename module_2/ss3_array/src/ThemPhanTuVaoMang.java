import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[];
        System.out.println("Nhap do dai mang");
        int soLuong = Integer.parseInt(scanner.nextLine());
        array = new int[soLuong];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mang vua nhap " + Arrays.toString(array));

        System.out.println("Nhap so can chen");
        int soChen = Integer.parseInt(scanner.nextLine());

        int viTriChen;
        do {
            System.out.println("Nhap vi tri can chen");
            viTriChen = Integer.parseInt(scanner.nextLine());
            if (viTriChen <= 1 || viTriChen >= (array.length - 1)) {
                System.out.println("Khong chen duoc, vi tri phai > 1 Or < (array.length - 1)");
            }
        } while (viTriChen <= 1 || viTriChen >= (array.length - 1));

        int newArray[] = new int[soLuong + 1];

        for (int i = 0; i <= array.length; i++) {
            if (i < viTriChen) {
                newArray[i] = array[i];
            } else if (i == viTriChen) {
                newArray[i] = soChen;
            } else if (i >viTriChen) {
                newArray[i] = array[i-1];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}