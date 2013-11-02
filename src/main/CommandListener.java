package main;

import main.Main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandListener implements CommandExecutor {
	@SuppressWarnings( "unused" )
	private final Main plugin;

	public CommandListener( Main plugin ) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand( CommandSender sender, Command cmd, String commandLabel, String[ ] args ) {
		if( sender instanceof Player ) {
			String command = cmd.getName( );
			@SuppressWarnings( "unused" )
			Player player = ( Player ) sender;
			if( command.equalsIgnoreCase( "COMMAND GOES HERE" ) ) {

			}
		}
		return false;
	}

}
