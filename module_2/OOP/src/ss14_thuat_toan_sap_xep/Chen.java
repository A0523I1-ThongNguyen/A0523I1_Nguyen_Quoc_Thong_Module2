package ss14_thuat_toan_sap_xep;

import java.util.Scanner;

public class Chen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chen chen = new Chen();
        System.out.println("Enter size array:");
        int size = scanner.nextInt();
        int[] newArray = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < newArray.length;i++){
            System.out.println("element "+ i);
            newArray[i] = scanner.nextInt();
        }
        System.out.println("Array before");
        chen.showListArray(newArray);
        System.out.println("\n ***** Loading arrange... *****");
        chen.insertionSort(newArray);
        System.out.println("Array arranged: ");
        chen.showListArray(newArray);
//        int[] array = {1, 3, 2};
//        chen.insertionSort(array);
//        chen.showListArray(array);
    }

    public void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;//Trong vòng lặp for thứ hai, biến j được sử dụng để điều khiển việc so sánh và di chuyển các phần tử trong mảng. Trong trường hợp này, chúng ta muốn so sánh giá trị của phần tử đang xét (key) với các phần tử trước nó (list[j]). Nếu giá trị key nhỏ hơn giá trị list[j] thì chúng ta cần di chuyển phần tử list[j] sang phải (tăng j) để tạo chỗ trống cho key được chèn vào đúng vị trí. Vì vậy, cần lặp j-- để di chuyển ngược từ vị trí hiện tại của i (được lưu trong j) về các phần tử trước đó trong mảng.
            }
            list[j + 1] = key;
        }
    }

    public void showListArray(int[] list) {
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ",");
        }
        System.out.print("]");
    }
}



