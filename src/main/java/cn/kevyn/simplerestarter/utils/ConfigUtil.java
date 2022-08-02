package cn.kevyn.simplerestarter.utils;

import org.bukkit.configuration.ConfigurationSection;

import cn.kevyn.simplerestarter.SimpleRestarter;

public class ConfigUtil {

    public static String configGetter() {
        String h = "Settings.Time.Hour";
        String m = "Settings.Time.Minute";
        String s = "Settings.Time.Second";
        int hour, minute, second;
        if (SimpleRestarter.INSTANCE.getConfig().contains(h)) {
            hour = SimpleRestarter.INSTANCE.getConfig().getInt(h);
        } else {
            hour = 4;
        }
        return "";
    }
}
