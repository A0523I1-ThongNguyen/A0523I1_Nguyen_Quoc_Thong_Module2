package case_study.model;

public class Customers {
    private String maKH;
    private String fullName;
    private String date;
    private String gioitinh;
    private String cmnd;
    private String phone;
    private String email;
    private String levelKhach;
    private String address;

    public Customers(String maKH, String fullName, String date, String gioitinh, String cmnd, String phone, String email, String levelKhach, String address) {
        this.maKH = maKH;
        this.fullName = fullName;
        this.date = date;
        this.gioitinh = gioitinh;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.levelKhach = levelKhach;
        this.address = address;
    }
    public Customers(){

    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevelKhach() {
        return levelKhach;
    }

    public void setLevelKhach(String levelKhach) {
        this.levelKhach = levelKhach;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maKH=" + maKH +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", levelKhach='" + levelKhach + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
