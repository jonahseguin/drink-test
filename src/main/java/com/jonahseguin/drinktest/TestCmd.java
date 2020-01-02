package com.jonahseguin.drinktest;

import com.jonahseguin.drink.annotation.*;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
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

    @Command(name = "flag", desc = "A test sub-command with a flag!")
    public void testFlag(@Sender CommandSender sender, @Flag('s') String s, @Optional("69") int i) {
        if (s == null) {
            s = "you left the flag blank D:";
        }
        sender.sendMessage("Flag msg: " + s);
        sender.sendMessage("optional integer: " + i);
    }

    @Command(name = "flagb", desc = "Boolean flag test sub")
    public void testBooleanFlag(@Sender CommandSender sender, @Flag('b') boolean b) {
        sender.sendMessage("b flag: " + (b ? "true" : "false"));
    }

}
