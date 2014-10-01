package Listener;

import me.confuser.barapi.BarAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onLeave implements Listener{

    public void Quit(PlayerQuitEvent event){
        Player p = event.getPlayer();
        if (BarAPI.hasBar(p)){
            BarAPI.removeBar(p);
        }
    }
}
