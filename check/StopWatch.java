

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime, endTime;

    public StopWatch () {
        startTime = LocalTime.now();
        endTime = LocalTime.now();
    }

    public StopWatch (LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = startTime;
    }
    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        int miliSecond = ((getEndTime().getHour()-getStartTime().getHour())*3600 + (getEndTime().getMinute()-getStartTime().getMinute())*60 + (getEndTime().getSecond()-getStartTime().getSecond())*10000000);
        return miliSecond;
    }
}
