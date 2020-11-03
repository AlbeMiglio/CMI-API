package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import com.Zrips.CMI.Modules.GUI.CMIGui;

public final class CMIGUICloseEvent extends PlayerEvent{

    private static final HandlerList handlers = new HandlerList();
    private final CMIGui gui;

    public CMIGUICloseEvent(final Player player, final CMIGui gui) {
	super(player);
	this.gui = gui;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when player closed CMI gui")
    public final HandlerList getHandlers() {
	return handlers;
    }

    public CMIGui getGui() {
	return gui;
    }
}
