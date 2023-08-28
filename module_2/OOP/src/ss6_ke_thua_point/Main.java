package ss6_ke_thua_point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MoveablePoint demo = new MoveablePoint();
        demo.setXYSpeed(2, 4);
        System.out.println(Arrays.toString(demo.getXYSpeed()));
        demo.move();
        System.out.println(Arrays.toString(demo.getXY())); // goi lop cha lai hieu xspeed , yspeed tu lop con


    }
}
