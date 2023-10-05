package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeService implements IEmployeeService {
    private static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Employee.csv";
    static Scanner scanner = new Scanner(System.in);
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    ArrayList<Employee> listEmployee = employeeRepository.displayEmployee();// get list of repository

    @Override
    public void display() {
        for (Employee em : listEmployee) {
            System.out.println(em);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhap ma nv");
        String maNV = maNV();
        System.out.println("Nhap ho ten");
        String fullName = scanner.nextLine();
        System.out.println("Nhap ngay sinh");
        String date = scanner.nextLine();
        System.out.println("Gioi tinh");
        String gender = scanner.nextLine();
        System.out.println("So CMND");
        String cmnd = cmnd();
        System.out.println("Phone");
        String phone = phone();
        System.out.println("Email");
        String email = scanner.nextLine();
        System.out.println("Trinh do Level");
        String level = scanner.nextLine();
        System.out.println("Vi tri");
        String location = scanner.nextLine();
        System.out.println("Luong");
        Double salary = luong();
        Employee employee = new Employee(maNV, fullName, date, gender, cmnd, phone, email, level, location, salary);
        listEmployee.add(employee);
        ArrayList<Employee> employees = employeeRepository.writeEmployee(filePath, listEmployee, true);
        for (Employee em2 : employees) {
            System.out.println(em2);
        }
    }

    public static String maNV() {
        String maNV;
        while (true) {
            maNV = scanner.nextLine();
            String mp = "^NV-[0-9]{4}$"; //Định nghĩa biểu thức chính quy mp để kiểm tra định dạng của CMND
            if (Pattern.matches(mp, maNV)) {
                return maNV;
            } else {
                System.out.println("Ma NV k hợp lệ !!");
            }
        }
    }

    public static String fullName() {
        String name;
        boolean flag;
        while (true) {
            name = scanner.nextLine();
            String[] words = name.split(" ");
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty()) {
                    char firstChar = Character.toUpperCase(word.charAt(0));
                    result.append(firstChar).append(word.substring(1)).append(" ");
                } else if (Character.isLowerCase(word.charAt(0))) {
                    flag = false;
                } else {
                    System.out.println("Viết hoa mỗi từ đầu tiên");
                }
            }
        }
    }

    public static String cmnd() {
        String CMND;
        while (true) {
            System.out.println("Nhập vào CMND: ");
            CMND = scanner.nextLine();
            String mp = "^[0-9]{9}$";
            if (Pattern.matches(mp, CMND)) {
                return CMND;
            } else {
                System.out.println("CMDN k hợp lệ !!");
            }
        }
    }


    public static String phone() {
        String SDT;
        while (true) {
            System.out.println("Nhập vào số điện thoại: ");
            SDT = scanner.nextLine();
            String mp = "^0\\d{9}$";
            if (Pattern.matches(mp, SDT)) {
                return SDT;
            } else {
                System.out.println("Số điện thoại không hợp lệ!");
            }
        }
    }

    public static Double luong() {
        double luong;
        while (true) {
            System.out.println("Nhap luong");
            luong = Double.parseDouble(scanner.nextLine());
            if (luong > 0) {
                return luong;
            } else {
                System.out.println("Luong phai lon hon 0");
            }
        }
    }
    @Override
    public void editEmployee() {

    }
}
