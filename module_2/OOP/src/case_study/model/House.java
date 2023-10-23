package case_study.model;

public class House extends Facility {
    private String tieuChuanPhong;
    private int soTang;
    int uses;

    public House(String codeDichVu, String nameDichVu, Double dienTichSuDung, Double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, int soTang,int uses) {
        super(codeDichVu, nameDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
        this.uses = uses;
    }

    public House(String tieuChuanPhong, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public House() {
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString() + "House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                ", uses=" + uses +
                '}';
    }
}
