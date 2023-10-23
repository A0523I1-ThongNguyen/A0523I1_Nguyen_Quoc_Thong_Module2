package quan_li_phuong_tien_case_study.utils;

import quan_li_phuong_tien_case_study.model.Truck;

import java.io.*;
import java.sql.Struct;
import java.util.ArrayList;

public class ReadTruck {
    private static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\quan_li_phuong_tien_case_study\\data\\xeTai.csv";

    public ArrayList<Truck> readFile() {
        ArrayList<Truck> listTruck = new ArrayList<>();
        File file = new File(FILE_PATH);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                Truck truck = new Truck();
                truck.setBienSo(array[0]);
                truck.setTenHang(array[1]);
                truck.setNamSanXuat(array[2]);
                truck.setChuSoHuu(array[3]);
                truck.setTrongTai(Double.parseDouble(array[4]));

                listTruck.add(truck);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listTruck;
    }
}
