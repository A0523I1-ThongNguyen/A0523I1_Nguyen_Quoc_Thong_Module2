package ss12_java_collection_framework.array_list.controller;

import ss12_java_collection_framework.array_list.service.IOtoService;
import ss12_java_collection_framework.array_list.service.OtoService;

import java.util.Scanner;

public class OtoController {

    public static void Show() {
        IOtoService iOtoService = new OtoService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:");
            System.out.println("1.Thêm Oto" +
                    "\n 2.Display Oto" +
                    "\n 3.Check danh sách có rỗng không? " +
                    "\n 4.Check Size" +
                    "\n 5.Delete All" +
                    "\n 6.Xóa Oto theo tên"+
                    "\n 7.Tìm Oto theo tên" +
                    "\n 8.Sắp xếp giá Oto theo chiều tăng Or giảm dần"+
                    "\n 9.Edit");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    System.out.println("Thêm Oto");
                    iOtoService.add();
                    break;
                case 2:
                    System.out.println("Show List Oto");
                    iOtoService.display();
                    break;
                case 3:
                    System.out.println("Check List rỗng");
                    iOtoService.checkEmpty();
                    break;
                case 4:
                    System.out.println("Check Size Oto");
                    iOtoService.checkSize();
                    break;
                case 5:
                    System.out.println("Delete All Oto");
                    iOtoService.removeAll();
                    break;
                case 6:
                    System.out.println("Delete Oto flow name");
                    iOtoService.delOto();
                    break;
                case 7:
                    System.out.println("Search Oto flow name");
                    iOtoService.searchOto();
                    break;
                case 8:
                    System.out.println("Sắp xếp Giá Oto theo chiều tăng or giảm dần");
                    iOtoService.sortByPrice();
                case 9:
                    System.out.println("Edit");
                    iOtoService.edit();
            }


        }while (flag);
    }
}
