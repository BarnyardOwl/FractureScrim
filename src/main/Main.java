package main;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import tdm.MyListener;

public class Main extends JavaPlugin {
	public final Logger logger = Logger.getLogger( "Minecraft" );
	public static Main plugin;

	@Override
	public void onEnable( ) {
		new MyListener( this ); // Register events
		Bukkit.getServer( ).setDefaultGameMode( GameMode.CREATIVE ); // Set joining observer's gamemode to creative
		// getCommand("COMMAND GOES HERE").setExecutor(new CommandListener(this)); // Exemplar command

		PluginDescriptionFile pdfFile = this.getDescription( );
		this.logger.info( pdfFile.getName( ) + " " + pdfFile.getVersion( ) + " has been fully enabled!" );

	}

	@Override
	public void onDisable( ) {
		PluginDescriptionFile pdfFile = this.getDescription( );

		this.logger.info( pdfFile.getName( ) + " " + pdfFile.getVersion( ) + " has been fully disabled!" );
	}

}
