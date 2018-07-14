package AT.MSev.WelcomeMessage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class Handler implements Listener {

    Plugin plugin;
    public Handler(Plugin plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    void OnJoin(PlayerJoinEvent e)
    {
        e.getPlayer().sendMessage(
               Util.replaceColors(plugin.getConfig().getString("message"))
        );
    }
}
