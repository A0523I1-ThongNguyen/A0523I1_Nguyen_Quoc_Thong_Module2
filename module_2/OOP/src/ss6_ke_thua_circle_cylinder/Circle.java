package ss6_ke_thua_circle_cylinder;

public class Circle {
    private double radius;
    private String color;
    

    public void setRadius(double color) {
        this.radius = radius;
    }

    public void setColor(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public Circle(){

    }

    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getDienTichHinhTron() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Ban kinh hinh tron = " +
                radius +
                "| Hinh tron co mau: " + color + '\'' +"| Dien Tich hinh tron la : "+getDienTichHinhTron();
    }


}
