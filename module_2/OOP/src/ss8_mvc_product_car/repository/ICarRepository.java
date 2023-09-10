package ss8_mvc_product_car.repository;

import ss8_mvc_product_car.model.Car;

import java.util.ArrayList;

public interface ICarRepository {
    Car[] getListCar();
    void addCar(Car car);
    void deleteCarById(int id);

    void editCar(int id);
    void search(String name);

}
