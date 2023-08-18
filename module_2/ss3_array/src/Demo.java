import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int nMain = 5;
        test2(nMain);
        System.out.println("Sau khi goi method: "+nMain);
        int [] array = {10,20};
        test(array);
        System.out.println("sau khi goi method : "+Arrays.toString(array));

    }

    public static void test(int[] arr){
        arr[0] = 55;
        System.out.println("Trong method : "+ Arrays.toString(arr));
    }
    public static void test2(int n){
        n++;
        System.out.println("n trong method: " +n);
    }
}
