package main;

import java.util.HashMap;
import java.util.Map;

public class Var {
	public enum GameState {
		NOT_STARTED, ACTIVE, FINISHED
	}
	public static Map<String, Team> teams = new HashMap<String, Team>( ); // Put each player to a team
	public static GameState gameState = GameState.NOT_STARTED; // false = game hasn't started; true = game going on; null = game ended
	public static Boolean disableBlockInteractions = false;
}
