package case_study.util;

import case_study.model.House;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Set;

public class WriteHouse {
    public static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\house.csv";

    public static void writeFile(LinkedHashMap<House,Integer> house){
        File file = new File(FILE_PATH);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            Set<House> dsObjHouse = house.keySet();// tạo một Set (tập hợp) objVilla để lấy tất cả các key của đối tượng villa trong LinkedHashMap.
            for (House ho : dsObjHouse){
                bufferedWriter.write(ho.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("file k ton tai ,tệp tin bị khóa, mất kết nối mạng");
        }
    }
}
