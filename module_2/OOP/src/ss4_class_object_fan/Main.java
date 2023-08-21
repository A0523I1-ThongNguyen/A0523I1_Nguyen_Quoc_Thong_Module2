package ss4_class_object_fan;

public class Main {
    public static void main(String[] args) {
        Fan senko = new Fan("Senko", 3, true, 3, "Red");

        System.out.println(senko.toString());
        Fan vinta = new Fan("Vinta0", 2, false,1,"Blue");
        System.out.println(vinta);
//        senko.setName("POLO");
//        System.out.println(senko.getName());
//        Fan senko2 = new Fan("Senko", 3, true, 10, "Do");
//        senko2.checkOnOff();
//
//        System.out.println("---------------------------------------");
//
//       Fan vinta = new Fan("Vinta",1,true,1,"black");
//        System.out.println(vinta.toString());
//        vinta.checkOnOff();
//
//        Fan asia = new Fan(false);
//
//        asia.checkOnOff();
    }

}
