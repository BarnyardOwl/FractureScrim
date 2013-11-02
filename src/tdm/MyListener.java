package tdm;

import main.Main;
import main.Var;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class MyListener implements Listener {

	@SuppressWarnings( "unused" )
	private final Main plugin;

	public MyListener( Main plugin ) {
		this.plugin = plugin;
		plugin.getServer( ).getPluginManager( ).registerEvents( this, plugin );
	}

	@EventHandler
	public void onCreatureSpawn( CreatureSpawnEvent event ) {
		event.setCancelled( true );
	}

	@EventHandler
	public void onPlayerDamaged( EntityDamageByEntityEvent event ) {
		if( event.getDamager( ) instanceof Player && event.getEntity( ) instanceof Player ) {
			// TODO Cancel event if damager is spectator.
		}
	}

	@EventHandler
	public void onPlayerInteract( PlayerInteractEvent event ) {
		if( Var.disableBlockInteractions ) {
			event.setCancelled( true );
		}
	}
}