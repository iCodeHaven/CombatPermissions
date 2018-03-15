package com.icodehaven.combatpermissions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.icodehaven.combatpermissions.events.Combat;

public class Core extends JavaPlugin {
	
	@Override
	public void onEnable() {
		logMessage("&8[&7CombatPermissions&8] &fThe plugin was successfully loaded!");
		getServer().getPluginManager().registerEvents(new Combat(), this);
	}
	
	@Override
	public void onDisable() {
		logMessage("&8[&7CombatPermissions&8] &fThe plugin was successfully unloaded!");
	}
	
	public void logMessage(String msg) {
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
	}

}
