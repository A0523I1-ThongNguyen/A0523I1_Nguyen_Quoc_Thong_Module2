package ss7_interface_colorable;

public class Circle extends Shape {
    private double radius = 6;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean flag , double radius){
        super(color,flag);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' +super.toString();
    }
}
