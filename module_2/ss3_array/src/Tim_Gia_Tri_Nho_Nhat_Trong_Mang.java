package ss3_array.src;
import java.util.Arrays;
import java.util.Scanner;

public class Tim_Gia_Tri_Nho_Nhat_Trong_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[];
        System.out.println("Nhap so luong phan tu");
        int size = Integer.parseInt(scanner.nextLine());
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu "+i );
            array[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println("Mang vua tao " + Arrays.toString(array) +" ");

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("So nho nhat trong mang la "+min);
    }
}
