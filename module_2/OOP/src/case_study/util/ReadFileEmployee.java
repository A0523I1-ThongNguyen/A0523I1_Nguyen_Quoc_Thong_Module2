package case_study.util;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class ReadFileEmployee {
    /*Nếu bạn đặt ArrayList bên ngoài phương thức readEmployee, nghĩa là bạn khai báo nó ở mức độ lớp (class level),
thì nó sẽ trở thành một biến toàn cục và có thể truy cập từ các phương thức khác trong lớp.
Điều này có thể hữu ích nếu bạn muốn sử dụng ArrayList trong các phương thức khác của lớp ReadFileEmployee.
Tuy nhiên, nếu có nhiều phương thức trong lớp ReadFileEmployee sử dụng ArrayList employeeList,
bạn cần đảm bảo rằng bạn không làm thay đổi trạng thái của nó bất kỳ đâu ngoại trừ phương thức readEmployee.
Điều này giúp đảm bảo tính nhất quán và tránh các lỗi không mong muốn.*/


    public static ArrayList<Employee> readEmployee(String filePath) {//chuyển đổi các dòng dữ liệu thành các thuộc tính của đối tượng Employee rồi ghép lại thành 1 object hoàn chỉnh và để trả về danh sách các đối tượng `Employee` đọc được từ tập tin
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] string = line.split(",");
                Employee employee = new Employee();
                employee.setId(string[0]);
                employee.setFullName(string[1]);
                employee.setDate(string[2]);
                employee.setGioitinh(string[3]);
                employee.setCmnd(string[4]);
                employee.setPhone(string[5]);
                employee.setEmail(string[6]);
                employee.setLevel(string[7]);
                employee.setLocation(string[8]);
                employee.setSalary(Double.parseDouble(string[9]));
                employeeList.add(employee);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException();
        }


        return employeeList;
        //Nếu phương thức này được viết kiểu void, không có giáị trả về, thì nó sẽ không trả về danh sách các đối tượng Employee được đọc từ tập tin.
        // Thay vào đó, nó chỉ đọc dữ liệu từ tập tin và lưu trữ vào danh sách các đối tượng Employee được khai báo trước đó trong phương thức.

        //cách hiểu 2 : Việc trả về `employeeList` là để chuyển đổi dữ liệu đã đọc từ tập tin thành danh sách các đối tượng `Employee`.
        // Nếu không return `employeeList`, thì phần gọi hàm `readEmployee` sẽ không nhận được danh sách các đối tượng `Employee` đã đọc được và không thể sử dụng dữ liệu này cho các mục đích khác.
    }
}
