package me.rw_craft.fwonjoin;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class JoinListener implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		//Get player location and launch firework
		//Cast firework to f
		Player p = event.getPlayer();
		if (p.hasPermission("firework.join")) {
		Firework f = (Firework) event.getPlayer().getWorld().spawn(event.getPlayer().getLocation(), Firework.class);
		
		//Firework data
		FireworkMeta fd = f.getFireworkMeta();
		fd.addEffects(FireworkEffect.builder()
				.flicker(false)
				.trail(true)
				.with(Type.BALL_LARGE)
				.withColor(Color.BLUE)
				.withFade(Color.WHITE)
				.build());
		}
		//Could use this later
		else {
		}
	}

}
