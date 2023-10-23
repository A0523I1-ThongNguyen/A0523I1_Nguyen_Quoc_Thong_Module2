package quan_li_phuong_tien_case_study.utils;

import quan_li_phuong_tien_case_study.model.Car;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCar {

    public static void writeFile(String filePath, ArrayList<Car> listCar, boolean append) {
        File file = new File(filePath);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Car ca : listCar) {
                bufferedWriter.write(ca.getBienSo()+","+ca.getTenHang()+","+ca.getNamSanXuat()+","+ca.getChuSoHuu()+","+ca.getSoGhe()+","+ca.getKieuXe());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
