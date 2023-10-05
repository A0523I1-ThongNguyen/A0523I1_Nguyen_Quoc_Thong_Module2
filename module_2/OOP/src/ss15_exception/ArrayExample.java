package ss15_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayExample obj = new ArrayExample();
        int[] arrayMain = obj.methodRandom();
        System.out.println("\n Nhap chi so muon tra ve");
       try {
           Integer vitri =Integer.parseInt(scanner.nextLine());
           System.out.println("Vi tri: " + vitri + " Co gia tri : " +arrayMain[vitri]);
       }catch (NumberFormatException e){
           System.out.println("Chi nhap so");
           System.out.println("Mac dinh lay vi tri 0 : "+arrayMain[0]);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Chi so vuot ra ngoai gioi han mang");
           System.out.println("mac dinh lay vi tri cuoi cung: " + arrayMain[arrayMain.length-1]);
       }catch (Exception e){

       }finally {
           System.out.println("The End Programming");
       }
    }

    public int[] methodRandom(){
        Random random = new Random();
        int[] arrayRandom = new int[100];
        System.out.println("List Random: ");
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(300);
            System.out.print(arrayRandom[i] + "-");
        }
        return arrayRandom;
    }

}
