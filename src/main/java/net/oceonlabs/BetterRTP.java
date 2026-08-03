package net.oceonlabs;

import net.oceonlabs.commands.RTPCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class BetterRTP extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("rtp").setExecutor(new RTPCommand(this));
        getLogger().info("BetterRTP enabled!");
    }
}
