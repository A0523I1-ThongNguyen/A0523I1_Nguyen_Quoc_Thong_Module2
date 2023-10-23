package case_study.model;

import java.util.Comparator;

public class DayComparator implements Comparator<Booking> {


    @Override
    public int compare(Booking obj1, Booking obj2) {
        if (obj1.getStart().compareTo(obj2.getStart()) > 0){
            return 1;
        }else if (obj1.getStart() == obj2.getStart()){
            return 0;
        }else {
            return -1;
        }
    }
}


