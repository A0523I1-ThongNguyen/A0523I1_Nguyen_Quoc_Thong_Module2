package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeService implements IEmployeeService {
    private static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Employee.csv";
    static Scanner scanner = new Scanner(System.in);
    static IEmployeeRepository employeeRepository = new EmployeeRepository();
    static ArrayList<Employee> listEmployee ;// get list of repository


    @Override
    public void display() {
        // đọc ra từ danh sách employeeRepository.displayEmployee();
        listEmployee = employeeRepository.displayEmployee();
        for (Employee em : listEmployee) {
            System.out.println(em);
        }
    }

    @Override
    public void add() {
        listEmployee = employeeRepository.displayEmployee();
        System.out.println("Nhập mã Nhân Viên");
        String maNV = getId();
        System.out.println("Nhập họ và tên");
        String fullName = fullName();
        System.out.println("Nhập ngày, tháng, năm sinh");
        String date = eighteenYearsOld();
        System.out.println("Giới tính");
        String gender = gender();
        System.out.println("Số CMND");
        String cmnd = cmnd();
        System.out.println("Phone");
        String phone = phone();
        System.out.println("Email");
        String email = getEmail();
        System.out.println("Trình độ học vấn");
        String level = level();
        System.out.println("Ví trí công việc");
        String location = jobPosition();
        System.out.println("Lương");
        Double salary = salary();
        Employee employee = new Employee(maNV, fullName, date, gender, cmnd, phone, email, level, location, salary);
        listEmployee.add(employee);
        //thêm xong ghi danh sách vào file để lưu
        employeeRepository.writeEmployee(filePath, listEmployee, false); //ghi danh sách listEmployee vào file path vì mới thêm 1 object
        //    display();
        for (Employee employee1 : listEmployee) {
            System.out.println(employee1);
        }

    }

    @Override
    public void editEmployee() {
        listEmployee = employeeRepository.displayEmployee();

        System.out.println("Nhập vào Mã Nhân Viên muốn sửa : ");
        String maNV = scanner.nextLine();
        System.out.println("size: " + listEmployee.size());
        Employee emEditing = null;

        for (Employee em : listEmployee) {
            if (em.getId().equals(maNV)) {
                emEditing = em;//Nếu tìm thấy, đối tượng Employee đó được gán vào biến emEditing.
            }
        }
        int index = listEmployee.indexOf(emEditing);//Vị trí của đối tượng Employee trong danh sách được lưu vào biến index.
        if (index == -1) { // k tim thay thi return
            System.out.println("Employee does not exits");
            return;
        }

        boolean isExits = false;
        int choose;
        do {
            System.out.println(listEmployee.get(index));
            System.out.println("Nhập thông tin muốn sửa!!");
            System.out.println("1.Name");
            System.out.println("2.Ngày sinh");
            System.out.println("3.Giới tính");
            System.out.println("4.CMND");
            System.out.println("5.Số điẹn thoại");
            System.out.println("6.Email");
            System.out.println("7.Trình độ");
            System.out.println("8.Vị trí");
            System.out.println("9.Lương");
            System.out.println("10.Dừng");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
//                    System.out.println("Ten hien tai: " + em.getFullName());
                    System.out.println("Enter new name:");
                    String newName = fullName();
                    listEmployee.get(index).setFullName(newName);
                    break;

                case 2:
                    System.out.println("Enter new Date");
                    String newDate = eighteenYearsOld();
                    listEmployee.get(index).setFullName(newDate);
                    break;
                case 3:
                    System.out.println("Enter new Gender");
                    String newGender = gender();
                    listEmployee.get(index).setGioitinh(newGender);
                    break;
                case 4:
                    System.out.println("Enter new CMND");
                    String newCMND = cmnd();
                    listEmployee.get(index).setCmnd(newCMND);
                case 5:
                    System.out.println("Enter new Phone number");
                    String newPhoneNumber = phone();
                    listEmployee.get(index).setPhone(newPhoneNumber);
                case 6:
                    System.out.println("Enter new Email");
                    String newEmail = getEmail();
                    listEmployee.get(index).setEmail(newEmail);
                case 7:
                    System.out.println("Enter new Level");
                    String newLevel = level();
                    listEmployee.get(index).setLevel(newLevel);
                case 8:
                    System.out.println("Enter new job position");
                    String newJob = jobPosition();
                    listEmployee.get(index).setLocation(newJob);
                case 9:
                    System.out.println("Enter New Salary");
                    double newSalary = salary();
                    listEmployee.get(index).setSalary(newSalary);

                case 10:

                    //để display thì gọi list đầu tiên , sau đó đọc và sửa obj thì mới vô danh sách > display lần 2
                    // sửa xong ghi vào danh sách vào file để lưu
                    employeeRepository.writeEmployee(filePath, listEmployee, false);
                    display();
                    isExits = true;
                    break;

            }
        } while (!isExits);


    }

    public static String getId() {
        String maNV;
        while (true) {
            maNV = scanner.nextLine();
            String mp = "^NV-[0-9]{4}$"; //Định nghĩa biểu thức chính quy mp để kiểm tra định dạng của CMND
            if (Pattern.matches(mp, maNV)) {
                return maNV;
            } else {
                System.out.println("Mã Nhân Viên Không Hợp Lệ !!");
            }
        }
    }

    public static String fullName() {

        while (true) {
            String name = scanner.nextLine();
            String ok = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
            if (Pattern.matches(ok, name)) {
                return name;
            } else {
                System.out.println("In hoa mỗi chữ cái đầu tiên của tên !");
            }
        }
    }

    public static String eighteenYearsOld() {
        boolean isExactly = false;
        String standard = "";
        do {
            try {
                standard = scanner.next();
                int date = Integer.parseInt(standard.substring(0, 2));
                int month = Integer.parseInt(standard.substring(3, 5));
                int year = Integer.parseInt(standard.substring(6));

                if (standard.length() != 10 || standard.charAt(2) != '/' || standard.charAt(5) != '/' || date <= 0 || date > 31 || month <= 0 || month > 12 || year <= 0) {
                    System.out.println("Re-enter according to the standard : dd/mm/yyyy");
                    isExactly = false;
                } else {
                    if (2023 - year > 18) {
                        isExactly = true;
                    } else if (2023 - year == 18) {
                        if (month < 10) {
                            isExactly = true;
                        } else if (month == 10) {
                            if (date <= 23) {
                                isExactly = true;
                            } else {
                                isExactly = false;
                            }
                        } else {
                            isExactly = false;
                        }
                    } else {
                        isExactly = false;
                    }
                    if (!isExactly) {
                        System.out.println("not old enough");
                    }
                }
            } catch (Exception e) {
                System.out.println("Re-enter according to the standard : dd/mm/yyyy !!!");
                isExactly = false;
            }

        } while (!isExactly);
        return standard;
    }


    public static String gender() {
        scanner.nextLine();
        String gender1;
        do {

            gender1 = scanner.nextLine();

            if (gender1.equals("boy") || gender1.equals("girl") || gender1.equals("ofther")) {
                return gender1;

            } else {
                System.out.println("Can only be : boy-girl-ofther");

            }
        } while (true);

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

    public static String getEmail() {
        String nameMail;
        while (true) {
            System.out.println("Enter Your Email ");
            nameMail = scanner.nextLine();
            String rules = "^[a-zA-z0-9]+@gmail.com";
            if (Pattern.matches(rules, nameMail)) {
                return nameMail;
            } else {
                System.out.println("Invalid email");
            }

        }
    }

    public static String level() {
        String lv1 = "Trung cap";
        String lv2 = "Cao dang";
        String lv3 = "Dai hoc";
        String lv4 = "Sau dai hoc";
        String level;
        while (true) {
            System.out.println("Enter level");
            level = scanner.nextLine();
            if (level.equals(lv1) || level.equals(lv2) || level.equals(lv3) || level.equals(lv4)) {
                return level;
            } else {
                System.out.println("Wrong Info");
            }
        }
    }

    public static String jobPosition() {
        String w1 = "Le tan";
        String w2 = "Phuc vu";
        String w3 = "Chuyen vien";
        String w4 = "Giam sat";
        String w5 = "Quan li";
        String w6 = "Giam doc";

        // nếu không có vòng lặp, chương trình chỉ sẽ kiểm tra một lần và kết thúc.
        // Trong trường hợp không thỏa mãn điều kiện, bạn cần đảm bảo rằng hàm vẫn trả về một giá trị để không gây lỗi.
        while (true) {
            String work = scanner.nextLine();
            if (work.equals(w1) || work.equals(w2) || work.equals(w3) || work.equals(w4) || work.equals(w5) || work.equals(w6)) {
                return work;
            } else {
                System.out.println("Wrong work");
            }
        }
    }

    public static Double salary() {
        double luong;
        while (true) {
            System.out.println("Nhập lương");
            luong = Double.parseDouble(scanner.nextLine());
            if (luong > 0) {
                return luong;
            } else {
                System.out.println("Lương phải lớn hơn 0");
            }
        }
    }
}