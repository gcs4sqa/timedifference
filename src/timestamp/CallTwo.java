package timestamp;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CallTwo {

    static CallOne callOne = new CallOne();
    public static void callTwo() {
        LocalTime callTwo = LocalTime.now();
        System.out.println("Response: " +callTwo);
        LocalTime diff =  LocalTime.parse(System.getProperty("requestTime"));
        String timeBetween = Long.toString(ChronoUnit.NANOS.between(diff, callTwo));

        System.out.println("Duration: "+timeBetween.substring(0,3)+"ns");

    }
}
