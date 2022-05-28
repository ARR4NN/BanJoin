package com.arr4nn.banjoin;

import com.arr4nn.banjoin.events.PluginEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class BanJoin extends JavaPlugin {

  @Override
  public void onEnable() {
    // Plugin startup logic
    getLogger().info("Plugin started.");
    getServer().getPluginManager().registerEvents(new PluginEvents(), this);

  }
}
