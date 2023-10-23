package quan_li_phuong_tien_case_study.utils;

import quan_li_phuong_tien_case_study.model.Moto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteMoto {
    public static void writeFile(String filePath, ArrayList<Moto> listMoto,boolean append ){
        File file = new File(filePath);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Moto mo : listMoto){
                bufferedWriter.write(mo.getBienSo()+","+mo.getTenHang()+","+mo.getNamSanXuat()+","+mo.getChuSoHuu()+","+mo.getCongSuat());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
