package test_interface_abtract;

public class City extends Style_Car{


    public void run(){
        System.out.println("City chay");
    }

    @Override
    public double tinhQuongDuong() {
        return 0;
    }

    @Override
    public double tinhThoiGian() {
        return 0;
    }

    @Override
    public double runGo() {
        return 0;
    }
}
