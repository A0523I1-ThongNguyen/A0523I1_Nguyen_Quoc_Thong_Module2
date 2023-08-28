package ss6_ke_thua_2d_3d;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;



    public Point2D(){

    }

    public  Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = new float[5];
        array[0] = getX();
        array[1] = getY();
        array[2] = getY();
        array[3] = getX();
        array[4] = getY();
        return array;
    }
public void show(){
    System.out.println("lop cha");
}
    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
