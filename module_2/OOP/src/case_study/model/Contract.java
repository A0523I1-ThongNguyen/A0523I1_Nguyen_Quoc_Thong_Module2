package case_study.model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contract implements Comparable<Contract> {
    // số hợp đồng, mã booking, số tiền cọc trước, tổng số tiền thanh toán.
    private String idHopDong;
    private String maBooking;
    private double tienCoc;
    private double sumMoney;
    private String idCustomer;
    private String startDayBooking;
    private String startEndBooking;
    private String idService;


    public Contract(String idHopDong, String idCustomer, String startDayBooking, String startEndBooking, String idService, double sumMoney) {
        this.idHopDong = idHopDong;
        this.idCustomer = idCustomer;
        this.startDayBooking = startDayBooking;
        this.startEndBooking = startEndBooking;
        this.idService = idService;
        this.sumMoney = sumMoney;
    }

    public Contract(String idHopDong, String maBooking, double tienCoc, double sumMoney) {
        this.idHopDong = idHopDong;
        this.maBooking = maBooking;
        this.tienCoc = tienCoc;
        this.sumMoney = sumMoney;
    }

    public Contract() {

    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public String getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(String idHopDong) {
        this.idHopDong = idHopDong;
    }

    public String getStartDayBooking() {
        return startDayBooking;
    }

    public void setStartDayBooking(String startDayBooking) {
        this.startDayBooking = startDayBooking;
    }

    public String getStartEndBooking() {
        return startEndBooking;
    }

    public void setStartEndBooking(String startEndBooking) {
        this.startEndBooking = startEndBooking;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(double sumMoney) {
        this.sumMoney = sumMoney;
    }


    @Override
    public String toString() {
        return "Contract{" +
                "idHopDong='" + idHopDong + '\'' +
                ", maBooking='" + maBooking + '\'' +
                ", tienCoc=" + tienCoc +
                ", sumMoney=" + sumMoney +
                '}';
    }

    @Override
    public int compareTo(Contract o) {
        return this.getStartDayBooking().compareTo(getStartDayBooking());
    }
}

