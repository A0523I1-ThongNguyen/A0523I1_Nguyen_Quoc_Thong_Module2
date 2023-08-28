package test_interface_abtract;

public class Innova extends Style_Car implements Speed_Up {
    private double dongCo = 2.0;
    private String style = "MVP";


    public Innova() {

    }

    public Innova(double v, double s, double time) {
        super(v, s, time);

    }

    @Override
    public boolean isSedan() {
        return this.sedan = false;
    }

    public double getDongCo() {
        return dongCo;
    }

    public void setDongCo(double dongCo) {
        this.dongCo = dongCo;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double tinhQuongDuong() {
        return this.s = v * time;
    }

    public double tinhThoiGian() {
        return time = s / v;
    }

    @Override
    public double runGo() {
        return dongCo * 4;
    }

    @Override
    public void speedUp(double tangToc) {
        System.out.println("Bạn đang chạy với vận tốc " + v + "km/h" + " | Bạn sẽ đi trong " + time + " giờ ");
        System.out.println("Quãng đường bạn sẽ đi đến là: " + tinhQuongDuong() + " km");
        System.out.println("Khi bạn tăng tốc lên " + tangToc + " lần thì vận tốc là : " + v * tangToc + " km/h");
        System.out.println("Sau khi tăng tốc lên " + tangToc + " lần thì bạn sẽ đến nơi sau: " + tinhThoiGian() / tangToc + " giờ");

    }


    @Override
    public String toString() {
        return "Innova{" +
                "dongCo=" + dongCo +
                ", style='" + style + '\'' +
                ", sedan=" + sedan +
                '}';
    }
}
