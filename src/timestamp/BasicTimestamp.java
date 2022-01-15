package timestamp;

import timestamp.CallOne.*;
import timestamp.CallTwo.*;

public class BasicTimestamp {

    static CallOne callOne = new CallOne();

    public static void main(String[] args) {

        for (int x = 0; x < 10; x++) {
            callOne.callOne();
            CallTwo.callTwo();
        }

    }
}
