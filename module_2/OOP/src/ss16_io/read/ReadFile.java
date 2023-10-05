package ss16_io.read;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {


    public static void read() {
        List<Nation> nationList = new ArrayList<>();

        File file = new File("E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\ss16_io\\read\\\\nation.csv");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] stringList = line.split(",");
                Nation nation = new Nation(Integer.parseInt(stringList[0]), stringList[1], stringList[2]);
                nationList.add(nation);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(Nation nation : nationList){
            System.out.println(nation);
        }

    }

    public static void main(String[] args) {
        read();
    }

}
