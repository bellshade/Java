package learn.basic.DateTime.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {

        ZoneId timeZone = ZoneId.of("Asia/Jakarta");
        ZonedDateTime currentDateTimeWithZone = ZonedDateTime.now(timeZone);
        System.out.println("Waktu saat ini di Jakarta: " + currentDateTimeWithZone);

    }
}
