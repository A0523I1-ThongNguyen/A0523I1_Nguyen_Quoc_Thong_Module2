package quan_li_phuong_tien_case_study.utils;

import quan_li_phuong_tien_case_study.model.Truck;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteTruck {

    public void writeFile(ArrayList<Truck> listThamSoTruck , String filePath ,boolean append){
        File file = new File(filePath);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Truck tr : listThamSoTruck){
                bufferedWriter.write(tr.getBienSo()+","+tr.getTenHang()+","+tr.getNamSanXuat()+","+tr.getChuSoHuu()+","+tr.getTrongTai());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
