package set;

import java.util.*;

public class RutTham_TreeSet {
    SortedSet<String> thungChuaPhieu = new TreeSet<>();

    public RutTham_TreeSet() {

    }
    public RutTham_TreeSet(SortedSet<String> thungChuaPhieu) {
        this.thungChuaPhieu = thungChuaPhieu;
    }

    public boolean addPhieu(String namePhieu){
        return thungChuaPhieu.add(namePhieu);//vi thung phieu la 1 cai Set nen no co method add
    }
    public boolean deletePhieu(String namePhieu){
        return this.thungChuaPhieu.remove(namePhieu);
    }

    public boolean checkPhieuTonTai(String namePhieu){
        return this.thungChuaPhieu.contains(namePhieu);
    }

    public void deleteAllPhieu(){
        this.thungChuaPhieu.clear();
    }

    public int laySpLuong(){
        return this.thungChuaPhieu.size();
    }

    public String rutThamPhieu(){
        String ketQua = "";
        Random random = new Random();
        int viTri = random.nextInt(this.thungChuaPhieu.size());
        ketQua = (String) this.thungChuaPhieu.toArray()[viTri];
        return ketQua;
    }
    public void  inRaAllPhieu(){
        System.out.println(Arrays.toString(thungChuaPhieu.toArray()));
    }

    public static void main(String[] args) {
        int chon = 0;
        Scanner scanner = new Scanner(System.in);

        RutTham_TreeSet rutTham = new RutTham_TreeSet();
        do {
            System.out.println("---------------");
            System.out.println("Menu");
            System.out.println("1.Thêm mã số dự thưởng");
            System.out.println("2.Xóa mã số dự thưởng");
            System.out.println("3.Kiểm tra mã số thưởng có tồn tại không");
            System.out.println("4.Xóa tất cả phiếu dự thưởng");
            System.out.println("5.Lấy ra số lượng phiếu dự thưởng");
            System.out.println("6.Rút Thăng trúng thưởng");
            System.out.println("7.In ra tat ca cac phieu");
            System.out.println("0.Out Program");
            chon =Integer.parseInt(scanner.nextLine());
            if (chon==1||chon==2||chon==3){

                    System.out.println("Nhap ma phieu");
                    String namePhieu = scanner.nextLine();


                if (chon==1){
                    rutTham.addPhieu(namePhieu);
                } else if (chon==2) {
                    rutTham.deletePhieu(namePhieu);
                }else {
                    System.out.println("Result: " + rutTham.checkPhieuTonTai(namePhieu));
                }
            }else  if (chon==4){
                rutTham.deleteAllPhieu();
            } else if (chon==5) {
                System.out.println("So luon phieu : " + rutTham.laySpLuong());
            }else if (chon==6){
                System.out.println("Ma so trung thuong la :"+rutTham.rutThamPhieu());
            } else if (chon==7) {
                System.out.println("Tat ca Phieu :");
                rutTham.inRaAllPhieu();
            }
        }while (chon!=0);
    }
}
