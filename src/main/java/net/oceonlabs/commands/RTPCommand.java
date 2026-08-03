package net.oceonlabs.commands;

import net.oceonlabs.BetterRTP;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class RTPCommand implements CommandExecutor {
    private final BetterRTP plugin;
    private final Random random = new Random();

    public RTPCommand(BetterRTP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by a player.");
            return true;
        }

        Player player = (Player) sender;
        World world = player.getWorld();

        int radius = 5000;
        int x = random.nextInt() * (radius * 2) - radius;
        int z = random.nextInt() * (radius * 2) - radius;
        int y = world.getHighestBlockYAt(x, z) + 1;

        Location destination = new Location(world, x + 0.5, y, z + 0.5);
        player.teleport(destination);
        player.sendMessage("Teleported to a random location: " + destination.getBlockX());
        return true;

    }
}
