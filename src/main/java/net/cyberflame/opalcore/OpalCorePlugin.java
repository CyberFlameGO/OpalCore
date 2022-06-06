package net.cyberflame.opalcore;

import net.cyberflame.opalcore.tasks.CheckTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class OpalCorePlugin extends JavaPlugin
{
	private static OpalCorePlugin instance;
	public void onEnable() {
		OpalCorePlugin.instance = this;
		new CheckTask(Bukkit.getOnlinePlayers(), null).runTaskTimerAsynchronously(this, 0, 20);
	}
	@SuppressWarnings("FinalStaticMethod")
	public static final OpalCorePlugin getInstance()
	{
		return OpalCorePlugin.instance;
	}
}
