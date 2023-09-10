import java.util.Objects;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day,int month,int year){
        if (day >=1 && day <=31){
            this.day =day;
        }else {
            this.day = 0;
        }if (month >=1 && month <=12){
            this.month = month;
        }else {
            this.month = 0;
        }if (year >=1){
            this.year = year;
        }else {
            this.year = 0;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >=1 && day <=31){
            this.day =day;
        }else {
            this.month = 0;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >=1 && month <=12){
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1) {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
