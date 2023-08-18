import java.util.Scanner;

public class Character_In_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = "Day la mot chuoi tuy y nhap";

        System.out.println("Nhap 1 character de check");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        int vitri = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (character==chuoi.charAt(i)){
                count++;
                vitri = i;
                System.out.println(character + " o vi tri " +vitri );
            }
        }
        System.out.println(character + " xuat hien "+ count + " lan trong chuoi : "+ chuoi);
    }
}

