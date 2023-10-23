package thi_module2.model;

import java.time.LocalDate;

public class BenhAnVIP extends BenhAn {
    private String cacGoiVIP;
    private LocalDate thoiHanVIP;

    public BenhAnVIP(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, String cacGoiVIP, LocalDate thoiHanVIP) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.cacGoiVIP = cacGoiVIP;
        this.thoiHanVIP = thoiHanVIP;
    }


    public BenhAnVIP() {

    }

    public String getCacGoiVIP() {
        return cacGoiVIP;
    }

    public void setCacGoiVIP(String cacGoiVIP) {
        this.cacGoiVIP = cacGoiVIP;
    }

    public LocalDate getThoiHanVIP() {
        return thoiHanVIP;
    }

    public void setThoiHanVIP(LocalDate thoiHanVIP) {
        this.thoiHanVIP = thoiHanVIP;
    }

    @Override
    public String toString() {
        return super.toString() + "BenhAnVIP{" +
                "cacGoiVIP='" + cacGoiVIP + '\'' +
                ", thoiHanVIP=" + thoiHanVIP +
                '}';
    }
}
