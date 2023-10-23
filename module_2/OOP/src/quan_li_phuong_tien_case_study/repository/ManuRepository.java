package quan_li_phuong_tien_case_study.repository;

import quan_li_phuong_tien_case_study.model.Car;
import quan_li_phuong_tien_case_study.model.Manufacturer;
import quan_li_phuong_tien_case_study.utils.ReadCar;
import quan_li_phuong_tien_case_study.utils.ReadManu;

import java.util.ArrayList;

public class ManuRepository {
    public ArrayList<Manufacturer> getListManu() {
        return ReadManu.readFile();
    }
}
