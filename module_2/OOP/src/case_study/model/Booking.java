package case_study.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.ServiceLoader;

public class Booking implements Comparable<Booking> {//mã booking, ngày booking, ngày bắt đầu thuê, ngày kết thúc thuê, mã khách hàng, mã dịch vụ.
    private String idBooking;
    private LocalDate dayBooking;
    private LocalDate timeStart;
    private LocalDate timeEnd;
    private String idCustomer;
    private String idService;

    public Booking(String idBooking, LocalDate dayBooking, LocalDate start, LocalDate end, String idCustomer, String idService) {
        this.idBooking = idBooking;
        this.dayBooking = dayBooking;
        this.timeStart = start;
        this.timeEnd = end;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public Booking() {

    }



    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(LocalDate dayBooking) {
        this.dayBooking = dayBooking;
    }

    public LocalDate getStart() {
        return timeStart;
    }

    public void setStart(LocalDate start) {
        this.timeStart = start;
    }

    public LocalDate getEnd() {
        return timeEnd;
    }

    public void setEnd(LocalDate end) {
        this.timeEnd = end;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Booking booking = (Booking) o;
//        return Objects.equals(idBooking, booking.idBooking) ;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(idBooking);
//    }

    @Override
    public int compareTo(Booking o) {
        int result = this.timeStart.compareTo(o.timeStart);
        if (result == 0) {
            result = this.timeEnd.compareTo(o.timeEnd);
             if (result == 0) {
                result = this.idBooking.compareTo(o.idBooking);
            }
        }
        return result;
    }
    public int compareTo2(Booking o) {
        int result = this.timeStart.compareTo(o.timeStart);
        if (result == 0) {
            result = this.timeEnd.compareTo(o.timeEnd);
            if (result == 0) {
                result = this.idBooking.compareTo(o.idBooking);
            }
        }
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return idBooking.equals(booking.idBooking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBooking);
    }

    @Override
    public String toString() {
        //        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dayBooking=" + dayBooking +
                ", timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                ", idCustomer='" + idCustomer + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }
}

