package com.Zrips.CMI.utils;

import java.io.File;

import org.bukkit.command.CommandSender;

public class EssentialsConverter {

    static int totalToConvert = 0;
    static int converted = 0;
    static int lastBatch = 0;
    static boolean done = false;
    static File ff;

    public EssentialsConverter() {
    }

    public enum importType {
	homes, warps, nickname, logoutlocation, money, mail;
    }

    public static void convert(final CommandSender sender, importSettings is) {
	if (is.is(importType.warps))
	    convertWarps(sender);
	convertUsers(sender, is);
    }

    public static void convertUsers(final CommandSender sender, final importSettings is) {

    }

    private static void convertWarps(final CommandSender sender) {

    }

    private static void proccess(int place, final CommandSender sender, final importSettings is) {
    }

}
