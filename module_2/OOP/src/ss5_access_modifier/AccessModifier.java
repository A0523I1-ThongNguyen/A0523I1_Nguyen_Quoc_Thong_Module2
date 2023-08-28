package ss5_access_modifier;


public class AccessModifier {

    private double radius = 1.0;
    private String color = "red";

    public AccessModifier() {

    }

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }


}
