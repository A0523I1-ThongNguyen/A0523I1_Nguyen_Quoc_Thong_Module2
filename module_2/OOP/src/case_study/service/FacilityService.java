package case_study.service;

import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.repository.FacilityRepository;
import case_study.repository.IFacilityRepository;
import case_study.util.ReadVilla;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class FacilityService implements IFacilityService {
    static Scanner scanner = new Scanner(System.in);
    static IFacilityRepository iFacilityRepository = new FacilityRepository();

//biến villaIntegerLinkedHashMap là một đối tượng kiểu LinkedHashMap, nó chứa một danh sách các đối tượng Villa và số lượng tương ứng của từng Villa trong đó.
// Trong khối static, chúng ta đã khởi tạo và thêm các đối tượng Villa vào villaIntegerLinkedHashMap, với số lượng ban đầu là 0.
// Điều này có nghĩa là danh sách ban đầu không có Villa nào được đặt trạng thái sử dụng (số lượng sử dụng = 0).
    static LinkedHashMap<Villa, Integer> villaIntegerLinkedHashMap = new LinkedHashMap<>();
    static LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = new LinkedHashMap<>();
    static LinkedHashMap<Room, Integer> roomIntegerLinkedHashMap = new LinkedHashMap<>();


    static {
        villaIntegerLinkedHashMap.put(new Villa("VL1", "dv1", 30.5, 30.5, 5, "theo Ngay", "vip", 43, 3, 0), 0);
        villaIntegerLinkedHashMap.put(new Villa("VL2", "dv2", 43.2, 30.5, 5, "theo Ngay", "vip", 43, 3, 0), 0);
        villaIntegerLinkedHashMap.put(new Villa("VL3", "dv3", 50.2, 30.5, 5, "theo Ngay", "vip", 43, 3, 0), 0);
    }

    static {
        houseIntegerLinkedHashMap.put(new House("Ho1", "dv1", 50.4, 30.5, 5, "Thang", "Vip", 2, 0), 0);
        houseIntegerLinkedHashMap.put(new House("Ho2", "dv2", 20.5, 30.5, 5, "Thang", "Vip", 2, 0), 0);
        houseIntegerLinkedHashMap.put(new House("Ho3", "dv3", 10.5, 30.5, 5, "Thang", "Vip", 2, 0), 0);

    }

    static {
        roomIntegerLinkedHashMap.put(new Room("Ro1", "dv1", 30.5, 30.5, 3, "nam", "dien nuoc"), 0);
        roomIntegerLinkedHashMap.put(new Room("Ro2", "dv2", 30.5, 30.5, 3, "nam", "dien nuoc"), 0);
        roomIntegerLinkedHashMap.put(new Room("Ro3", "dv3", 30.5, 30.5, 3, "nam", "dien nuoc"), 0);
    }

    //    public static void main(String[] args) {
//        Villa Villa;
//        int valueA = villaInteger.get(Villa);
//        System.out.println(valueA);
//    }
    @Override
    public void display() {
        System.out.println("Show Villa");
        Set<Villa> villaSet = villaIntegerLinkedHashMap.keySet();
        for (Villa vl : villaSet) {
            System.out.println(vl.toString());
        }
        System.out.println("Show House");

        Set<House> houseSet = houseIntegerLinkedHashMap.keySet();//houseSet` là tập hợp các key của `houseIntegerLinkedHashMap`.
        {
            for (House ho : houseSet) {//in ra key
                System.out.println(ho.toString());
            }
        }

        System.out.println("Show Room");
        Set<Room> roomSet = roomIntegerLinkedHashMap.keySet();
        for (Room ro : roomSet) {
            System.out.println(ro.toString());
        }
    }

    //Mã dịch vụ, Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
//-	Riêng loại Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.
    @Override
    public void addVilla() {
        try {
            System.out.println("Nhap id");
            String codeID = idVilla();
            System.out.println("Nhap ten dich vu");
            String nameDV = scanner.nextLine();
            System.out.println("Nhap dien tich su dung");
            Double dt = area();
            System.out.println("Nhap chi phi thue");
            double cp = chiPhiThue();
            System.out.println("So luong nguoi toi da");
            int peopleMax = maxPeople();
            System.out.println("Kieu thue");
            String kieuThue = kieuThue();
            System.out.println("Tieu chuan phong");
            String tieuChuanRoom = scanner.nextLine();
            System.out.println("Dien tich ho boi");
            Double dtHoBoi = area();
            System.out.println("Nhap so tang");
            int soTang = soTang();

            Villa villa = new Villa(codeID, nameDV, dt, cp, peopleMax, kieuThue, tieuChuanRoom, dtHoBoi, soTang, 0);

            //    LinkedHashMap<Villa,Integer> linkedHashMap = villaIntegerLinkedHashMap;
            villaIntegerLinkedHashMap.put(villa, 0);

            iFacilityRepository.writeVilla(villaIntegerLinkedHashMap);
        } catch (Exception e) {
            System.out.println("Sai cu phap, enter again");
        }
    }

    @Override
    public void addHouse() {
        try {
            System.out.println("Nhap id");
            String idHouse = idHouse();
            System.out.println("Ten Dich vu");
            String nameDV = scanner.nextLine();
            System.out.println("Dien tich su dung");
            double dt = area();
            System.out.println("Nhap chi phi thue");
            double chiPhiThue = chiPhiThue();
            System.out.println("Nhao so nguoi toi da");
            int peopleMax = maxPeople();
            System.out.println("Nhap kieu thue");
            String kieuThue = kieuThue();
            System.out.println("Nhap thieu chuan phong");
            String tieuChuanPhong = scanner.nextLine();
            System.out.println("Nhap so tang");
            int soTang = soTang();
            House newHouse = new House(idHouse, nameDV, dt, chiPhiThue, peopleMax, kieuThue, tieuChuanPhong, soTang, 0);
            houseIntegerLinkedHashMap.put(newHouse, 0);
            iFacilityRepository.writeHouse(houseIntegerLinkedHashMap);
        } catch (Exception e) {
            System.out.println("Sai cu phap");
        }

    }

    @Override
    public void addRoom() {

    }

    public static String nameService() {
        String tenDV;
        while (true) {
            tenDV = scanner.nextLine();
            String ok = "^[A-Z]+\\d";
            if (Pattern.matches(ok, tenDV)) {
                return tenDV;
            } else {
                System.out.println("Ten khong ton tai");
            }
        }
    }

    public static String idVilla() {
        String id;
        while (true) {
            id = scanner.nextLine();
            String ok = "^SVVL-[0-9]{4}$";
            if (Pattern.matches(ok, id)) {
                return id;
            } else {
                System.out.println(id + " Wrong");
            }
        }
    }

    public static String idHouse() {
        String id;
        while (true) {
            id = scanner.nextLine();
            String ok = "^SVHO-[0-9]{4}$";
            if (Pattern.matches(ok, id)) {
                return id;
            } else {
                System.out.println(id + " does not exits");
            }
        }
    }

    public static String idRoom() {
        String id;
        while (true) {
            id = scanner.nextLine();
            String ok = "^SVRO-[0-9]{4}$";
            if (Pattern.matches(ok, id)) {
                return id;
            } else {
                System.out.println(id + " does not exits");
            }
        }
    }

    public static Double area() {
        Double dt;
        while (true) {
            dt = Double.parseDouble(scanner.nextLine());
            if (dt > 30) {
                return dt;
            } else {
                System.out.println("Dien tich phai lon hon 30");
            }
        }
    }

    public static Double chiPhiThue() {
        Double cp;
        while (true) {
            cp = Double.parseDouble(scanner.nextLine());
            if (cp > 0) {
                return cp;
            } else {
                System.out.println("chi phi phai la so duong");
            }
        }
    }

    public static int maxPeople() {
        int max;
        while (true) {
            max = Integer.parseInt(scanner.nextLine());
            if (max > 0 && max < 20) {
                return max;
            } else {
                System.out.println("-Số lượng người tối đa phải >0 và nhỏ hơn <20");
            }
        }
    }

    private String kieuThue() {
        int choose;
        String type;
        while (true) {
            System.out.println("======= Kiểu thuê =======");
            System.out.println("1. Thuê theo năm");
            System.out.println("2. Thuê theo tháng");
            System.out.println("3. Thuê theo ngày");
            System.out.println("4. Thuê theo giờ");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        type = "Thuê theo năm";
                        return type;
                    case 2:
                        type = "Thuê theo tháng";
                        return type;
                    case 3:
                        type = "Thuê theo ngày";
                        return type;
                    case 4:
                        type = "Thuê theo giờ";
                        return type;
                }
            } catch (NumberFormatException n) {
                System.out.println("Nhập sai định dạng!!!");
            }
        }
    }

    public static int soTang() {
        int soTang;
        while (true) {
            soTang = Integer.parseInt(scanner.nextLine());
            if (soTang > 0) {
                return soTang;
            } else {
                System.out.println("chi phi phai la so duong");
            }
        }
    }


    public static String tieuChuanPhong() {
        String tenDV;
        while (true) {
            tenDV = scanner.nextLine();
            String ok = "^[A-Z]+\\d";
            if (Pattern.matches(ok, tenDV)) {
                return tenDV;
            } else {
                System.out.println("Ten khong ton tai");
            }
        }
    }


}
