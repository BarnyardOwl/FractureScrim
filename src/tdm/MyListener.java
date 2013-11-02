package tdm;

import main.Main;
import main.Var;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MyListener implements Listener {

	@SuppressWarnings( "unused" )
	private final Main plugin;

	public MyListener( Main plugin ) {
		this.plugin = plugin;
		plugin.getServer( ).getPluginManager( ).registerEvents( this, plugin );
	}

	@EventHandler
	public void onCreatureSpawn( CreatureSpawnEvent event ) {
		event.setCancelled( true ); // Prevent any monsters from spawning
	}

	@EventHandler
	public void onPlayerJoin( PlayerJoinEvent event ) {
		// TODO: Set player's team to observer
	}

	@EventHandler
	public void onPlayerLeave( PlayerQuitEvent event ) {
		if( Var.teams.containsKey( event.getPlayer( ).getName( ) ) ) { // Be SURE to use getName() and not getDisplayName()!
			Var.teams.remove( event.getPlayer( ).getName( ) );
		}
	}

	@EventHandler
	public void onPlayerKick( PlayerKickEvent event ) {
		if( Var.teams.containsKey( event.getPlayer( ).getName( ) ) ) { // Be SURE to use getName() and not getDisplayName()!
			Var.teams.remove( event.getPlayer( ).getName( ) );
		}
	}

	@EventHandler
	public void onPlayerDamaged( EntityDamageByEntityEvent event ) {
		if( event.getDamager( ) instanceof Player && event.getEntity( ) instanceof Player ) {
			// TODO: Cancel event if damager is spectator.
		}
	}

	@EventHandler
	public void onPlayerInteract( PlayerInteractEvent event ) {
		if( Var.disableBlockInteractions ) {
			event.setCancelled( true ); // Stop all interacting if configured
		}
	}
}