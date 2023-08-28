package ss6_ke_thua_2d_3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float Z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = {super.getX(), super.getY(), z};
        return array;
    }

  public   void show(){
      System.out.println("Lop con");
    }
    @Override
    public String toString() {
        return "Point3D{" +" " + super.toString()+
                "bonus of Point 3D : z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point3D();
        Point3D p3 = new Point3D();
        p1.show();
        p2.show();
        p3.show();
    }
}
