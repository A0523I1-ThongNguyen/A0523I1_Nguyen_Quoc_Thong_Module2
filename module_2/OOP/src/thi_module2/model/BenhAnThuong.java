package thi_module2.model;

import java.time.LocalDate;

public class BenhAnThuong extends BenhAn {
    private double phiNamVien;

    public BenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, double phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong() {

    }

    public BenhAnThuong(int stt, String maBenhAn, String maBenhNhan, String name, LocalDate ngayNhapVien, LocalDate ngayRaVien, String liDo) {
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return super.toString() + "BenhAnThuong{" +
                "phiNamVien=" + phiNamVien +
                '}';
    }
}
