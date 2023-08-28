package test_thua_ke;

public class Main {
    public static void main(String[] args) {
        Avante avante = new Avante();
        avante.setDD(2, 3);
        System.out.println(avante.getDD());


        Avante[] xe1 = new Avante[5];
        Elantra[] xe2 = new Elantra[5];
        xe1[0] = new Elantra();
        xe1[1] = new Cruze();
        xe1[2] = new Lacetti();
        for (Avante avt : xe1) {
            System.out.println(avt);
        }


    }
}

