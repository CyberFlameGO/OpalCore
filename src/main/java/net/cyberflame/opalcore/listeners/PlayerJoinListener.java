package net.cyberflame.opalcore.listeners;

import net.cyberflame.opalcore.OpalCorePlugin;
import net.cyberflame.opalcore.tasks.CheckTask;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener
{
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {

		Player player = event.getPlayer();
		new CheckTask(null, player).runTaskTimerAsynchronously(OpalCorePlugin.getInstance(), 0, 20);
	}
}
