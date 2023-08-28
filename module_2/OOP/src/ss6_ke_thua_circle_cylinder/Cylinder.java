package ss6_ke_thua_circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public Cylinder(double height){
        this.height = height;//
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double tinhDienTichHinhTru() {
        return 2 * Math.PI * getRadius() * this.height;
    }

    @Override
    public String toString() {
        return "Hinh tru co ban kinh " + getRadius() + "| Co mau " + getColor() + "| Chieu cao la : " +this.height +
                "| Dien tich day hinh tru la: " + tinhDienTichHinhTru();
    }


}
