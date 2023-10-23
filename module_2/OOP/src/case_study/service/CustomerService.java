package case_study.service;


import case_study.model.Customers;
import case_study.model.Employee;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomersRepository;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerService implements ICustomerService {
    private static final String filePath = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Customer.csv";
    static Scanner scanner = new Scanner(System.in);
    ICustomersRepository iCustomersRepository = new CustomerRepository();
    ArrayList<Customers> customersList;

    @Override
    public void display() {
        customersList = iCustomersRepository.readCustomers();
        for (Customers cu : customersList) {
            System.out.println(cu);
        }
    }

    @Override
    public void add() {
        customersList = iCustomersRepository.readCustomers();
        System.out.println("Nhap ma Khach Hang");
        String maKH = stId();
        System.out.println("Nhap ho ten");
        String fullName = stFullName();
        System.out.println("Nhap ngay sinh");
        String date = stEighteenYearsOld();
        System.out.println("Gioi tinh");
        String gender = stGender();
        System.out.println("So CMND");
        String cmnd = stCMND();
        System.out.println("Phone");
        String phone = stPhone();
        System.out.println("Email");
        String email = stEmail();
        System.out.println("Level Khach");
        String levelKhach = stLevelKhach();
        System.out.println("Dia chi");
        String address = scanner.nextLine();
        Customers customers = new Customers(maKH, fullName, date, gender, cmnd, phone, email, levelKhach, address);
        customersList.add(customers);
        iCustomersRepository.writeCustomers(filePath, customersList, false);
        for (Customers cu : customersList) {
            System.out.println(cu);
        }
    }

    @Override
    public void editCustomers() {
        customersList = iCustomersRepository.readCustomers();
        System.out.println("Enter Id Customer you want edit");
        String idCus = scanner.nextLine();
        Customers objCus = null;
        for (Customers cu : customersList) {
            if (cu.getId().equals(idCus)) {
                objCus = cu;
            }
        }
        int indexCusEdit = customersList.lastIndexOf(objCus);
        if (indexCusEdit == -1) {
            System.out.println("Customers does not exits");
        }
        boolean isExits = false;
        int choose;

        do {
            System.out.println(customersList.get(indexCusEdit));
            System.out.println("Enter The Infomation you want to edit");
            System.out.println("1.Identification Customer");
            System.out.println("2.Name");
            System.out.println("3.Date");
            System.out.println("4.Gender");
            System.out.println("5.CMND");
            System.out.println("6.Phone");
            System.out.println("7.Email");
            System.out.println("8.Level");
            System.out.println("9.Address");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Enter new ID");
                    String newId = stId();
                    customersList.get(indexCusEdit).setId(newId);
                    break;
                case 2:
                    System.out.println("Enter new name");
                    String newName = stFullName();
                    customersList.get(indexCusEdit).setFullName(newName);
                    break;
                case 3:
                    System.out.println("Enter new date");
                    String newDate = stEighteenYearsOld();
                    customersList.get(indexCusEdit).setDate(newDate);
                    break;
                case 4:
                    System.out.println("Enter new gender");
                    String newGender = stGender();
                    customersList.get(indexCusEdit).setGioitinh(newGender);
                    break;
                case 5:
                    System.out.println("Enter new CMND");
                    String newCMND = stCMND();
                    customersList.get(indexCusEdit).setCmnd(newCMND);
                    break;
                case 6:
                    System.out.println("Enter new phone number");
                    String newPhoneNumber = stPhone();
                    customersList.get(indexCusEdit).setPhone(newPhoneNumber);
                    break;
                case 7:
                    System.out.println("Enter new email");
                    String newEmail = stEmail();
                    customersList.get(indexCusEdit).setEmail(newEmail);
                    break;
                case 8:
                    System.out.println("Enter new level customer");
                    String newLevel = stLevelKhach();
                    customersList.get(indexCusEdit).setLevelKhach(newLevel);
                    break;
                case 9:
                    System.out.println("Enter new Address");
                    String newAddress = scanner.nextLine();
                    customersList.get(indexCusEdit).setAddress(newAddress);
                    break;
                case 10:
                    iCustomersRepository.writeCustomers(filePath, customersList, false);
                    isExits = true;
                    break;
            }
        } while (!isExits);
    }

    public static String stId() {
        String maKH;
        while (true) {
            maKH = scanner.nextLine();
            String dn = "^KH-[0-9]{4}$";
            if (Pattern.matches(dn, maKH)) {
                return maKH;
            } else {
                System.out.println("Ma Khach Hang KHONG hop le");
            }

        }
    }

    public static String stFullName() {
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

    public static String stEighteenYearsOld() {
        boolean isExactly = false;
        String standard = "";
        do {
            try {

                standard = scanner.nextLine();
                int date = Integer.parseInt(standard.substring(0, 2));
                int month = Integer.parseInt(standard.substring(3, 5));
                int year = Integer.parseInt(standard.substring(6));

                if (standard.length() != 10 || standard.charAt(2) != '/' || standard.charAt(5) != '/' || date <= 0 || date > 31 || month <= 0 || month > 12 || year <= 0) {
                    System.out.println("Re-enter according to the standard : dd/mm/yyyy");
                    isExactly = false;
                } else {/*nếu ở trên đúng đinh dạng, bắt đầu kiểm tra tuổi = 18 k */
                    if (2023 - year > 18) {
                        isExactly = true;
                    } else if (2023 - year == 18) {
                        if (month < 10) {
                            isExactly = true;
                        } else if (month == 10) {
                            if (date <= 16) {
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
                        System.out.println("Not old enough!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Only enter numbers ( according to the standard : dd/mm/yyyy )");
                isExactly = false;
            }
        } while (!isExactly);
        return standard;
    }

    public static String stGender() {
        String gender;
        while (true) {
            gender = scanner.nextLine();
            if (gender.equals("boy") || gender.equals("girl") || gender.equals("ofther")) {
                return gender;
            } else {
                System.out.println("Only enter boy, girl or ofther");
            }
        }
    }

    public static String stCMND() {
        String cmnd;
        while (true) {
            cmnd = scanner.nextLine();
            String ok = "^[0-9]{9}$";
            if (Pattern.matches(ok, cmnd)) {
                return cmnd;
            } else {
                System.out.println("Số CMND Không hợp lệ ! , nhập lại:");
            }
        }
    }

    public static String stPhone() {
        String phone;
        while (true) {
            phone = scanner.nextLine();
            String ok = "^0\\d{9}$";
            if (Pattern.matches(ok, phone)) {
                return phone;
            } else {
                System.out.println("Invalid phone number !  ");
            }

        }
    }

    public static String stEmail() {
        String email;
        while (true) {
            email = scanner.nextLine();
            String ok = "^[a-zA-Z0-9]+@gmail.com";
            if (Pattern.matches(ok, email)) {
                return email;
            } else {
                System.out.println("Invalid email");
            }
        }
    }


    public static String stLevelKhach() {
        String[] level = {"Diamond", "Platinium", "Gold", "Silver", "Member"};

        while (true) {
            int index = -1;
            System.out.println("Nhập vào loại khách hàng : ");
            String checkLKH = scanner.nextLine();
            for (int i = 0; i < level.length; i++) {
                if (checkLKH.equals(level[i])) {
                    return checkLKH;
                }
            }
            if (index == -1) {
                System.out.println("Khach k ton tai");
            }

        }

    }
}