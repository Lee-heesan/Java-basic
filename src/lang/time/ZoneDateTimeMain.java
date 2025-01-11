package lang.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowzdt = ZonedDateTime.now();
        System.out.println("nowzdt = " + nowzdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        ZonedDateTime utczdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utczdt = " + utczdt);
    }
}
