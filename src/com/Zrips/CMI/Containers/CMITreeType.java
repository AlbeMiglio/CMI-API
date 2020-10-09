package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.TreeType;

public enum CMITreeType {
    ACACIA("Acacia"),
    BIG_TREE("Large oak", "bigoak", "big", "bigtree"),
    BIRCH("Birch", "white", "whitebark"),
    BROWN_MUSHROOM("Brown mushroom", "browngiantmushroom"),
    CHORUS_PLANT("Chorus Plant", "chorus"),
    COCOA_TREE("Cocoa"),
    DARK_OAK("Dark oak"),
    JUNGLE("Jungle"),
    JUNGLE_BUSH("Jungle bush", "jungleshrub"),
    MEGA_REDWOOD("Large spruce", "megaredwood"),
    REDWOOD("Spruce", "redwood", "sequoia", "sequoioideae"),
    RED_MUSHROOM("Red mushroom", "redgiantmushroom"),
    SMALL_JUNGLE("Small jungle"),
    SWAMP("Swamp", "swamptree"),
    TALL_BIRCH("Tall birch"),
    TALL_REDWOOD("Tall spruce", "bigspruce", "tallredwood", "tallsequoia", "tallsequoioideae"),
    TREE("Oak", "tree", "regular");

    private String name;
    private String[] identifiers;
    private TreeType type = null;

    CMITreeType(String Name, String... identifiers) {
	name = Name;
	this.identifiers = identifiers;

	for (TreeType one : TreeType.values()) {
	    if (one.name().equalsIgnoreCase(this.toString())) {
		type = one;
		break;
	    }
	}
    }

    static HashMap<String, CMITreeType> map = new HashMap<String, CMITreeType>();

    public static CMITreeType getType(String name) {
	return null;
    }

    public String getName() {
	return name;
    }

    public String[] getIdentifiers() {
	return identifiers;
    }

    public TreeType getType() {
	return type;
    }
}
