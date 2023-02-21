package learn.basic.DateTime.Instant;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {

        Instant currentTimestamp = Instant.now();
        System.out.println("Timestamp saat ini: " + currentTimestamp);
    }
}
