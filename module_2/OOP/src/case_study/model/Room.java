package case_study.model;

public class Room extends Facility {
    String dichVuFree;

    public Room(String codeDichVu, String nameDichVu, Double dienTichSuDung, Double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuFree) {
        super(codeDichVu, nameDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuFree = dichVuFree;
    }

    public Room(String dichVuFree) {
        this.dichVuFree = dichVuFree;
    }

    public Room() {
    }

    public String getDichVuFree() {
        return dichVuFree;
    }

    public void setDichVuFree(String dichVuFree) {
        this.dichVuFree = dichVuFree;
    }

    @Override
    public String toString() {
        return super.toString() +"Room{" +
                "dichVuFree='" + dichVuFree + '\'' +
                '}';
    }
}
