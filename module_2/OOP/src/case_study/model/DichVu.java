package case_study.model;

public class DichVu {
    private String maDichVu;
    private Double dienTichSuDung;
    private String chiPhiThue;
    private int soLuongNguoiToiDa;
    private String kieuThue;

    public DichVu(String maDichVu, Double dienTichSuDung, String chiPhiThue, int soLuongNguoiToiDa, String kieuThue) {
        this.maDichVu = maDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }
    public DichVu(){

    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public Double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "DichVu{" +
                "maDichVu='" + maDichVu + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soLuongNguoiToiDa='" + soLuongNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
