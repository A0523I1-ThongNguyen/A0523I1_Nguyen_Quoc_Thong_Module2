package test_thua_ke;

public class Elantra extends Avante{
    private double nsx;
    private double nsxEnd;

    public Elantra(){

    }
    public Elantra(double dongCo, double dungTich,double nsx, double nsxEnd ){
        super(dongCo,dungTich);
    }

    public double getNsx() {
        return nsx;
    }

    public void setNsx(double nsx) {
        this.nsx = nsx;
    }

    public double getNsxEnd() {
        return nsxEnd;
    }

    public void setNsxEnd(double nsxEnd) {
        this.nsxEnd = nsxEnd;
    }

    public void setDD(float dongCo, float dungTich){
        this.dongCo = dongCo;
        this.dungTich = dungTich;
    }
    public double[] getDD(){
        double arrayDD[] = new double[2];
        arrayDD[1] = this.dongCo;
        arrayDD[2] = this.dungTich;
        return arrayDD;
    }
}
