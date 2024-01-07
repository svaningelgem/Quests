package com.leonardobishop.quests.bukkit.hook.title;

import org.bukkit.entity.Player;

public class Title_Bukkit implements QuestsTitle {
    @SuppressWarnings("deprecation")
    @Override
    public void sendTitle(Player player, String title, String subtitle) {
        player.sendTitle(title, subtitle, 10, 100, 10);
    }
}
