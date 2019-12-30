package com.jonahseguin.drinktest;

import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.Sender;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NameCmd {

    @Command(name = "", usage = "<player>", desc = "Get a player's name!")
    public void name(@Sender CommandSender sender, Player target) {
        sender.sendMessage(ChatColor.GRAY + target.getName() + "'s display name is: " + target.getDisplayName());
    }

}
