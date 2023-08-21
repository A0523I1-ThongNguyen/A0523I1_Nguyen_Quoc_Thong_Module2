public class Main {
    public static void main(String[] args) {
        Quat quat1 = new Quat();
        quat1.setSpeed(Quat.FAST);
        quat1.setRadius(10);
        quat1.setColor("yellow");
        quat1.setOn(true);
        System.out.println(quat1);

        Quat quat2 = new Quat();
        quat2.setSpeed(Quat.MEDIUM);
        quat2.setRadius(5);
        quat2.setColor("blue");
        quat2.setOn(false);
        System.out.println(quat2);
    }
}

class Quat {
        public static final int SLOW=1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Quat(){

    }

    @Override
    public String toString() {
        if (isOn()) {
            return "quat{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else{
            return "quat{" +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

    }
}