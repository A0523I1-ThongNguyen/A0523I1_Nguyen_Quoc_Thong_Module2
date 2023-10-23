package case_study.model;

public abstract  class Facility {

    private String codeDichVu;
    private String nameDichVu;
    private Double dienTichSuDung;
    private Double chiPhiThue;
    private int soLuongNguoiToiDa;
    private String kieuThue;


    public Facility(String codeDichVu, String maDichVu, Double dienTichSuDung, Double chiPhiThue, int soLuongNguoiToiDa, String kieuThue) {
        this.codeDichVu = codeDichVu;
        this.nameDichVu = maDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public Facility(){

    }





    public String getCodeDichVu() {
        return codeDichVu;
    }

    public void setCodeDichVu(String codeDichVu) {
        this.codeDichVu = codeDichVu;
    }


    public String getNameDichVu() {
        return nameDichVu;
    }

    public void setNameDichVu(String maDichVu) {
        this.nameDichVu = maDichVu;
    }

    public Double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public Double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Double chiPhiThue) {
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
        return "DichVu{" + "Ma dich vu='" + codeDichVu + '\'' +
                "TenDichVu='" + nameDichVu + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soLuongNguoiToiDa='" + soLuongNguoiToiDa + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}
