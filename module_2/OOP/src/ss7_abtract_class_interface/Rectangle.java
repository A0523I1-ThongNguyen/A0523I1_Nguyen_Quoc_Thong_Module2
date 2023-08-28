package ss7_abtract_class_interface;

import java.util.Random;

public class Rectangle extends Area implements IResizeable {
    private double cd;
    private double cr;

    public Rectangle() {

    }

    public Rectangle(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public double getDienTich() {
        return cd * cr;
    }


    @Override
    //class abtract
    public double getArea() {
        return cd * cr;
    }

    //interface
    @Override
    public void resize(double percent) {
        System.out.println("Dien tich hinh chu nhat sau khi tang len : " +percent);
        System.out.println((cd*cr)*percent);
        System.out.println("-------------------------------");
    }


}
