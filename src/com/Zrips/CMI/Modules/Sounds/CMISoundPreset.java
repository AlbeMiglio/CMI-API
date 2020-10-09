package com.Zrips.CMI.Modules.Sounds;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMISound;

public enum CMISoundPreset {
    WarpGuiOpen("entity_bat_takeoff:0.5:1"),
    TeleportHome("block_beacon_activate:2:1"),
    TeleportWarp("entity_enderman_teleport:0.5:1"),
    TeleportFail("entity_villager_no:2:1"),
    PrivateMessage("entity_endermite_death:2:1"),
    TpaRequest("block_anvil_land:0.5:2"),
    MailNotification("entity_creeper_hurt:1:0.5"),
    TeleportUp("entity_enderman_teleport:2:1"),
    TeleportDown("entity_enderman_teleport:0.2:1");

    private String soundString;
    private CMISound sound;
    private boolean enabled = true;

    CMISoundPreset(String soundString) {
    }

    public String getSoundString() {
	return soundString;
    }

    public void setSoundString(String soundString) {
    }

    public CMISound getSound() {
	return sound;
    }

    public void play(Player player) {
    }

    public void play(Location loc) {
    }

    public void setSound(CMISound sound) {
	this.sound = sound;
	this.sound.setEnabled(enabled);
    }

    public boolean isEnabled() {
	return enabled;
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;
	this.sound.setEnabled(enabled);
    }

}
