package case_study.util;

import case_study.model.Employee;
import case_study.service.EmployeeService;

import java.io.*;
import java.util.ArrayList;

public class WriteFileEmployee {
    //phương thức này chuyển đổi đối tượng Employee thành dữ chuỗi và ghi dữ liệu được địnhạng vào file.
    public static ArrayList<Employee> writeEmployee(String filePath,ArrayList<Employee> employees, boolean append){
        File file = new File(filePath);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee em: employees){
                bufferedWriter.write(em.getMaNV()+","+em.getFullName()+","+em.getDate()+","+em.getGioitinh()+","+em.getCmnd()+","+em.getPhone()+","+em.getEmail()+","+em.getLevel()+","+em.getLocation()+","+em.getSalary());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
}
