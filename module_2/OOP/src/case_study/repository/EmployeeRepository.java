package case_study.repository;

import case_study.model.Employee;
import case_study.util.ReadFileEmployee;
import case_study.util.WriteFileEmployee;

import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository{
    private static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Employee.csv";
    int size;
    @Override
    public ArrayList<Employee> displayEmployee() {
        return ReadFileEmployee.readEmployee(filePath);
    }

    @Override
    public ArrayList<Employee> writeEmployee(String filePath, ArrayList<Employee> employees, boolean append) {
        return WriteFileEmployee.writeEmployee(filePath,employees,append);
    }

    @Override
    public int getSize() {
        return size;
    }
}
