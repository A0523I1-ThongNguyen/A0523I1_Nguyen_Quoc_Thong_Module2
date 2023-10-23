package quan_li_phuong_tien_case_study.utils;

import quan_li_phuong_tien_case_study.model.Car;

import java.io.*;
import java.util.ArrayList;

public class ReadCar {
    public static ArrayList<Car> readFile(String filePath) {
        File file = new File(filePath);
        ArrayList<Car> listCar = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String arrayLine[] = line.split(",");
                Car ca = new Car();
                ca.setBienSo(arrayLine[0]);
                ca.setTenHang(arrayLine[1]);
                ca.setNamSanXuat(arrayLine[2]);
                ca.setChuSoHuu(arrayLine[3]);
                ca.setSoGhe(Integer.parseInt(arrayLine[4]));
                ca.setKieuXe(arrayLine[5]);

                listCar.add(ca);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listCar;
    }
}
