package ss4_class_object_stopwatch;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch() {
        startTime = 0;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }



    public void stop() {
        endTime = System.currentTimeMillis();
    }
//    public double getStartTime() {
//        return startTime;
//    }
// why not
//    public double getEndTime() {
//        return endTime;
//    }

    public double getElapsedTime() {
        double elapsed;
        elapsed = endTime - startTime;
        return elapsed;
    }

//    public double getStartTime() {
//        return startTime;
//    }
//
//    public long getEndTime() {
//        return endTime;
//    }
}
