package case_study.util;

import case_study.model.Customers;

import java.io.*;
import java.util.ArrayList;

public class WriteCustomers {

//private static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Customer.csv";

    public static ArrayList<Customers> writeCutomers(String filePath, ArrayList<Customers> customersList, boolean append) {
        File file = new File(filePath);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customers cu : customersList) {
                bufferedWriter.write(cu.getId() + ", " + cu.getFullName() + ", " + cu.getDate() + ", " + cu.getGioitinh() + ", " + cu.getCmnd() + ", " + cu.getPhone() + ", " + cu.getEmail() + ", " + cu.getLevelKhach() + ", "+ cu.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return customersList;
    }
}
