package com.jonahseguin.drinktest;

import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.Sender;
import com.jonahseguin.drink.modifier.annotation.Optional;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class DetachedCmd {

    @Command(name = "gang", aliases = "gang2", desc = "Detached command! gang")
    public void gang(@Sender CommandSender sender, @Optional("1") int integer) {
        sender.sendMessage(ChatColor.YELLOW +  "Integer: " + integer);
    }

}
