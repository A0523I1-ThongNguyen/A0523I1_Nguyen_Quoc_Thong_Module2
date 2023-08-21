package test;

import ss5_access_modifier.Access_Modifier;

public class Main {
    public static void main(String[] args) {
        Car vios = new Car(true, "B", "Den", 580);
        System.out.println(vios);

        Car xpander = new Car(false,"C","Do",0);
        xpander.run();
        System.out.println(xpander);

        Access_Modifier hi = new Access_Modifier();


//        Car accent = new Car(false);
//        accent.testXang();
    }
}
