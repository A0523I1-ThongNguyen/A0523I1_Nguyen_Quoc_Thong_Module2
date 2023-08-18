import java.util.Scanner;

public class thu {
    public static void main(String[] args) {


    String[] player = {"Messi","BecKham","Alba","Rice","Giroud"};
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name player football");
        String  name_player = scanner.nextLine();
        boolean flag = false;
        do {
            for (int i = 0; i < player.length; i++) {
                if (player[i].equals(name_player)) {
                    System.out.println("Vi tri cau thu " + name_player + " o vi tri thu " + (i + 1));
                    flag = true;
                    break;
                }
            }
        }while (flag==true);//lap lien tuc
        if (!flag){
            System.out.println("KHong co "+name_player +" trong danh sach");
        }
}
}
