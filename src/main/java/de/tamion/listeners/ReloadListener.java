package de.tamion.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.event.server.ServerCommandEvent;

public class ReloadListener implements Listener {
    @EventHandler
    public void onConsole(ServerCommandEvent e) {
        if(e.getCommand().split(" ")[0].equalsIgnoreCase("rl") || e.getCommand().split(" ")[0].equalsIgnoreCase("reload")) {
            e.setCancelled(true);
            Bukkit.reload();
            e.getSender().sendMessage("Reloaded Server");
        }
    }
    @EventHandler
    public void onMessage(PlayerCommandPreprocessEvent e) {
        if (e.getMessage().split(" ")[0].equalsIgnoreCase("/rl") || e.getMessage().split(" ")[0].equalsIgnoreCase("/reload")) {
            e.setCancelled(true);
            Bukkit.reload();
            e.getPlayer().sendMessage("Reloaded Server");
        }
    }
}
