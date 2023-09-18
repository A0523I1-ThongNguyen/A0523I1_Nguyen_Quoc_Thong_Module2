package ss12_thuat_toan_tim_kiem;

import java.util.LinkedList;
import java.util.Scanner;

public class chuoi_lien_tiep_dai_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Character> strMax = new LinkedList<>();// lưu trữ chuỗi liên tiếp có độ dài lớn nhất
        LinkedList<Character> listKiTu = new LinkedList<>();// lưu trữ các ký tự trong chuỗi.
//        LinkedList<Character> test = new LinkedList<>();
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
/* - Đầu tiên, chương trình khởi tạo một đối tượng Scanner để đọc dữ liệu từ người dùng.
- Sau đó, hai đối tượng LinkedList được khởi tạo: "max" và "list". Đối tượng "max" được sử dụng để lưu trữ chuỗi liên tiếp có độ dài lớn nhất, trong khi đối tượng "list" được sử dụng để lưu trữ các ký tự trong chuỗi.
- Người dùng được yêu cầu nhập chuỗi bằng câu lệnh "System.out.print("Nhập chuỗi: ");".
- Sau đó, vòng lặp "for" được sử dụng để duyệt qua tất cả các ký tự trong chuỗi đầu vào.
- Trong vòng lặp, một số câu lệnh được thực hiện: + Nếu "list" có độ dài lớn hơn 1 và ký tự hiện tại nhỏ hơn hoặc bằng ký tự cuối cùng trong "list" và "list" chứa ký tự hiện tại, thì "list" sẽ được xóa sạch để bắt đầu một chuỗi mới. + Ký tự hiện tại sẽ được thêm vào "list". + Nếu "list" có độ dài lớn hơn "max", thì "max" sẽ được xóa và tất cả các phần tử trong "list" sẽ được thêm vào "max".
- Sau khi kết thúc vòng lặp, chương trình sẽ hiển thị "max" - chuỗi liên tiếp có độ dài lớn nhất.
- Cuối cùng, câu lệnh "System.out.println();" được sử dụng để xuống dòng.*/