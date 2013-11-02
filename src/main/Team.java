package main;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;

/**
 * Stores information for a player's team
 * */
public class Team {

	private String name;
	private ChatColor color;
	private GameMode gamemode;

	public Team( String name, ChatColor color, GameMode gamemode ) {
		this.name = name;
		this.color = color;
		this.gamemode = gamemode;
	}

	public String getName( ) {
		return name;
	}

	public ChatColor getColor( ) {
		return color;
	}

	public GameMode getGameMode( ) {
		return gamemode;
	}
}
