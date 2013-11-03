package scoreboard;

import org.bukkit.scoreboard.Team;

import main.Var;

/**
 * This class is for <i>static</i> methods which change the scoreboard in a very specific way.
 * We are not yet to the state of implementing these methods.
 * It is beneficial to have all the small methods done, as when you get finished coding, your main code will look like this:
 * 
 * startNewScoreboard();
 * addTeam("blue", ChatColor.BLUE);
 * 
 * instead of:
 * 
 * Scoreboard sb = Bukkit.getScoreboardManager( ).getNewScoreboard( );
 * Team blue = sb.registerNewTeam("blue");
 * team.setPrefix(ChatColor.BLUE + "");
 * team.setSuffix(ChatColor.WHITE + "");
 * team.setAllowFriendlyFire(false)
 * team.setCanSeeFriendlyInvisibles(true);
 * 
 * Please <b>follow these guidelines</b> and only remove this comment when we begin implementing these methods into the main code. Thank you! :)
 */
public class Scoreboard {
	public static Team createTeam( String name ) { // Example static method. This is NOT ACTUALLY FUNCTIONAL. Replace with your own.
		return Var.scoreboard.registerNewTeam( name ); // Side note, I just realized I named an enum team. MAKE SURE TO IMPORT THE RIGHT TEAM AS WELL! It's the bukkit.scoreboard.??? team! Dunt screw anything up. pls.
	} // Second side note, renamed it to "team data". Enough side notes.
}
