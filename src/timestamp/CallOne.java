package timestamp;

import java.time.LocalTime;

public class CallOne {

    public  static void callOne() {
        LocalTime callOne;
        callOne = LocalTime.now();
        System.setProperty("requestTime", callOne.toString());
        System.out.println("Request:  " +callOne);
    }
}
