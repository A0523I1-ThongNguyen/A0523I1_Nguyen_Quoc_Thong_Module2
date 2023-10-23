package ss16_io.read;

import ss16_io.National;

import java.io.*;
import java.util.ArrayList;

public class ReadFile2 {
    static ArrayList<Nation> nationArrayList = new ArrayList<>();
  private static final String FILE_PATH = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\ss16_io\\read\\nation.csv";
  private static final String FILE_PATH2 = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\ss16_io\\read\\z.csv";
    public static void read2() {

        File file = new File(FILE_PATH);
        File file2 = new File(FILE_PATH2);

            try {

                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
             /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
             Bạn đã sử dụng class BufferedWriter để ghi dữ liệu vào file trước khi đọc.
             Điều này dẫn đến việc dữ liệu trong file bị xóa hoàn toàn trước khi đọc
              */
                String line ="";
                while ((line = bufferedReader.readLine()) !=null){
                    String[] arrayString = line.split(",");
                    Nation nation = new Nation(Integer.parseInt(arrayString[0]),arrayString[1],arrayString[2]);
                    nationArrayList.add(nation);
                }
                bufferedReader.close();
                    bufferedWriter.close();


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
