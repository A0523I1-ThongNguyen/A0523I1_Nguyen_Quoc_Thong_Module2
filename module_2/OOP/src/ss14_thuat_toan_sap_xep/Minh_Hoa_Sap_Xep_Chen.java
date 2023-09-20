package ss14_thuat_toan_sap_xep;

import java.util.Scanner;
public class Minh_Hoa_Sap_Xep_Chen {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter list size:");
            int size = scanner.nextInt();
            int[] list = new int[size];
            System.out.println("Enter " + list.length + " values:");
            for (int i = 0; i < list.length; i++) {
                list[i] = scanner.nextInt();
            }
            System.out.print("Your input list: ");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + "\t");
            }
            System.out.println("\nBegin sort processing...");
            insertionSort(list);
        }

        public static void insertionSort(int[] list) {
            for (int i = 1; i < list.length; i++) {
                int key = list[i];// luu rieng gia tri hien tai vao key
                int j;
                for (j = i - 1; j >= 0 && list[j] > key; j--) {
                    System.out.println(list[j+1] + " Swap " +list[j]);
                    list[j + 1] = list[j];//j+1 = i (gia tri hien tai)
                }
                list[j + 1] = key;//gán giá trị của biến key vào vị trí hiện tại (vị trí của phần tử đang được xét)
            }
            System.out.print("List after sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }

//Trong thuật toán sắp xếp chèn, mỗi lần lặp, phần tử được chọn được so sánh với các phần tử đứng trước nó trong mảng đã được sắp xếp. Nếu phần tử đứng trước lớn hơn phần tử được chọn, ta dịch các phần tử đứng trước sang phải và chèn phần tử được chọn vào vị trí thích hợp. Quá trình này tiếp tục cho đến khi mảng được sắp xếp hoàn toàn.
//1. Hàm insertionSort có tham số đầu vào là một mảng số nguyên (int[] list).
// 2. Vòng lặp for đầu tiên (int i = 1; i < list.length; i++) dùng để duyệt từ phần tử thứ 2 đến phần tử cuối của mảng.
// 3. Trong vòng lặp for đầu tiên, ta gán giá trị của phần tử hiện tại vào biến key (int key = list[i]).4.
// Tạo một biến j để duyệt từ phần tử trước đó của i (j = i - 1).
// 5. Vòng lặp for thứ hai (j >= 0 && list[j] > key) dùng để so sánh các phần tử từ phần tử trước đó của i với key. Nếu phần tử đang xét lớn hơn key, ta tiến hành hoán đổi vị trí của chúng và in ra thông tin về sự hoán đổi.
// 6. Sau mỗi vòng lặp của for thứ hai, ta gán lại giá trị của key vào vị trí sau vị trí hiện tại (list[j + 1] = key).7. Cuối cùng, ta in ra mảng sau khi đã sắp xếp và kết thúc hàm.Đây là cách triển khai của hàm insertionSort theo ngôn ngữ lập trình Java.