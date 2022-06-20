package com.pluginsettingpresets;

import com.pluginsettingpresets.PluginSettingPresetsPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PluginSettingPresetsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PluginSettingPresetsPlugin.class);
		RuneLite.main(args);
	}
}