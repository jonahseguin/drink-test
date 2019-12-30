package com.jonahseguin.drinktest;

import com.jonahseguin.drink.CommandService;
import com.jonahseguin.drink.Drink;
import org.bukkit.plugin.java.JavaPlugin;

public class DrinkTest extends JavaPlugin {

    @Override
    public void onEnable() {
        CommandService cmdService = Drink.get(this);
        cmdService.register(new TestCmd(), "test", "test2", "drinktest");
        cmdService.registerSub("test", new DetachedCmd());
        cmdService.register(new NameCmd(), "name", "name2", "displayname");

        cmdService.registerCommands();
    }

    @Override
    public void onDisable() {

    }

}
