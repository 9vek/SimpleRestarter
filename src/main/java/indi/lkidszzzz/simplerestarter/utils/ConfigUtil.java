package indi.lkidszzzz.simplerestarter.utils;

import org.bukkit.configuration.ConfigurationSection;

public class ConfigUtil {
    public static String configGetter() {
        String h = "Settings.Time.Hour";
        String m = "Settings.Time.Minute";
        String s = "Settings.Time.Second";
        int hour, minute, second;
        if (getConfig().contains(h)) {
            hour = getConfig().getInt(h);
        } else {
            hour = 4;
        }
    }
}
