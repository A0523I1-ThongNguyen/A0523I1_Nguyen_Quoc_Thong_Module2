package case_study.repository;

import case_study.model.Customers;
import case_study.model.Employee;

import java.util.ArrayList;

public interface ICustomersRepository extends IRepository  {
    ArrayList<Customers> readCustomers();

    ArrayList<Customers> writeCustomers(String filePAth,ArrayList<Customers> employees, boolean append);
    int getSize();
}
