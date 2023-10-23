package case_study.model;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHo;
    private int soTang;
    int uses;

    public Villa(){

    }

    public Villa(int size, String codeID, String nameDV, Double dt, double cp, int peopleMax, String kieuThue, String tieuChuanRoom, Double dtHoBoi, int soTang,int use) {
    }

    public int getUses() {
        return uses;
    }

    public void setUses(int uses) {
        this.uses = uses;
    }

    public Villa(String codeDichVu, String nameDichVu, Double dienTichSuDung, Double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, double dienTichHo, int soTang,int use) {
        super(codeDichVu, nameDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHo = dienTichHo;
        this.soTang = soTang;
        this.uses = use;
    }

    public Villa(String tieuChuanPhong, double dienTichHo, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHo = dienTichHo;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHo() {
        return dienTichHo;
    }

    public void setDienTichHo(double dienTichHo) {
        this.dienTichHo = dienTichHo;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString()+ "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHo=" + dienTichHo +
                ", soTang=" + soTang +
                ", so lan su dung: =" + uses + '}';
    }
}
