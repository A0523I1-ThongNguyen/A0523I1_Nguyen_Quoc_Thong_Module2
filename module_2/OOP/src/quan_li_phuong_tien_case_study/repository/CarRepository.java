package quan_li_phuong_tien_case_study.repository;

import quan_li_phuong_tien_case_study.model.Car;
import quan_li_phuong_tien_case_study.utils.ReadCar;
import quan_li_phuong_tien_case_study.utils.WriteCar;

import java.util.ArrayList;

public class CarRepository implements ICarRepository{
    @Override
    public ArrayList<Car> getListCar(String filePath) {
        return ReadCar.readFile(filePath) ;
    }

    @Override
    public void writeCar(String filePath, ArrayList<Car> listCar, boolean append) {
        WriteCar.writeFile(filePath,listCar,append);
    }
}
