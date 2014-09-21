package me.rw_craft.fwonjoin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		//Send a message to the console, get the version of the plugin
		Bukkit.getServer().getLogger().info("Firework On Join V. "+getDescription().getVersion()+" By RW_Craft Has Started!");
		//Create the config file
		getConfig().options().copyDefaults(true);
        saveConfig();
		//Load the listener
		Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
	}
	
	//Saving the config will need the onDisable method
	public void onDisable() {
		//Send a message to the console, get the version of the plugin
		Bukkit.getServer().getLogger().info("Firework On Join V. "+getDescription().getVersion()+" By RW_Craft Has Started!");
		//Save the config
		saveConfig();
	}
}
