package game;

import basecode.engine.Actor;
import basecode.engine.Ground;
import game.Behaviour.BreedingBehaviour;

/**
 * @author shauntan, johanazlan
 * @version 1.0.0
 * @see Player
 */

public class Wall extends Ground {

	public Wall() {
		super('#');
	}
	
	@Override
	public boolean canActorEnter(Actor actor) {
		return false;
	}
	
	@Override
	public boolean blocksThrownObjects() {
		return true;
	}
}
