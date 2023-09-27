package ss14_thuat_toan_sap_xep;

import java.util.Arrays;
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu "+i);
            array[i] = scanner.nextInt();
        }
        sapXepChen(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sapXepChen(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for ( j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
    }
}
