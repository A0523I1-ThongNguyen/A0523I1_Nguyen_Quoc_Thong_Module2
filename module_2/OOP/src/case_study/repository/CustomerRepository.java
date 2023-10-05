package case_study.repository;

import case_study.model.Customers;
import case_study.model.Employee;
import case_study.util.ReadFileCustomers;
import case_study.util.WriteCustomers;

import java.util.ArrayList;

public class CustomerRepository implements ICustomersRepository{
    @Override
    public ArrayList<Customers> displayCustomers() {
        return ReadFileCustomers.readCustomers();
    }

    @Override
    public ArrayList<Customers> writeCustomers(ArrayList<Customers> employees, boolean append) {
        return WriteCustomers.writeCutomers(employees,true);
    }

    @Override
    public int getSize() {
        return 0;
    }
}
