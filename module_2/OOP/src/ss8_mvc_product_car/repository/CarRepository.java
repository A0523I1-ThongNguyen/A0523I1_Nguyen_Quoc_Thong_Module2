package ss8_mvc_product_car.repository;

import ss8_mvc_product_car.model.Car;

import java.util.Objects;
import java.util.Scanner;

public class    CarRepository implements ICarRepository {
    Scanner scanner = new Scanner(System.in);
    private static Car[] cars = new Car[10]; // tao danh sach mang tu doi tuong model Car

    static {
        cars[0] = new Car(01, "Vios", 580, "sedan");
        cars[1] = new Car(02, "Xpander", 660, "MVP");
        cars[2] = new Car(03, "Santafe", 1375, "SUV");
        cars[3] = new Car(04, "Morning", 471, "hatchback");
    }

    @Override
    public Car[] getListCar() {
        return cars;
    }


    @Override
    public void addCar(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                break;
            }
        }
    }

    @Override
    public void deleteCarById(int id) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId() == id) {
                cars[i] = null;
                break;
            }
        }
    }

    @Override
    public void editCar(int id) {
        boolean check = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId() == id) {
                System.out.println("Nhap id xe moi");
                int newName = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap ten xe");
                String nameCar = scanner.nextLine();
                System.out.println("Nhap gia xe");
                int price = Integer.parseInt(scanner.nextLine());
                System.out.println("Mo ta loai xe");
                String description = scanner.nextLine();
                cars[i].setId(newName);
                cars[i].setName(nameCar);
                cars[i].setPrice(price);
                cars[i].setDescription(description);
                check = true;
                break;

            }else {
                System.out.println(id + " KHong ton tai");
                break;
            }
        }
    }

    @Override
    public void search(String nameCar) {
        boolean check = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                if (nameCar.equals(cars[i].getName())) { //cach 2 Chứa: cars[i].getName().contains(nameCar)
                    System.out.println("Xe ban tim la : " + cars[i]);
                    check = true;
                    break;
                }
            }
        }
        if (!check) {
            System.out.println("Khong co xe: " + nameCar);
        }

    }
}
