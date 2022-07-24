package indi.lkidszzzz.simplerestarter;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class SRListener implements Listener {
    public void onPlayerJoin(PlayerJoinEvent e) {

        e.getPlayer().sendMessage("请注意，本服务器将于 " + " 自动重启。");
    }
}
