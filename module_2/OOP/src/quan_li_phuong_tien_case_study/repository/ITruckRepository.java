package quan_li_phuong_tien_case_study.repository;

import quan_li_phuong_tien_case_study.model.Truck;

import java.util.ArrayList;

public interface ITruckRepository {
    ArrayList<Truck> getListTruck();
    void writeTruckToFile(ArrayList<Truck> list , String filePath, boolean append);

}
