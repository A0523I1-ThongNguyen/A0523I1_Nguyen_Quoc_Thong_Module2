package case_study.service;

import case_study.model.Booking;
import case_study.model.Contract;

import java.time.format.DateTimeFormatter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class ContactService  {
    Scanner scanner = new Scanner(System.in);
    Contract c = new Contract();
    static Queue<Contract> listContract = new PriorityQueue<>();
    BookingService bookingService  = new BookingService();
//
//    static {
//        listContract.add(new Contract("id hop dong1", "b1", 25.0, 50.0));
//        listContract.add(new Contract("id hop dong2", "b2", 10, 20.0));
//        listContract.add(new Contract("id hop dong3", "b3", 30, 50.0));
//
//    }
    public void creatContract(){
        TreeSet<Booking> book = bookingService.showBooking();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        System.out.println("Nhap id hop dong");
        String idHD = scanner.nextLine();
        System.out.println("Nhap tien coc");
        Double tienCoc = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap tong tien thanh toan");
        Double tienThanhToan = Double.parseDouble(scanner.nextLine());
        Contract newC = new Contract(idHD, book.first().getIdBooking(),tienCoc,tienThanhToan); // booking đã sắp xếp theo ngày (id cũng dc sắp xếp) nên gọi hàm firts() ở đây.
        // số hợp đồng, mã booking, số tiền cọc trước, tổng số tiền thanh toán.
        listContract.add(newC);
        System.out.println("========HỢP ĐỒNG========");
        for (Contract co : listContract){
            System.out.println(co);
        }
    }
}
