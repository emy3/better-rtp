package net.oceonlabs;

import org.bukkit.plugin.java.JavaPlugin;

public class RTPPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("RTPPlugin has been enabled!");
        // Register commands and events here
    }

    @Override
    public void onDisable() {
        getLogger().info("RTPPlugin has been disabled!");
        // Clean up resources here
    }
}
