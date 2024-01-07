package com.leonardobishop.quests.bukkit.hook.actionbar;

import org.bukkit.entity.Player;

public class ActionBar_Nothing implements QuestsActionBar {
    @Override
    public void sendActionBar(Player player, String title) {
        // no compatible action bar impl found
    }
}
