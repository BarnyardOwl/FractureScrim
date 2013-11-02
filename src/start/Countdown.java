package start;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import main.Var;
import main.Var.GameState;

public class Countdown {
	public static void react( ) {
		if( ( Var.countdownCount != 0 && Var.countdownCount % 5 == 0 ) || ( Var.countdownCount < 5 && Var.countdownCount > 1 ) ) {
			Bukkit.broadcastMessage( ChatColor.GREEN + "The match will begin in " + ChatColor.DARK_RED + Var.countdownCount + ChatColor.GREEN + " seconds." );
		} else if( Var.countdownCount == 1 ) {
			Bukkit.broadcastMessage( ChatColor.GREEN + "The match will begin in " + ChatColor.DARK_RED + Var.countdownCount + ChatColor.GREEN + " second." );
		} else if( Var.countdownCount <= 0 ) {
			Bukkit.broadcastMessage( ChatColor.GREEN + "The match has begun!" );
			Var.gameState = GameState.ACTIVE;
			Var.countdownTimer.cancel( );
		}
	}

	public static void update( ) {
		if( Var.countdownCount >= 1 ) {
			Var.countdownCount--;
		} else {
			Var.countdownCount = null;
			Var.countdownTimer.cancel( );
		}
	}
}
