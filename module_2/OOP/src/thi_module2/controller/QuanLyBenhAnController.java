package thi_module2.controller;


import java.util.Scanner;

public class QuanLyBenhAnController {
    Scanner scanner = new Scanner(System.in);

    public void showBenhAn() {
        int choose;
        do {
            System.out.println("---Choose Option---");
            System.out.println("1.Thêm mới benh an");
            System.out.println("2.Xoa Benh an");
            System.out.println("3.Xem Danh Sach Benh An");
            System.out.println("4.exit");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    AddBenhAnhController addBenhAnhController = new AddBenhAnhController();
                    addBenhAnhController.show();
                    break;
                case 2:
                    DeleteBenhAnCotrolller deleteBenhAnCotrolller = new DeleteBenhAnCotrolller();
                    deleteBenhAnCotrolller.delete();
                case 3:
                    ShowBenhAnController showBenhAnController = new ShowBenhAnController();
                    showBenhAnController.show();
                    break;
                case 4:

                default:
                    System.out.println("End Program");
                    break;
            }
        } while (choose >= 1 && choose <= 3);
    }
}
