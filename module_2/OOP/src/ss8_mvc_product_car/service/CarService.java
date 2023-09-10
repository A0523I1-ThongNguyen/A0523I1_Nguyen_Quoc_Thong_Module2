package ss8_mvc_product_car.service;

import ss8_MVC.model.Customer;
import ss8_mvc_product_car.model.Car;
import ss8_mvc_product_car.repository.CarRepository;
import ss8_mvc_product_car.repository.ICarRepository;

import java.util.Scanner;

public class CarService implements ICarService{
     CarRepository carRepository = new CarRepository();

    Scanner scanner = new Scanner(System.in);


    @Override
    public void show() {
        Car[] cars = carRepository.getListCar();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println((i + 1) + ". " + cars[i]);
            }
        }
    }


    @Override
    public void add() {
        System.out.println("Nhap id cua xe");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten xe");
        String nameCar = scanner.nextLine();
        System.out.println("Nhap gia xe");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Mo ta loai xe");
        String description = scanner.nextLine();
        Car car = new Car(id,nameCar,price,description);
        carRepository.addCar(car);


    }

    @Override
    public void delete(){
        System.out.println("Nhap id xe can xoa");
        int deleteIdCar = Integer.parseInt(scanner.nextLine());
        carRepository.deleteCarById(deleteIdCar);
    }

    @Override
    public void edit() {
        System.out.println("Nhap id xe ban muon edit");
        int id = Integer.parseInt(scanner.nextLine());
        carRepository.editCar(id);
    }

    @Override
    public void search() {
        System.out.println("Nhap ten xe muon tim kiem");
        String nameCar= scanner.nextLine();
        carRepository.search(nameCar);
    }


}
