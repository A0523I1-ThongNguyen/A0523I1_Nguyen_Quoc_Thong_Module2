package case_study.util;

import case_study.model.Customers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteCustomers {

private static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Customer.csv";

    public static ArrayList<Customers> writeCutomers(ArrayList<Customers> customersList,boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customers cu : customersList){
                bufferedWriter.write(cu.getMaKH()+"," +cu.getFullName()+","+cu.getDate()+","+cu.getGioitinh()+","+cu.getCmnd()+","+cu.getPhone()+","+cu.getEmail()+","+cu.getLevelKhach()+","+cu.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return customersList;

    }
}
