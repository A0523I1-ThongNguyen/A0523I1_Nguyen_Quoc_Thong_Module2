package case_study.model;

public class Room extends DichVu {
    String dichVuFree;

    public Room(String maDichVu, Double dienTichSuDung, String chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuFree) {
        super(maDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuFree = dichVuFree;
    }

    public Room() {
    }
}
