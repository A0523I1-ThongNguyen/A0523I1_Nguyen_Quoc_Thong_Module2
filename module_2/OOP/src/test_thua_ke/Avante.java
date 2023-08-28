package test_thua_ke;

import ss6_ke_thua_2d_3d.Point2D;

public class Avante {
    protected double dongCo = 2.0 ;
    protected double dungTich = 10.2;
    private String design = "Manh me" ;

    public Avante(){
    }
    public Avante(double dongCo , double dungTich){

    }

    public double getDongCo() {
        return dongCo;
    }

    public void setDongCo(double dongCo) {
        this.dongCo = dongCo;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }



    public void setDD(double dongCo,double dungTich){
        this.dongCo = dongCo;
        this.dungTich = dungTich;
    }

    public double[] getDD(){
        double array[] = {dongCo,dungTich};
        return array;

    }

    @Override
    public String toString() {
        return "Avante{" +
                "dongCo=" + dongCo +
                ", dungTich=" + dungTich +
                ", design='" + design + '\'' +
                '}';
    }
}
