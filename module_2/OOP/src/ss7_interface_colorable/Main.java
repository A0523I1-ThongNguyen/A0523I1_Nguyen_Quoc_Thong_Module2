package ss7_interface_colorable;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Rectangle();
        shapes[1] = new Circle();
        shapes[2] = new Square();

        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                System.out.println(((Rectangle)s).isFlag());// lop cha ep sang rec de goi flag
                System.out.println("Dien tich hinh chu nhat la : "+((Rectangle) s).getArea());
                ((Rectangle)s).howToColor();

            } else if (s instanceof Circle) {
                System.out.println("Dien tich hinh tron la : "+((Circle)s).getArea());
            } else if (s instanceof Square) {
                System.out.println(((Square)s).isFlag());
                System.out.println("Dien tich hinh vuong la : "+((Square)s).getArea());
                ((Square)s).howToColor();
            }
        else {
                System.out.println("Khong co hinh");
            }
        }
    }
}
