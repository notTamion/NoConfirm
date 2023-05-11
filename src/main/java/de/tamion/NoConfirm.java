package de.tamion;

import de.tamion.listeners.ReloadListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoConfirm extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new ReloadListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
