package quan_li_phuong_tien_case_study.model;

import java.util.Objects;

public class Moto extends Vehicle {
    private Double congSuat;

    public Moto(String bienSo, String tenHang, String namSanXuat, String chuSoHuu, Double congSuat) {
        super(bienSo, tenHang, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public Moto(Double congSuat) {
        this.congSuat = congSuat;
    }

    public Double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(Double congSuat) {
        this.congSuat = congSuat;
    }

    public Moto() {
    }
    public Moto(String bsx){
        this.bienSo = bsx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return Objects.equals(bienSo, moto.bienSo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(congSuat);
    }

    @Override
    public String toString() {
        return  "Biển Số ='" + getBienSo() + '\'' +
                ", Tên Hãng ='" + getTenHang() + '\'' +
                ", Năm Sản Xuất ='" + getNamSanXuat() + '\'' +
                ", Chủ Sở Hữu ='" + getChuSoHuu() + '\'' +
                ", Công Suất ='" + getCongSuat() + '\'' +
                '}';

    }
}
