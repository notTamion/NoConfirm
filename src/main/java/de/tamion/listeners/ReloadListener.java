package de.tamion.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.server.ServerCommandEvent;

public class ReloadListener implements Listener {
    @EventHandler
    public void onConsole(ServerCommandEvent e) {
        if(e.getCommand().split(" ")[0].equalsIgnoreCase("rl") || e.getCommand().split(" ")[0].equalsIgnoreCase("reload")) {
            e.setCommand("rl confirm");
        }
    }
    @EventHandler
    public void onMessage(PlayerCommandPreprocessEvent e) {
        if (e.getMessage().split(" ")[0].equalsIgnoreCase("/rl") || e.getMessage().split(" ")[0].equalsIgnoreCase("/reload")) {
            e.setCancelled(true);
            e.getPlayer().performCommand("rl confirm");
        }
    }
}
