package Listener;

import me.confuser.barapi.BarAPI;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class onJoin implements Listener{

    @EventHandler
    public void Join(PlayerJoinEvent event){
        Player p = event.getPlayer();
        BarHandler(p);
    }

    public void BarHandler(Player p){
        BarAPI.setMessage(p, ChatColor.GREEN + "Selamat Datang Di Kakatoa Games Minecraft Server", 10);
    }
}
