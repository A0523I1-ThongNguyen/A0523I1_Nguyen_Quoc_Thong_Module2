package ss7_abtract_class_interface;

import test_thua_ke.Main;

public class Circle extends Area implements IResizeable{
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override // class abtract
    public double getArea() {
        return Math.PI * radius*radius;
    }


    @Override // interface
    public void resize(double percent) {
        System.out.println("Diện tích hình tròn sau khi tăng lên " + percent + " :");
        System.out.println(Math.PI * Math.pow((radius + percent), 2));
        System.out.println("-------------------------------");
    }
}
