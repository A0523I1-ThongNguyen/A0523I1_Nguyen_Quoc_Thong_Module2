package case_study.util;

import case_study.model.Customers;
import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class ReadFileCustomers {

    //private static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Customer.csv";

    public static ArrayList<Customers> readCustomers(String filePath) {
        /*Mục đích của việc tạo `ArrayList là để tạo ra một danh sách rỗng của đối tượng `Employee` để lưu trữ các đối tượng sau khi đọc từ tập tin.*/
        ArrayList<Customers> customersList = new ArrayList<>();
        File file = new File(filePath);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] array = line.split(",");
                Customers customers = new Customers();
                customers.setId(array[0]);
                customers.setFullName(array[1]);
                customers.setDate(array[2]);
                customers.setGioitinh(array[3]);
                customers.setCmnd(array[4]);
                customers.setPhone(array[5]);
                customers.setEmail(array[6]);
                customers.setLevelKhach(array[7]);
                customers.setAddress(array[8]);

                customersList.add(customers);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customersList;
    }
}
/*Nếu không có lệnh return, phương thức sẽ không trả về kết quả nào và không có giá trị nào được trả về từ phương thức đó.
 Khi gọi phương thức này để đọc danh sách Employee từ tập tin sẽ
  không có đối tượng Employee nào được trả về và sẽ không thể sử dụng danh sách đó cho các mục đích khác.*/