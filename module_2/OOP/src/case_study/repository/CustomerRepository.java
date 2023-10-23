package case_study.repository;

import case_study.model.Customers;
import case_study.model.Employee;
import case_study.util.ReadFileCustomers;
import case_study.util.WriteCustomers;

import java.util.ArrayList;

public class CustomerRepository implements ICustomersRepository{

    public static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Customer.csv";
    @Override
    public ArrayList<Customers> readCustomers() {
        return ReadFileCustomers.readCustomers(filePath);
    }

    @Override
    public ArrayList<Customers> writeCustomers(String filePath, ArrayList<Customers> employees, boolean append) {
        return WriteCustomers.writeCutomers(filePath,employees,append);
    }

    @Override
    public int getSize() {
        return getSize();
    }
}
