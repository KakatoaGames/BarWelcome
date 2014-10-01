package Main;

import Listener.onLeave;
import Listener.onJoin;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class BarWelcome extends JavaPlugin implements Listener{
    private static Plugin plugin;

    public void onEnable(){
        registerEvents(this, new onJoin(), new onLeave());
        plugin = this;
    }


    public void onDisable(){

    }

    public static Plugin getPlugin() {
        return plugin;
    }

    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }
}
