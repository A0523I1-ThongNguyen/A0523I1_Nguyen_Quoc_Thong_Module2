package case_study.util;

import case_study.model.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Set;

public class WriteVilla {
    private static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Villa.csv";

    public static void writeFileVilla(LinkedHashMap<Villa,Integer> villa){
            File file = new File(filePath);

            try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,false)) ;
                    Set<Villa> objVilla = villa.keySet();// tạo một Set (tập hợp) chứa tất cả các key của đối tượng villa và gán nó cho đối tượng obj.
                    for (Villa vl : objVilla){
                            bufferedWriter.write(vl.toString());
                            bufferedWriter.newLine();
                    }
                    bufferedWriter.close();
            }catch (IOException  e){
                    e.printStackTrace();
            }
    }
}
