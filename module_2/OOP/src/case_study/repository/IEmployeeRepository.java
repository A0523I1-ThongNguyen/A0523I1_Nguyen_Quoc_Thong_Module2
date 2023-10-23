package case_study.repository;

import case_study.model.Employee;

import java.util.ArrayList;

public interface IEmployeeRepository extends IRepository {
    ArrayList<Employee> displayEmployee();
    ArrayList<Employee> writeEmployee(String filePath,ArrayList<Employee> employees, boolean append);//
    int getSize();
}
