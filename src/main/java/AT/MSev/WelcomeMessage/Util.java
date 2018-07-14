package AT.MSev.WelcomeMessage;

import org.bukkit.ChatColor;

public class Util {
    public static String replaceColors(String line)
    {
        line = line.replaceAll("&0", ChatColor.BLACK + "");
        line = line.replaceAll("&1", ChatColor.DARK_BLUE + "");
        line = line.replaceAll("&2", ChatColor.DARK_GREEN + "");
        line = line.replaceAll("&3", ChatColor.DARK_AQUA + "");
        line = line.replaceAll("&4", ChatColor.DARK_RED + "");
        line = line.replaceAll("&5", ChatColor.DARK_PURPLE + "");
        line = line.replaceAll("&6", ChatColor.GOLD + "");
        line = line.replaceAll("&7", ChatColor.GRAY + "");
        line = line.replaceAll("&8", ChatColor.DARK_GRAY+ "");
        line = line.replaceAll("&9", ChatColor.BLUE + "");
        line = line.replaceAll("&a", ChatColor.GREEN + "");
        line = line.replaceAll("&b", ChatColor.AQUA + "");
        line = line.replaceAll("&c", ChatColor.RED + "");
        line = line.replaceAll("&d", ChatColor.LIGHT_PURPLE + "");
        line = line.replaceAll("&e", ChatColor.YELLOW + "");
        line = line.replaceAll("&f", ChatColor.WHITE + "");
        line = line.replaceAll("&g", ChatColor.MAGIC + "");
        return line;
    }
}
