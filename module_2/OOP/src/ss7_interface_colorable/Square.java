package ss7_interface_colorable;

public class Square extends Shape implements Colorable {
    double edge =4;


    public Square() {

    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(double edge, String color, boolean flag) {
        super(color, flag);
        this.edge = edge;
    }


    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return edge * edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}' + super.toString(); // son mau shape
    }

    @Override

    public void howToColor() {
        System.out.println("Color all four sides...");
    }

}
