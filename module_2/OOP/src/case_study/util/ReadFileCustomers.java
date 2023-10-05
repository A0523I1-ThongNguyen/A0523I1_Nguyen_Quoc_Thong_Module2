package case_study.util;

import case_study.model.Customers;

import java.io.*;
import java.util.ArrayList;

public class ReadFileCustomers {

    private static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Customer.csv";

    public static ArrayList<Customers> readCustomers() {
        ArrayList<Customers> customersList = new ArrayList<Customers>();
        File file = new File(filePath);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedWriter = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedWriter.readLine()) != null) {
                String[] arrayLine = line.split(",");
                Customers customers = new Customers();
                customers.setMaKH(arrayLine[0]);
                customers.setFullName(arrayLine[1]);
                customers.setDate(arrayLine[2]);
                customers.setGioitinh(arrayLine[3]);
                customers.setCmnd(arrayLine[4]);
                customers.setPhone(arrayLine[5]);
                customers.setEmail(arrayLine[6]);
                customers.setLevelKhach(arrayLine[7]);
                customers.setAddress(arrayLine[8]);
                customersList.add(customers);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customersList;
    }

}
