package ss4_class_object_quadraticEquation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    private double delta, Root1, Root2;

    public double getDiscriminant() {
        return delta = (b * b) - (4 * a * c);
    }
    public double getRoot1() {
        return Root1 = (((-1) * b) + (Math.sqrt(delta))) / (2 * a);
    }
    public double getRoot2(){
        return Root2 = (((-1) * b) - (Math.sqrt(delta))) / (2 * a);
    }
}

