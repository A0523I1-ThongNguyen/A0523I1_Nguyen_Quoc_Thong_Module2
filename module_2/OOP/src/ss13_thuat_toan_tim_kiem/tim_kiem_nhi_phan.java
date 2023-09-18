package ss13_thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class tim_kiem_nhi_phan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        boolean flag = false;
        do {
            System.out.println("Nhap so can tim");
            int soCanTim = Integer.parseInt(scanner.nextLine());
            if (binarySearch(array, soCanTim) == -1) {
                System.out.println(+soCanTim + " Khong ton tai");
            } else {
                System.out.println(soCanTim + " o vi tri thu " + binarySearch(array, soCanTim));
                flag = true;
            }
        } while (!flag);
//        int[] array = {2, 6, 9, 15, 17, 22, 35, 39, 45, 70, 92};
//        System.out.println(binarySearch(array, 7));
    }

    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}


