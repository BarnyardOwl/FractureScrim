package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

import org.bukkit.scoreboard.Scoreboard;

public class Var {
	public enum GameState {
		NOT_STARTED, ACTIVE, FINISHED // possible gamestates
	}

	public enum GameType {
		UNDECIDED, TDM // possible gametypes
	}
	
	public enum Weather {
		CLEAR, RAINING, THUNDER
	}
	public static Scoreboard scoreboard;
	public static Map<String, TeamData> teams = new HashMap<String, TeamData>( ); // Put each player to a team
	public static GameType gameType = GameType.UNDECIDED;
	public static GameState gameState = GameState.NOT_STARTED;
	public static Weather weather = Weather.CLEAR;
	public static Boolean disableBlockInteractions = false;
	public static Integer countdownCount = null;
	public static Timer countdownTimer = new Timer( );
	public static Boolean disableTreeDecay = false;
	
	// Now we will take a short except from another person's code. 
	//
	// At this point, I'd like to take a moment to speak to you about the Adobe PSD format.
	// PSD is not a good format. PSD is not even a bad format. Calling it such would be an
	// insult to other bad formats, such as PCX or JPEG. No, PSD is an abysmal format. Having
	// worked on this code for several weeks now, my hate for PSD has grown to a raging fire
	// that burns with the fierce passion of a million suns.
	//
	// If there are two different ways of doing something, PSD will do both, in different
	// places. It will then make up three more ways no sane human would think of, and do those
	// too. PSD makes inconsistency an art form. Why, for instance, did it suddenly decide
	// that *these* particular chunks should be aligned to four bytes, and that this alignement
	// should *not* be included in the size? Other chunks in other places are either unaligned,
	// or aligned with the alignment included in the size. Here, though, it is not included.
	// Either one of these three behaviours would be fine. A sane format would pick one. PSD,
	// of course, uses all three, and more.
	//
	// Trying to get data out of a PSD file is like trying to find something in the attic of
	// your eccentric old uncle who died in a freak freshwater shark attack on his 58th
	// birthday. That last detail may not be important for the purposes of the simile, but
	// at this point I am spending a lot of time imagining amusing fates for the people
	// responsible for this Rube Goldberg of a file format.
	//
	// Earlier, I tried to get a hold of the latest specs for the PSD file format. To do this,
	// I had to apply to them for permission to apply to them to have them consider sending
	// me this sacred tome. This would have involved faxing them a copy of some document or
	// other, probably signed in blood. I can only imagine that they make this process so
	// difficult because they are intensely ashamed of having created this abomination. I
	// was naturally not gullible enough to go through with this procedure, but if I had done
	// so, I would have printed out every single page of the spec, and set them all on fire.
	// Were it within my power, I would gather every single copy of those specs, and launch
	// them on a spaceship directly into the sun.
	//
	// PSD is not my favourite file format.
	//
	// Credit where it's due: http://goo.gl/IDJV5
}
