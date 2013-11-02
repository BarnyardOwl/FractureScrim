package start;

import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

import main.Var;
import main.Var.GameState;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

@SuppressWarnings( "unused" )
public class Trigger extends TimerTask {

	public Trigger( ) {}

	public static void startCountdown( Integer seconds, Player player ) {
		if( Var.gameState == GameState.NOT_STARTED ) {
			if( seconds >= 0 ) {
				Var.countdownCount = seconds;
				Var.countdownTimer.scheduleAtFixedRate( new Trigger( ), 0, 1000 );
			} else { // If the player enters in a negative number of seconds
				player.sendMessage( ChatColor.RED + "Please enter a valid number of seconds." );
			}
		} else {
			if( Var.gameState == GameState.ACTIVE ) // If the game is still running
				player.sendMessage( ChatColor.RED + "The game is currently active. It cannot be started." );
			if( Var.gameState == GameState.FINISHED ) // If the game is completed
				player.sendMessage( ChatColor.RED + "The game is finished. It cannot be started." );
		}
	}

	public void run( ) {
		Countdown.react( ); // Send chat messages, give players items, teleport to spawn, etc.
		Countdown.update( ); // Change the count
	}
}
