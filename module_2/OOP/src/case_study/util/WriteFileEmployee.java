package case_study.util;

import case_study.model.Employee;
import case_study.service.EmployeeService;

import java.io.*;
import java.util.ArrayList;

public class WriteFileEmployee {
    //phương thức này chuyển đổi đối tượng Employee thành dữ liệu chuỗi và ghi dữ liệu được định dạng vào file.

    //  lớp FileWriter và BufferedWriter để ghi dữ liệu Employee vào file tệp tin
    public static ArrayList<Employee> writeEmployee(String filePath, ArrayList<Employee> employees, boolean append) {
        File file = new File(filePath);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee em : employees) {
                bufferedWriter.write(em.getId() + "," + em.getFullName() + "," + em.getDate() + "," + em.getGioitinh() + "," + em.getCmnd() + "," + em.getPhone() + "," + em.getEmail() + "," + em.getLevel() + "," + em.getLocation() + "," + em.getSalary());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
}
//Việc duyệt vòng for (Employee em : employees) vào file tệp tin được thực hiện để
// ghi thông tin của từng đối tượng Employee từ danh sách employees vào tệp tin.
// Việc này không có ảnh hưởng trực tiếp đến danh sách employees ban đầu.
// Danh sách employees không bị thay đổi hay mất đi sau khi ghi vào tệp tin. Tuy nhiên, nếu cần lưu trữ lại thông tin của danh sách employees, ta có thể sử dụng danh sách trả về từ phương thức writeEmployee.