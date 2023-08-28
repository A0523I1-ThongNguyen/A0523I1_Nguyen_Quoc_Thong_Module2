package test_interface_abtract;

public class Main {
    public static void main(String[] args) {
        Innova innova = new Innova(5,10,14);
        innova.speedUp(5);

        System.out.println(innova.runGo());
        System.out.println(innova);

        Accent accent = new Accent(100,10,4);
        accent.speedUp(10);

        Style_Car[] styleCars = new Style_Car[3];
        styleCars[0] =  new Innova();
        styleCars[1]  = new Accent();


        City city = new City();

        for (Style_Car car : styleCars) {
            if (car instanceof Innova){
                System.out.println(((Innova)car).isSedan());
                System.out.println(((Innova)car).runGo());
            } else if (car instanceof  Accent) {
                System.out.println(((Accent)car).isSedan());
                System.out.println(((Accent)car).runGo());
            } else if (car instanceof City) {
                ((City)car).run();
            }
        }

    }
}
