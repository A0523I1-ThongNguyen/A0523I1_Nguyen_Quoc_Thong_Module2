package ss14_thuat_toan_sap_xep;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size Array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.println("Nhap phan tu thu :  "+ i);
            array[i] = scanner.nextInt();
        }
       // int[] showArray = {1,3,5,23,6};
        InsertionSort insertionSort = new InsertionSort();//    
        insertionSort.insertion(array);
        System.out.println(Arrays.toString(array));
    }
    public void insertion(int [] array){
        for (int i = 1 ; i < array.length; i++){
            int key = array[i];
            int j = i - 1;
            while (j>=0 && array[j] > key){ // pt truoc phai > pt hien tai(key)
                array[j+1] = array[j]; // vi pt truoc > pt hien tai nên gán pt phía trước vào pt hiện tại([j+1]).tạo chỗ trống key chèn vô
                j--;//di chuyển lên trên kiểm tra điều kiện so sánh
                //Để tiếp tục tìm vị trí thích hợp cho phần tử tiếp theo trong mảng, giá trị của j cần được giảm đi 1 (j--). Điều này đảm bảo rằng vòng lặp while sẽ tiếp tục chạy từ vị trí trước đó (j - 1) để tiếp tục so sánh và chèn các phần tử còn lại.
            }
            array[j+1] = key;//gán giá trị của key vào vị trí sau vị trí hiện tại (list[j + 1] = key)
        }
    }
}
