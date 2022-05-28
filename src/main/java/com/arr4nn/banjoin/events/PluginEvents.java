package com.arr4nn.banjoin.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PluginEvents implements Listener {
  @EventHandler
  public static void PlayerJoinEvent(PlayerJoinEvent event){
    Player p = event.getPlayer();
    p.kickPlayer("[AntiCheat] Banned for: Joining");
  }
}
