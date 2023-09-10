package ss7_interface_colorable;

public  abstract class Shape   {
    private  String color ="red";
    public boolean flag = true;

    public Shape(){

    }
    public Shape(String color, boolean flag){
        this.color = color;
        this.flag = flag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", flag=" + flag +
                '}';
    }

}
