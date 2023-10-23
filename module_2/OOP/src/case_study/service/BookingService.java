package case_study.service;

import case_study.model.*;
import case_study.repository.CustomerRepository;
import case_study.repository.FacilityRepository;
import case_study.repository.ICustomersRepository;
import case_study.repository.IFacilityRepository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import static case_study.service.FacilityService.*;


public class BookingService {
    Scanner scanner = new Scanner(System.in);
    ICustomersRepository iCustomersRepository = new CustomerRepository();
    ArrayList<Customers> customersList = iCustomersRepository.readCustomers();
    static TreeSet<Booking> listBooking = new TreeSet<>(Booking::compareTo);

    static {
//        DayComparator dayComparator = new DayComparator();
//        Collections.sort(listBooking,dayComparator);
        listBooking.add(new Booking("3", LocalDate.of(2023, 03, 02), LocalDate.of(2023, 11, 05), LocalDate.of(2023, 03, 02), "3", "3"));
        listBooking.add(new Booking("4", LocalDate.of(2023, 05, 06), LocalDate.of(2023, 06, 12), LocalDate.of(2023, 03, 02), "3", "3"));
        listBooking.add(new Booking("3", LocalDate.of(2023, 12, 05), LocalDate.of(2023, 03, 02), LocalDate.of(2023, 03, 02), "3", "3"));
        listBooking.add(new Booking("6", LocalDate.of(2023, 03, 02), LocalDate.of(2023, 03, 02), LocalDate.of(2023, 03, 02), "3", "3"));

    }

    static Queue<Contract> listContract = new PriorityQueue<>();

    static {
        listContract.add(new Contract("id hop dong", "idCus", "12", "13", "id dich vu", 50.2));
        listContract.add(new Contract("id hop dong", "idCus", "12", "13", "id dich vu", 50.2));
        listContract.add(new Contract("id hop dong", "idCus", "12", "13", "id dich vu", 50.2));
    }

    public TreeSet<Booking> showBooking() {
        for (Booking bo : listBooking) {
            System.out.println(bo);
        }
        return listBooking;
    }

    public void addBooking() {

        String idCustomer = idKhach();
        String idDichVu = listDichVu();
        LocalDate dayBooking;
        LocalDate startDay;
        LocalDate endDay;
        String idBooking;
        boolean isExactly = true;
        do {
            System.out.println("Id booking");
            idBooking = scanner.nextLine();
            System.out.println("Ngày Booking");
            dayBooking = LocalDate.parse(scanner.nextLine());
            System.out.println("Ngày bắt đầu");
            startDay = LocalDate.parse(scanner.nextLine());
            System.out.println("Ngày kết ");
            endDay = LocalDate.of(2023, 12, 15);
            //compareTo() trả về một số nguyên, không phải một giá trị boolean. Để sửa lỗi này, bạn cần sử dụng phương thức compareTo() và so sánh kết quả trả về với 0.
            if (endDay.compareTo(startDay) > 0) { // kiểm tra xem endDay có lớn hơn startDay hay không
                isExactly = false;
            }
        } while (isExactly);
        Booking bo = new Booking(idBooking, dayBooking, startDay, endDay, idCustomer, idDichVu);
        listBooking.add(bo);
//        for (Map.Entry entry : villaIntegerLinkedHashMap.entrySet()) {
//                Villa villa = (Villa) entry.getKey();
//            if (villa.getCodeDichVu().equals(idDichVu)) {
//                int usageCount = (int) entry.getValue();
//                entry.setValue(usageCount + 1);
//                break;
//            }
//        }
    }
    public void creatContract() {

    }


    public String stDayBooking() {
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
                } else {
                    isExactly = true;
                }


            } catch (Exception e) {
                System.out.println("Nhap dung dinh dang");
                isExactly = false;

            }

        } while (!isExactly);

        return standard;

    }


    public String idKhach() {
        System.out.println("Danh Sach Customer");
        for (Customers cu : customersList) {
            System.out.println(cu);
        }
        while (true) {
            System.out.println("Nhap id khach hang");
            String id = scanner.nextLine();
            int count = 0;
            for (int i = 0; i < customersList.size(); i++) {
                if (id.equals(customersList.get(i).getId())) {
                    System.out.println(customersList.get(i));
                    count++;

                }
            }
            if (count == 0) {
                System.out.println("Khach hang k ton tai");
            } else {
                return id;
            }

        }
    }

    public String listDichVu() {
        System.out.println("***** Danh Sách Dịch Vụ *****");
        IFacilityService iFacilityService = new FacilityService();
        iFacilityService.display();
        Set<Villa> villaSet = villaIntegerLinkedHashMap.keySet();
        Set<House> houseSet = houseIntegerLinkedHashMap.keySet();
        Set<Room> roomSet = roomIntegerLinkedHashMap.keySet();

        while (true) {
            System.out.println("nhap id dich vu");
            String enterId = scanner.nextLine();
            int count = 0;
            for (Villa vl : villaSet) {
                if (enterId.equals(vl.getCodeDichVu())) {
                    System.out.println(vl.toString());
                    enterId = vl.getCodeDichVu();//? không cần thiết và có thể bị loại bỏ. Vì biến enterId đã lưu giá trị của mã id dịch vụ được nhập vào từ người dùng ở trên rồi, và không cần phải gán lại giá trị này.
                    vl.setUses(vl.getUses() + 1);
                    count++;
                }

            }
            for (House ho : houseSet){
                if (enterId.equals(ho.getCodeDichVu())){
                    System.out.println(ho.toString());
                    ho.setUses(ho.getUses()+1);
                    count++;
                }
            }
            if (count == 0) { // co cach khac kh?
                System.out.println("Khong tim thay dich vu");
            } else {
                return enterId;
            }

        }
    }

    private LocalDate birthday() {
        int date = tryDate();
        int month = tryMonth();
        date = monthBirth(month, date);
        int year = tryYear();
        if (month == 2) {
            date = yearBirth(date, month, year);
        }
        return LocalDate.of(year, month, date);
    }

    private int tryDate() {
        try {
            System.out.println("Nhập ngày:");
            int date = Integer.parseInt(scanner.nextLine());
            date = dayBirth(date);
            return date;
        } catch (Exception e) {
            System.out.println("Lỗi phông chữ!!! Vui lòng nhập lại!!!!");
            tryDate();
        }
        return 0;
    }

    private int tryMonth() {
        try {
            boolean isDate = false;
            int month;
            do {
                System.out.println("Nhập tháng:");
                month = Integer.parseInt((scanner.nextLine()));
                if (month >= 1 && month <= 12) {
                    isDate = true;
                    return month;
                } else {
                    System.out.println("Một năm chỉ có 12 tháng!!!");
                }
            } while (!isDate);
        } catch (Exception e) {
            System.out.println("Lỗi phông chữ!!! Vui lòng nhập lại!!!!");
            tryMonth();
        }
        return 0;
    }

    private int tryYear() {
        try {
            System.out.println("Nhập năm:");
            int year = Integer.parseInt(scanner.nextLine());
            return year;
        } catch (Exception e) {
            System.out.println("Lỗi phông chữ!!! Vui lòng nhập lại!!!!");
            tryYear();
        }
        return 0;
    }

    private int dayBirth(int date) {
        boolean isDate = false;
        do {
            do {
                if (date < 1 || date > 31) {
                    System.out.println("1 tháng có tối đá 31 ngày!!!");
                    try {
                        System.out.println("Nhập ngày sinh:");
                        date = Integer.parseInt(scanner.nextLine());
                        if (date >= 1 && date <= 31) {
                            isDate = true;
                            return date;
                        }
                    } catch (Exception e) {
                        System.out.println("Lỗi phông chữ!!! Vui lòng nhập lại!!!!");
                    }
                } else {
                    return date;
                }
            } while (!isDate);
        } while (!isDate);
        return 0;
    }

    private int monthBirth(int month, int date) {
        boolean isDate = false;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                do {
                    try {
                        if (date < 1 || date > 31) {
                            System.out.println("Tháng " + month + " chỉ có 31 ngày!!!");
                            System.out.println("Nhập ngày sinh:");
                            date = Integer.parseInt(scanner.nextLine());
                        } else {
                            isDate = true;
                            return date;
                        }
                    } catch (Exception e) {
                        System.out.println("Lỗi phông chữ!!! Vui lòng nhập lại!!!!");
                    }
                } while (!isDate);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                do {
                    try {
                        if (date < 1 || date > 30) {
                            System.out.println("Tháng " + month + " chỉ có 30 ngày!!!");
                            System.out.println("Nhập ngày sinh:");
                            date = Integer.parseInt(scanner.nextLine());
                        } else {
                            isDate = true;
                            return date;
                        }
                    } catch (Exception e) {
                        System.out.println("Lỗi phông chữ!!! Vui lòng nhập lại!!!!");
                    }
                } while (!isDate);
                break;
            case 2:
                do {
                    try {
                        if (date < 1 || date > 29) {
                            System.out.println("Tháng " + month + " chỉ có 29 ngày đối với năm nhuận\nvà chỉ có 28 ngày đối với năm không nhuận!!!");
                            System.out.println("Nhập ngày sinh:");
                            date = Integer.parseInt(scanner.nextLine());
                        } else {
                            isDate = true;
                            return date;
                        }
                    } catch (Exception e) {
                        System.out.println("Lỗi phông chữ!!! Vui lòng nhập lại!!!!");
                    }
                } while (!isDate);
                break;
        }
        return 0;
    }

    private int yearBirth(int date, int month, int year) {
        boolean isDate = false;
        if (month == 2) {
            do {
                try {
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        if (date >= 1 && date <= 29) {
                            isDate = true;
                            return date;
                        } else {
                            System.out.println("Năm " + year + " là năm nhuận nên tháng 2 có 29 ngày");
                            System.out.println("Nhập ngày sinh:");
                            date = Integer.parseInt(scanner.nextLine());
                        }
                    } else {
                        if (date >= 1 && date <= 28) {
                            isDate = true;
                            return date;
                        } else {
                            System.out.println("Tháng 2 chỉ có 28 ngày");
                            System.out.println("Nhập ngày sinh:");
                            date = Integer.parseInt(scanner.nextLine());
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Lỗi phông chữ!!! Vui lòng nhập lại!!!!");
                }
            } while (!isDate);
        }
        return 0;
    }
}
