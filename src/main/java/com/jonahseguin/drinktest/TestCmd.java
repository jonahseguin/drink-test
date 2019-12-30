package com.jonahseguin.drinktest;

import com.jonahseguin.drink.annotation.Command;
import com.jonahseguin.drink.annotation.Require;
import com.jonahseguin.drink.annotation.Sender;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TestCmd {

    @Command(name = "", desc = "A test command")
    @Require("drink.test")
    public void test(@Sender Player sender, boolean test) {
        sender.sendMessage(ChatColor.GREEN + "Hi, " + sender.getName() + "!: " + (test ? "true" : "false"));
    }

    @Command(name = "sub", aliases = "sub2", desc = "A test sub-command", usage = "<msg>")
    public void testSub(@Sender Player sender, String msg) {
        sender.sendMessage(ChatColor.GOLD + msg);
    }

}
