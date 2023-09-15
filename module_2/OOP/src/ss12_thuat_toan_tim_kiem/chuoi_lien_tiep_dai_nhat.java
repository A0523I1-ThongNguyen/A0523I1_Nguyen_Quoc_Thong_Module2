package ss12_thuat_toan_tim_kiem;

import java.util.LinkedList;
import java.util.Scanner;

public class chuoi_lien_tiep_dai_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Character> strMax = new LinkedList<>();// lưu trữ chuỗi liên tiếp có độ dài lớn nhất
        LinkedList<Character> listKiTu = new LinkedList<>();// lưu trữ các ký tự trong chuỗi.

        System.out.println("Nhap chuoi:");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (listKiTu.size() > 1 && str.charAt(i) <= listKiTu.getLast()
                    && listKiTu.contains(str.charAt(i))) {
                listKiTu.clear();
            }
            listKiTu.add(str.charAt(i));
            if (listKiTu.size() > strMax.size()) {
                strMax.clear();
                strMax.addAll(listKiTu);
            }
        }
        for(Character max : strMax){
            System.out.print(max);
        }
    }
}
