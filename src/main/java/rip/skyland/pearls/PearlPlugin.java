package rip.skyland.pearls;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import rip.skyland.pearls.listener.EnderpearlListener;

public class PearlPlugin extends JavaPlugin {

    @Getter
    private static PearlPlugin instance;

    public void onEnable() {
        instance = this;

        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new EnderpearlListener(), this);
    }

}
