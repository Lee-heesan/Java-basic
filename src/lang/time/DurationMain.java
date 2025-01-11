package lang.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1,0);
        System.out.println("lt = " + lt);

        LocalTime plusTime = lt.plus(duration);
        System.out.println("plusTime = " + plusTime);

        LocalTime startTime = LocalTime.of(9,0);
        LocalTime endTime = LocalTime.of(10,0);
        Duration between = Duration.between(startTime,endTime);
        System.out.println("between.getSeconds() = " + between.getSeconds() + "초 " );
    }
}
