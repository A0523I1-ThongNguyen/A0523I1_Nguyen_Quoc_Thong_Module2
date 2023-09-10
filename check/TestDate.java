public class TestDate {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(33,22,2020);
        MyDate md2 = new MyDate(8,5,1998);
        MyDate md3 = new MyDate(8,5,1998);

        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);

        System.out.println(md1.equals(md2));
        System.out.println(md2.equals(md3));
        System.out.println(md1.hashCode());
        System.out.println(md2.hashCode());
        System.out.println(md3.hashCode());
    }
}
