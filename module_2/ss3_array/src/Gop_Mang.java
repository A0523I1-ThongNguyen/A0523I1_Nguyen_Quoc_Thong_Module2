import java.util.Arrays;
import java.util.Scanner;

public class Gop_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeA;
        int sizeB;
        int arrayA[];
        int arrayB[];

        System.out.println("Nhap do dai mang A");
        sizeA=Integer.parseInt(scanner.nextLine());
        arrayA = new int[sizeA];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("Nhap phan tu thu "+i + " cua mang A");
            arrayA[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("-------------------------------------");

        System.out.println("Nhap do dai mang B");
        sizeB = Integer.parseInt(scanner.nextLine());
        arrayB = new int[sizeB];

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("Nhap phan tu thu "+i +" cua mang B");
            arrayB[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));

        //tao mang C de gop mang A&B
        System.out.println("Mang C Gop mang A&B");
        int arrayC[] = new int[sizeA+sizeB]; // or arrayA.length+B
        //gop mang A vo mang C
        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i];
        }
        // gan mang b vao  mang C ( do dai mang A + i , vd b[0] = a 3 + 1 = b vo vi tri 4} )
        for (int i = 3; i < arrayB.length; i++) {
            arrayC[arrayA.length+i] = arrayB[i];
        }
        System.out.println(Arrays.toString(arrayC));
    }
}


