package com.icodehaven.combatpermissions.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Combat implements Listener {

	@EventHandler(priority = EventPriority.HIGHEST)
	public void playerHitPlayer(EntityDamageByEntityEvent event) {
		if (!(event.getEntity() instanceof Player || event.getDamager() instanceof Player)) {
			return;
		}
		if (!event.getDamager().hasPermission("combat.allow") || !event.getEntity().hasPermission("combat.allow")) {
			event.setCancelled(true);
		}
	}

}
