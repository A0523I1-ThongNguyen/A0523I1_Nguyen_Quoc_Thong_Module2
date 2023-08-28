package test;

import ss5_access_modifier.AccessModifier;

public class Main {
    public static void main(String[] args) {
        Car vios = new Car(true, "B", "Den", 580);
        System.out.println(vios);

        Car xpander = new Car(false,"C","Do",0);
        xpander.run();
        System.out.println(xpander);

        AccessModifier hi = new AccessModifier();


//        Car accent = new Car(false);
//        accent.testXang();
    }
}
