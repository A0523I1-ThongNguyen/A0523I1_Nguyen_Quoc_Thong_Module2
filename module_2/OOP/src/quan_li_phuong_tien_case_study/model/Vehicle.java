package quan_li_phuong_tien_case_study.model;

import case_study.model.Villa;

public abstract class Vehicle {
    //Biển kiểm soát , tên hãng sản xuất, năm sản xuất, chủ sở hữu.
    protected String bienSo;
    protected String tenHang;
    private String  namSanXuat;
    private String chuSoHuu;

    public Vehicle(String bienSo, String tenHang, String namSanXuat, String chuSoHuu) {
        this.bienSo = bienSo;
        this.tenHang = tenHang;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public Vehicle(){

    }



    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "bienSo='" + bienSo + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
