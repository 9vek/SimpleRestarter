package indi.lkidszzzz.simplerestarter.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    //获取当前时间
    public static String getNowTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(new Date());
    }

    //test
    public static void main(String[] args) {
        System.out.println(getNowTime());
    }
}
