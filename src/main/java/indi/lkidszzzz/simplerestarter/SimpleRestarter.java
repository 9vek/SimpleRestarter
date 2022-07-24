package indi.lkidszzzz.simplerestarter;

import indi.lkidszzzz.simplerestarter.utils.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleRestarter extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        String enable = TimeUtil.ldtPrinter();
        Bukkit.getConsoleSender().sendMessage("§f<§6SimpleRestarter§f>§b插件于§d " + enable + " §b成功启动！");
        Bukkit.getConsoleSender().sendMessage("§f<§6SimpleRestarter§f>§4警告：如果服务器管理员没有配置/未正确配置\"spigot.yml\"中的重启配置, 服务器将只会停止运行！");
    }

    @Override
    public void onDisable() {
        String disable = TimeUtil.ldtPrinter();
        Bukkit.getConsoleSender().sendMessage("§f<§gSimpleRestarter§f>§b插件于§d " + disable + " §b关闭了。");
    }
}
