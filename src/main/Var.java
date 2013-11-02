package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

public class Var {
	public enum GameState {
		NOT_STARTED, ACTIVE, FINISHED
	}

	public enum GameType {
		UNDECIDED, TDM
	}
	public static Map<String, Team> teams = new HashMap<String, Team>( ); // Put each player to a team
	public static GameType gameType = GameType.UNDECIDED;
	public static GameState gameState = GameState.NOT_STARTED; // false = game hasn't started; true = game going on; null = game ended
	public static Boolean disableBlockInteractions = false;
	public static Integer countdownCount = null;
	public static Timer countdownTimer = new Timer( );
}
