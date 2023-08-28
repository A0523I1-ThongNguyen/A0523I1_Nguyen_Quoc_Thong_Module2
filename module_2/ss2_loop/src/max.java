public class max {
    public static void main(String[] args) {


        int a = 3;
        int b = 4;
        int c = 6;
        int d = 8;
        int max = a;

        if (b > max) {
            System.out.println("so lon nhat la " + max);
        } else if (c > max && c > b) {
            System.out.println("so lon nhat la " + max);
        } else if (d > max && d > b && d > c) {
            System.out.println("max la " + d);
        }else {
            System.out.println("so lon nhat la " + a);
        }
    }
}
