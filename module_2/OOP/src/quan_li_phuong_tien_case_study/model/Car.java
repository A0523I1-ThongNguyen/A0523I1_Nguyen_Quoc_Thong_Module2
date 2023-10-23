package quan_li_phuong_tien_case_study.model;

public class Car extends Vehicle {
    private int soGhe;
    private String kieuXe;

    public Car(String bienSo, String tenHang, String namSanXuat, String chuSoHuu, int soGhe, String kieuXe) {
        super(bienSo, tenHang, namSanXuat, chuSoHuu);
        this.soGhe = soGhe;
        this.kieuXe = kieuXe;
    }

    public Car(int soGhe, String kieuXe) {
        this.soGhe = soGhe;
        this.kieuXe = kieuXe;
    }
    public Car(){

    }



    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                ", soGhe=" + soGhe +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
