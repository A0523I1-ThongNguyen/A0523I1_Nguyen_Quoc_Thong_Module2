package ss4_class_object_quadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap b");
        b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap c");
        c = Integer.parseInt(scanner.nextLine());

        QuadraticEquation qua = new QuadraticEquation(a,b,c);
        if (qua.getDiscriminant()==0){
            System.out.println("Phuong trinh co nghiem kep : " + qua.getRoot1());
        }else if (qua.getDiscriminant() > 0){
            System.out.println("Phuong trinh co 2 nghiem phan biet"+"\n");
            System.out.println("Nghiem thu nhat : " +qua.getRoot1());
            System.out.println("Nghiem thu hai : "+qua.getRoot2());
        }else {
            System.out.println("Phuong trinh vo nghiem");
        }

    }
    }
