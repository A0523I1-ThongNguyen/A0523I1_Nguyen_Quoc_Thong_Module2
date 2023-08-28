
import java.util.Scanner;

public class thuake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a = ");
        float a = sc.nextFloat();
        System.out.print("nhap b = ");
        float b = sc.nextFloat();
        System.out.print("nhap c = ");
        float c = sc.nextFloat();
        quadracticEquation(a, b, c);
    }

    static void quadracticEquation(float a, float b, float c) {

        if (a == 0) {
            if (b == 0) {
                System.out.println("pt vo nghiem");
            } else {
                System.out.println("pt co mot nghiem: " + "x = " + (-c / b));
            }
            return;
        }
        float delta = b * b - 4 * a * c;
        float x1, x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("pt co 2 nghiem : " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("pt có nghiem kep : " + "x1 = x2 = " + x1);
        } else {
            System.out.println("pt vo nghiem");
        }
    }
}
