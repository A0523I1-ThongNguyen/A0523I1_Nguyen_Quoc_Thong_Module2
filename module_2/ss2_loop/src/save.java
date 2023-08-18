import java.util.Arrays;
import java.util.Scanner;

public class save {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // khai bao bien
        int size;
        int[] array;

        //nhap va kiem tra kich thuoc mang (K dc qua 20 phan tu)
        do {
            System.out.println("Enter a size array");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kich thuoc khong qua 20");
            }
        }while (size > 20);

        //nhap gia tri cho tung` phan tu mang
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhap phan tu " + (i+1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }
        //in ra danh sach da nhap
        System.out.println("Danh sach da nhap ");
        for (i = 0; i < array.length;i++){
            System.out.println(array[i] + "\t");
        }

        //Duyet tung` phan tu trong mang de tim GTLN va vitri
        int max = array[0];
        int vitri = 0;
        for ( i = 0; i < array.length;i++){
            if (array[i] > max){
                max = array[i];
                vitri = i;
            }
        }
        System.out.println("Gia tri lon nhat la "+ max + " o vi tri " +vitri);
    }
}
