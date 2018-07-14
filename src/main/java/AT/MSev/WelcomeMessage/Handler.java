package AT.MSev.WelcomeMessage;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

import java.awt.*;

public class Handler implements Listener {

    Plugin plugin;
    public Handler(Plugin plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    void OnJoin(PlayerJoinEvent e)
    {
        e.setJoinMessage("");
        for (Player p:
            plugin.getServer().getOnlinePlayers()) {
            p.sendMessage(String.format(Util.replaceColors(plugin.getConfig().getString("publicmessage")), e.getPlayer().getDisplayName()));
        }

        e.getPlayer().sendMessage(
               Util.replaceColors(plugin.getConfig().getString("message"))
        );
    }


}
