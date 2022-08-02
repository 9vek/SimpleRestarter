package cn.kevyn.simplerestarter;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class SimpleRestarter extends JavaPlugin {

    public static SimpleRestarter INSTANCE;
    private int noticeTimes = 3;
    private int noticeInterval = 200;
    private int restartInterval = 2000;
    private BukkitScheduler scheduler = getServer().getScheduler();
    public final String ENABLE = "[SimpleRestarter]" + ChatColor.BLUE + " plugin is now enabled！";
    public final String DISABLE = "[SimpleRestarter]" + ChatColor.RED + " plugin is now disabled！";
    public final String RELOAD = "[SimpleRestarter]" + ChatColor.GREEN + " config is now successfully reloaded！";

    private Runnable noticeAction = new Runnable() {

        @Override
        public void run() {
            getServer().broadcastMessage("[SimpleRestarter]" + ChatColor.YELLOW + " server is going to be restarted");
            if (noticeTimes > 0) {
                noticeTimes --;
                scheduler.scheduleSyncDelayedTask(SimpleRestarter.INSTANCE, noticeAction, noticeInterval);
            }
            else {
                getServer().spigot().restart();
            }
        }

    };

    public SimpleRestarter() {
        SimpleRestarter.INSTANCE = this;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        saveDefaultConfig();
        scheduler.scheduleSyncDelayedTask(this, noticeAction, restartInterval);
        this.getServer().getConsoleSender().sendMessage(ENABLE);
    }

    @Override
    public void onDisable() {
        super.onDisable();

        this.getServer().getConsoleSender().sendMessage(ENABLE);
    }
}
