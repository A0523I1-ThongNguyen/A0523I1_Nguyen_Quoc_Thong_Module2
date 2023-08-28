package ss7_abtract_class_interface;

public class Square extends Area implements IResizeable {
    private double edge;

    public Square() {

    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    @Override
    public double getArea() {
        return edge * edge;
    }


    @Override //interface
    public void resize(double percent) {
        System.out.println("Dien tich hinh vuong khi tang len " + percent );
        System.out.println((edge*edge)*percent);
        System.out.println("--------------------------------");
    }
}
