package lang.time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
//            System.out.println("availableZoneId = " + availableZoneId);
//            ZoneId zoneId = ZoneId.of("Asia/Seoul");
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("zoneId   = " + zoneId + " | " +zoneId.getRules() );
        }
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);

    }
}
