package case_study.repository;

import case_study.model.Customers;
import case_study.model.Employee;

import java.util.ArrayList;

public interface ICustomersRepository {
    ArrayList<Customers> displayCustomers();

    ArrayList<Customers> writeCustomers(ArrayList<Customers> employees, boolean append);
    int getSize();
}
