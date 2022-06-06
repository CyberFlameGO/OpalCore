package net.cyberflame.opalcore.tasks;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public class CheckTask extends BukkitRunnable
{
	private final Collection<? extends Player> players;
	private final @Nullable Player player;
	public CheckTask(@Nullable final Collection<? extends Player> players, @Nullable final Player player) {
		this.player = player;
		this.players = players;
	}

	@Override
	public void run() {
		if (players != null)
			{
				for (Player player : players)
					{
						if (player.isOnline())
							{
								player.sendMessage("Hello, world!");
							}
					}

			}
		if (player != null)
			{
				if (player.isOnline())
					{
						player.sendMessage("Hello, world!");
					}
			}
	}
}
