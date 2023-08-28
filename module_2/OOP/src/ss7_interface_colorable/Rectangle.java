package ss7_interface_colorable;

public class Rectangle extends Shape implements  Colorable{
    private double cd = 10;
    private double cr = 5;

    public Rectangle(){

    }

    @Override
    public boolean isFlag() {
        return flag = false;
    }

    public Rectangle(String color, boolean flag, double cd, double cr){
        super(color,flag);
        this.cd = cd;
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public double getArea(){
        return cd*cr;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "cd=" + cd +
                ", cr=" + cr +
                '}' +super.toString();
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides..");
    }
}
