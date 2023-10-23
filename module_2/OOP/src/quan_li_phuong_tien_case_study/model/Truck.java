package quan_li_phuong_tien_case_study.model;

import quan_li_phuong_tien_case_study.service.TruckService;

import java.util.Objects;

public class Truck extends Vehicle implements Comparable<Truck> {
    private Double trongTai;


    public Truck(String bienSo, String tenHang, String namSanXuat, String chuSoHuu, Double trongTai) {
        super(bienSo, tenHang, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public Truck(Double trongTai) {
        this.trongTai = trongTai;
    }
    public Truck(String tenHang) {
        this.tenHang = tenHang;
    }

    public Truck() {

    }

    public Double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(Double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "trongTai=" + trongTai +
                '}';
    }

    @Override
    public int compareTo(Truck o) {
        return this.getTrongTai().compareTo(o.getTrongTai());
        // int result = this.bienSo.compareTo((o.bienSo));
        //        if (result == 0){
        //            return this.getTrongTai().compareTo(o.getTrongTai());
        //        }
        //        return result;
    }


    /* Phương thức này được sử dụng để so sánh hai đối tượng. Trong trường hợp này,
     phương thức `equals(Object o)` được ghi đè để so sánh hai đối tượng `Truck` với nhau.
     Đầu tiên, phương thức kiểm tra xem hai đối tượng có cùng tham chiếu không (`this == o`).
     Nếu có, nghĩa là cùng một đối tượng, phương thức trả về `true`.
     Tiếp theo, phương thức kiểm tra xem đối tượng `o` có phải là một đối tượng `Truck` không, sử dụng `getClass()` để lấy thông tin về lớp của đối tượng.
     Nếu không phải, phương thức trả về `false`.
     Cuối cùng, nếu hai đối tượng là hai đối tượng `Truck` và có cùng giá trị của thuộc tính `tenHang` (sử dụng `Objects.equals(tenHang, truck.tenHang)`),
     phương thức trả về `true`, ngược lại trả về `false`.*/

    //Nếu "o" là null, điều đó có nghĩa là không có đối tượng nào được truyền vào và do đó không thể so sánh được với đối tượng hiện tại
    //Trong trường hợp này, ta không thể xác định được đối tượng "o" là loại nào và cũng không thể tiếp tục so sánh nên trả về giá trị false.
    // Nếu không kiểm tra điều kiện "o == null" thì khi "o" là null và ta thử truy cập đến phương thức getClass() trên một đối tượng null, sẽ xảy ra lỗi NullPointerException.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return  Objects.equals(tenHang, truck.tenHang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trongTai);//For what?
    }

}
