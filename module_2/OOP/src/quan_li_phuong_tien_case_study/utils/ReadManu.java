package quan_li_phuong_tien_case_study.utils;

import quan_li_phuong_tien_case_study.model.Manufacturer;
import quan_li_phuong_tien_case_study.model.Moto;

import java.io.*;
import java.util.ArrayList;

public class ReadManu {
    public static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\quan_li_phuong_tien_case_study\\data\\hangsanxuat.csv";

    public static ArrayList<Manufacturer> readFile() {
        ArrayList<Manufacturer> listManu = new ArrayList<>();
        File file = new File(FILE_PATH);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrayLine = line.split(",");
                Manufacturer newManu = new Manufacturer();
                newManu.setCodeBrand(arrayLine[0]);
                newManu.setNameBrand(arrayLine[1]);
                newManu.setNation(arrayLine[2]);
                listManu.add(newManu);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listManu;
    }
}
