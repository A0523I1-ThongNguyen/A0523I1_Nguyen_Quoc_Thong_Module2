package case_study.model;

import java.util.ArrayList;

public class Customers extends Person {

    private String levelKhach;
    private String address;

    public Customers(String id, String fullName, String date, String gioitinh, String cmnd, String phone, String email, String levelKhach, String address) {
        super(id, fullName, date, gioitinh, cmnd, phone, email);
        this.levelKhach = levelKhach;
        this.address = address;
    }

    public Customers(String levelKhach, String address) {
        this.levelKhach = levelKhach;
        this.address = address;
    }
    public Customers(){

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
        return "Customers{" +getId() + ", " + getFullName() + ", " +getDate()+", "+ getGioitinh() +", "+getCmnd()+","+getPhone()+","+getEmail()+", "+
                "levelKhach='" + levelKhach + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
