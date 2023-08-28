package ss7_abtract_class_interface;

public class Main {
    public static void main(String[] args) {
//        IResizeable[] test = new IResizeable[3];
//        test[0] = new Circle();

        Circle circle = new Circle();
        circle.setRadius(10);
        circle.resize(3.5);

        Square square = new Square();
        square.setEdge(4);
        square.resize(7);

        Rectangle rectangle = new Rectangle(4,2); // gan this.cd this.cr ben constructor
        rectangle.setCr(10);
        rectangle.setCd(5);
        rectangle.resize(2);

//        circle.setRadius(2);
//        System.out.println(circle.getArea());


    }
}
