package raton.meme.hcf.listener;

import org.bukkit.*;

public class ColorUtils
{
    public static String translate(final String input) {
        return ChatColor.translateAlternateColorCodes('&', input);
    }
}
