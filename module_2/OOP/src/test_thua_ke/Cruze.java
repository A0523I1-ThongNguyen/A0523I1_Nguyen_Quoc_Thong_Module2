package test_thua_ke;

import java.sql.SQLOutput;

public class Cruze extends Avante{
        private int nsx;
        private double giaBan;

    public int getNsx() {
        return nsx;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setNsx(int nsx) {
        this.nsx = nsx;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

public Cruze(int nxs, double giaBan){
        this.nsx = nxs;
        this.giaBan = giaBan;
}
    public Cruze(double dongCo, String design, int nsx, double giaBan){

            this.nsx = nsx;
            this.giaBan = giaBan;
        }
        public Cruze(){

        }

    @Override
    public String toString() {
        return  super.toString()+ "Cruze{" +
                "nsx=" + nsx +
                ", giaBan=" + giaBan  +
                '}';
    }

    public static void main(String[] args) {
        Cruze cruze = new Cruze(2010,199);// gan tham chieu constructor
        cruze.setNsx(2015); // set
        cruze.setGiaBan(260);
        System.out.println(cruze.getNsx()); //get cai da set

        System.out.println(cruze.toString());
        }
}
