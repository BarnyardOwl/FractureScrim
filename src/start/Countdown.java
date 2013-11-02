package start;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import main.Var;
import main.Var.GameState;

public class Countdown {
	public static void react( ) {
		if( ( Var.countdownCount != 0 && Var.countdownCount % 5 == 0 ) /* If the amount of seconds left is divisible by 5 or... */
				|| ( Var.countdownCount < 5 && Var.countdownCount > 1 ) /* the seconds left is less than 5 and greater than 1 */) {
			Bukkit.broadcastMessage( ChatColor.GREEN + "The match will begin in " + ChatColor.DARK_RED + Var.countdownCount + ChatColor.GREEN + " seconds." );
		} else if( Var.countdownCount == 1 ) {
			/** If one second remains, use "second" instead of "seconds". <b>Common programming mistake.</b> */
			Bukkit.broadcastMessage( ChatColor.GREEN + "The match will begin in " + ChatColor.DARK_RED + Var.countdownCount + ChatColor.GREEN + " second." );
		} else if( Var.countdownCount <= 0 ) { // If no seconds remain...
			Bukkit.broadcastMessage( ChatColor.GREEN + "The match has begun!" );
			Var.gameState = GameState.ACTIVE;
			Var.countdownTimer.cancel( );
		}
	}

	public static void update( ) {
		if( Var.countdownCount >= 1 ) {
			Var.countdownCount--;
		} else {
			// This should never happen. If it does, I blame Richard.
			Var.countdownCount = null;
			Var.countdownTimer.cancel( );
		}
	}
}
