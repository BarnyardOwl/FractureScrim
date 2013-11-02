package main;

import java.util.List;
import java.util.logging.Logger;

import main.Var.Weather;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.World;
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

		List<World> worlds = Bukkit.getWorlds( );
		World world = Bukkit.getWorld( worlds.get( 0 ).getName( ) );
		if( Var.weather == Weather.CLEAR )
			world.setStorm( false );
		if( Var.weather == Weather.RAINING )
			world.setStorm( true );
		if( Var.weather == Weather.THUNDER )
			world.setThundering( true );
		PluginDescriptionFile pdfFile = this.getDescription( );
		this.logger.info( pdfFile.getName( ) + " " + pdfFile.getVersion( ) + " has been fully enabled!" );

	}

	@Override
	public void onDisable( ) {
		PluginDescriptionFile pdfFile = this.getDescription( );

		this.logger.info( pdfFile.getName( ) + " " + pdfFile.getVersion( ) + " has been fully disabled!" );
	}

}
