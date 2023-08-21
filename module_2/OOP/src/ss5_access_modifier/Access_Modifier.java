package ss5_access_modifier;

public class Access_Modifier {

    private double radius = 1.0;
    private String color = "red";

    public Access_Modifier() {

    }

    public Access_Modifier(double radius) {
        this.radius = radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    public String getArea() {
        return this.color;
    }


}
