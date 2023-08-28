package ss6_ke_thua_2d_3d;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //ep ngam dinh
        Point2D pMain = new Point3D(7,8,9);
        System.out.println(pMain.toString());
        pMain.show(); // goi method cha nhung chay thi goi method con
        System.out.println(Arrays.toString(pMain.getXY()));

        Point2D p2d = new Point2D();
        Point3D p2 = new Point3D();
        System.out.println(p2d instanceof  Point3D); //false> cha k thuoc con
        System.out.println(pMain instanceof Point3D); // true > da ep con vao cha
        System.out.println(p2 instanceof Point3D); // true > chinh no

        p2.setX(2);
        p2.setY(4);
        System.out.println(p2.getY());



    }
}
