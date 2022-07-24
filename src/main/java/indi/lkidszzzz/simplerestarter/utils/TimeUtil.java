package indi.lkidszzzz.simplerestarter.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class TimeUtil {
    public static LocalDateTime getNowLdt() {
        return LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
    }

    public static String ldtPrinter() {
        return getNowLdt().getMonth() + " " + getNowLdt().getDayOfMonth()+ " " + getNowLdt().getYear()+ " at " + getNowLdt().getHour() + ":" + getNowLdt().getMinute();
    }
}
