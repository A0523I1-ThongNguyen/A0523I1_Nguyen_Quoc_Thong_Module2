package ss6_ke_thua_circle_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle hinhTron = new Circle(5, "Brown");
        System.out.println(hinhTron);

        Cylinder hinhTru = new Cylinder(3, "vang", +5);
        System.out.println(hinhTru);
        //        hinhTron.setRadius(5); k the set radius lop cha sang lop con
//        System.out.println(hinhTron.getRadius());
    }
}
