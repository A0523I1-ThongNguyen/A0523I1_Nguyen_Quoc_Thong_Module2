package quan_li_phuong_tien_case_study.repository;

import quan_li_phuong_tien_case_study.model.Truck;
import quan_li_phuong_tien_case_study.utils.ReadTruck;
import quan_li_phuong_tien_case_study.utils.WriteTruck;

import java.util.ArrayList;

public class TruckRepository implements ITruckRepository {
        ReadTruck readTruck = new ReadTruck();//class Read does not static
        WriteTruck writeTruck = new WriteTruck();
    @Override
    public ArrayList<Truck> getListTruck() {
        return readTruck.readFile();
    }

    @Override
    public void writeTruckToFile(ArrayList<Truck> list, String filePath, boolean append) {
         writeTruck.writeFile(list,filePath,append);
    }

}
