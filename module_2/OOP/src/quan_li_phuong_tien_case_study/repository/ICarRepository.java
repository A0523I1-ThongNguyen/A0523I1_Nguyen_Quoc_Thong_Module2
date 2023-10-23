package quan_li_phuong_tien_case_study.repository;

import quan_li_phuong_tien_case_study.model.Car;

import java.util.ArrayList;

public interface ICarRepository {
    ArrayList<Car> getListCar(String filePath);
    void writeCar(String filePath, ArrayList<Car> listCar, boolean append);

}
