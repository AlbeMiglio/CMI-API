package com.Zrips.CMI.AllListeners;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent.TargetReason;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;

import com.Zrips.CMI.CMI;

public class NoTargetListener implements Listener {

    private CMI plugin;

    public static Set<UUID> noTargetPlayers = new HashSet<UUID>();

    public NoTargetListener(CMI plugin) {
	this.plugin = plugin;
    }

    public static boolean isInNoTargetPlayers(UUID uuid) {
	return false;
    }

    public static void addNoTargetPlayers(UUID uuid) {
    }

    public static void removeNoTargetPlayers(UUID uuid) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void EntityTargetLivingEntityEvent(EntityTargetLivingEntityEvent event) {
    }
}