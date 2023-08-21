package test;

public class Car {
    private final static int BANH_XE = 4;
    private boolean status = true; // xang + key
    private String phanKhuc = "";
    private String mauSac = "";
    private double giaXe = 0;
    private double giaXe1 = 0;
    private double giaXe2 = 0;
    private double giaXe3 = 0;



    public Car(boolean status, String phanKhuc, String mauSac, double giaXe) {
        this.status = status;
        this.phanKhuc = phanKhuc;
        this.mauSac = mauSac;
        this.giaXe = giaXe;

    }
public Car(){

}
    // constructor 1 tham so check xang
    public Car(boolean status) {
        this.status = status;
    }

    public void run() {
        if (status) {
            System.out.println("Đã sẵn sàng chạy ");
        } else {
            System.out.println("Hết xăng or QUÊN CHÌA KHÓA RỒI~~");
        }
    }

    @Override
    public String toString() {
        if (status) {
            run();
            return "Car{" +
                    " status=" + status +
                    ", phanKhuc='" + phanKhuc + '\'' +
                    ", mauSac='" + mauSac + '\'' +
                    ", giaXe=" + giaXe +
                    '}';
        } else {
            run();
            return "Car{" +
                    "status=" + status +
                    ", phanKhuc='" + phanKhuc + '\'' +
                    ", mauSac='" + mauSac + '\'' +
                    ", giaXe=" + giaXe +
                    '}';
        }
    }




}

