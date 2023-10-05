package case_study.model;

public class Villa extends DichVu {
    private String tieuChuanPhong;
    private double dienTichHo;
    private int soTang;

    public Villa(){

    }

    public Villa(String maDichVu, Double dienTichSuDung, String chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, double dienTichHo, int soTang) {
        super(maDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHo = dienTichHo;
        this.soTang = soTang;
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
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHo=" + dienTichHo +
                ", soTang=" + soTang +
                '}';
    }
}
