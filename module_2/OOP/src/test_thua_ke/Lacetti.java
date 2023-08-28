package test_thua_ke;

public class Lacetti extends Avante {

   private double dongCo = 2.0 ;
    private String design = "Manh me" ;
    public Lacetti(){

    }

    public void setDongCo(double dongCo) {
        this.dongCo = dongCo;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public double getDongCo() {
        return dongCo;
    }

    public String getDesign() {
        return design;
    }

    public Lacetti(double dongCo, String design) {
        this.dongCo = dongCo;
        this.design = design;
    }

    @Override
    public String toString() {
        return "lacetti{" +
                "dongCo=" + dongCo +
                ", design='" + design + '\'' +
                '}'+ "hahahahah";
    }

    public static void main(String[] args) {
        Lacetti lacetti = new Lacetti(2.0,"Strong");
        System.out.println(lacetti);
        lacetti.setDongCo(1.8);
        lacetti.setDesign("Cool");
        System.out.println(lacetti.toString());
        System.out.println(lacetti.getDongCo());
        System.out.println(lacetti.getDesign());

        Cruze[] cruze = new Cruze[10];
        Lacetti[] deawoo = new Lacetti[10];




    }
}
