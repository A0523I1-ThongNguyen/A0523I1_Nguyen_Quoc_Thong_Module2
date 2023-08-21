package ss4_class_object_fan;


import org.w3c.dom.ls.LSOutput;

public class Fan {
    public String name = "";
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;


    private int speed = SLOW;
    private boolean on = false;

    private double radiusFan = 5;
    private String color = "blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on;
    }

    public void setRadiusFan(double radiusFan) {
        this.radiusFan = radiusFan;
    }

    public double getRadiusFan() {
        return radiusFan;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public Fan(String name, int speed, boolean on, double radiusFan, String color) {
        this.speed = speed;
        this.on = on;
        this.radiusFan = radiusFan;
        this.color = color;
        this.name = name;
    }


    @Override
    public String toString() {
        if (this.on) {
            return "Fan{" +"Fan if ON" + ", Status: " + on +
                    ", Name Fan: " + name +
                    ", Speed: " + speed +
                    ", radiusFan=" + this.radiusFan +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan{"+"Fan is OFF" + ", Name Fan: " +name+
                    ", radiusFan=" + this.radiusFan +
                    ", color='" + color + '\'' +
                    '}';
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "Quat o nha "+ name ;
    }

    public Fan(boolean on) {
        this.on = on;

    }

    public Fan() {

    }

    public void checkOnOff() {
        if (on) {
            System.out.println("Fan Is ON");
            System.out.println(speed = 100);
            System.out.println(radiusFan = 2.5);
            System.out.println(color = "Green");

        } else {
            System.out.println("Fan is OFF");
            System.out.println(radiusFan = 3.3);
            System.out.println(color = "Orange");
        }
    }

}


