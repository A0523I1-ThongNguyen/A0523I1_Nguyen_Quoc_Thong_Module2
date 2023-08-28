package test_interface_abtract;

public abstract class Style_Car {
    public boolean sedan = true;
    public double s ;
    public double v;
    public double time;
    public abstract double tinhQuongDuong();
    public abstract double tinhThoiGian();

    public abstract double runGo();
    public Style_Car(){

    }

    public boolean isSedan() {
        return sedan;
    }

    public Style_Car(double v, double s, double time ){
        this.v = v;
        this.s = s;
        this.time = time;

    }


    @Override
    public String toString() {
        return "Style_Car{" +
                "sedan=" + sedan +
                '}';
    }
}
