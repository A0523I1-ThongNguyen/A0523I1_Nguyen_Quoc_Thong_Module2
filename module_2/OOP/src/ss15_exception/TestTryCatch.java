package ss15_exception;

import java.util.Random;
import java.util.Scanner;

public class TestTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestTryCatch obj = new TestTryCatch();
        double[] arrayMain = obj.methodRandom();
        int i = -1;
        System.out.println("Nhập chỉ số ");
        try {
            Integer viTri = Integer.parseInt(scanner.nextLine());
            System.out.println("Ví trí thứ : " + viTri + " có giá trị là : " + arrayMain[viTri]);
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập chỉ số");
            i = 0;
            System.out.println("Nhập lung tung k phải số nên mặc định lấy vị trí cuối cùng của mảng " + arrayMain[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nhap vi tri vuot qua gioi han trong mang arrayMain");
//            i = arrayMain.length - 1;
            System.out.println("Nhập vượt chỉ số vị trí trong mảng: " + arrayMain[arrayMain.length - 1]);
        } catch (Exception e) {
            System.out.println("I'm Boss Exception ");
            e.printStackTrace();
        } finally {
            System.out.println("I don't care everithing. I still run");
        }
    }

    public double[] methodRandom() {
        Random rd = new Random();
        double[] arrayRandom = new double[100];
        System.out.println("List Element Random: ");
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = rd.nextInt(100);
            System.out.print(arrayRandom[i] + " - ");
        }
        return arrayRandom;
    }
}
