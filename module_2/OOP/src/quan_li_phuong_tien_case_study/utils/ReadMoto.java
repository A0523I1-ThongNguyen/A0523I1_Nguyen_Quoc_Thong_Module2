package quan_li_phuong_tien_case_study.utils;

import quan_li_phuong_tien_case_study.model.Moto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadMoto {
    public static ArrayList<Moto> readFile(String filePath) {
        ArrayList<Moto> listMoto = new ArrayList<>();
        File file = new File(filePath);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                String[ ]arrayLine = line.split(",");

                Moto newMoto = new Moto();
                newMoto.setBienSo(arrayLine[0]);
                newMoto.setTenHang(arrayLine[1]);
                newMoto.setNamSanXuat(arrayLine[2]);
                newMoto.setChuSoHuu(arrayLine[3]);
                newMoto.setCongSuat(Double.parseDouble(arrayLine[4]));

                listMoto.add(newMoto);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listMoto;
    }
}
