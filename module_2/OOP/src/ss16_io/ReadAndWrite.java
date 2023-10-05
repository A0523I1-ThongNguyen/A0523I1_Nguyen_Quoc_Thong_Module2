package ss16_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String link = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\ss16_io\\quocgia.csv";

        public static void writeFile(List<String> stringList) {
            //    List<String> stringListIP = new ArrayList<>(); => Tham so truyen vao class Main nen k can tao List o day
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;

            try {
                fileWriter = new FileWriter(link, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                for (String string : stringList) {
                    bufferedWriter.write(string); //Write 1 chuoi~ cua ham toString
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();// Why close moi ghi them chuoi~ dc? //để đảm bảo rằng dữ liệu đã được ghi vào file.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    //ghi lần đầu tiên ở trong code mới ghi dc file ngoài.
        public static void readFile() {
            List<National> stringListO = new ArrayList<>();
            File file = new File("E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\ss16_io\\hi");
            try {
                FileReader fileReader = new FileReader(file); // object fileReader doc file
                BufferedReader bufferedReader = new BufferedReader(fileReader); // doc fileReader trong bo nho dem
                String line = "";
                // đọc từng dòng trong file gắn vào chuỗi line
                while ((line = bufferedReader.readLine()) != null) { // phương readLine để đọc từng dòng
                    //gắn chuỗi line vào mảng mangChuaLine (split để phân cách 1 phần tử trong chuỗi tương ứng 1 mảng)
                    /* gắn chuỗi line thành Mảng các chuỗi */
                    String[] mangChuaLine = line.split(",");//dấu phẩy `,` là dấu phân cách giữa các phần tử trong chuỗi.Nếu bạn thay thế dấu phẩy, các phần tử trong chuỗi sẽ được tách thành các phần tử riêng biệt
                    //Tạo đối tượng và đưa các mangChuaLine được cắt từ line
                    National quocGia = new National(Integer.parseInt(mangChuaLine[0]), mangChuaLine[1], mangChuaLine[2]);
                    stringListO.add(quocGia);

//                        National quocGia = new National(line);//test thay thế chuỗi đọc file
//                        stringListO.add(quocGia);
                }
                bufferedReader.close();    //bufferedReader.close(); neu khong close?

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (National national : stringListO) {
                System.out.println(national);
            }
    }
}
