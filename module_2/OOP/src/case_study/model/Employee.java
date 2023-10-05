package case_study.model;

import java.time.LocalDate;

public class Employee {
    private String MaNV;
    private String fullName;
    private String date;
    private String gioitinh;
    private String cmnd;
    private String phone;
    private String email;
    private String level;
    private String location;
    private double salary;
    public Employee(){

    }

    public Employee(String maNV, String fullName, String date, String gioitinh, String cmnd, String phone, String email, String level, String location, double salary) {
        MaNV = maNV;
        this.fullName = fullName;
        this.date = date;
        this.gioitinh = gioitinh;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(int i, int maNV, String fullName, String date, String gender, String cmnd, String phone, String email, String level, String location, Double salary) {
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "MaNV=" + MaNV +
                ", fullName='" + fullName + '\'' +
                ", date='" + date + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
