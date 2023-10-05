package ss16_io.read;

import ss16_io.National;

import java.io.*;
import java.util.ArrayList;

public class ReadFile2 {
    static ArrayList<Nation> nationArrayList = new ArrayList<>();

    public static void read2() {
        final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\ss16_io\\read\\nation.csv";
        File file = new File(filePath);

        try {
//            FileReader fileReader= new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));???
            String line ="";
            while ((line = bufferedReader.readLine()) !=null){
                String[] arrayString = line.split(",");
                Nation nation = new Nation(Integer.parseInt(arrayString[0]),arrayString[1],arrayString[2]);
                nationArrayList.add(nation);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Nation na : nationArrayList){
            System.out.println(na);
        }
    }

    public static void main(String[] args) {
        read2();
    }
}
