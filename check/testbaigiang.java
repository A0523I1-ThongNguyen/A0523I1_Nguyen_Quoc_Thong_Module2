import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class testbaigiang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cars = {"Toyota", "Huyndai", "Mazda","Mer","Huyndai", "Ford"};
        System.out.println("Mang ban dau :");
        System.out.println(Arrays.toString(cars));

        System.out.println("Nhap xe ban muon xoa");
        String car_del = scanner.nextLine();

        for (int i = 0; i < cars.length; i++){
            if (car_del.equals(cars[i]) ){
                System.out.println("cars bi xoa o vi tri thu "+ (i+1));
                for (int j = i; j < cars.length-1; j++) {
                    cars[j] = cars[j+1];
                }
                cars[cars.length-1] = "";
            }
        }
        System.out.println(Arrays.toString(cars));

    }
}

