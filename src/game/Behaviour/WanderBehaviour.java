package game.Behaviour;

import java.util.ArrayList;
import java.util.Random;

import basecode.engine.Action;
import basecode.engine.Actor;
import basecode.engine.Exit;
import basecode.engine.GameMap;
import basecode.engine.Location;
import game.Behaviour.Behaviour;

/**
 * @version 1.0.0
 * @see game.Dinosaur
 */

public class WanderBehaviour implements Behaviour {
	
	private Random random = new Random();


	/**
	 * Returns a MoveAction to wander to a random location, if possible.  
	 * If no movement is possible, returns null.
	 * 
	 * @param actor the Actor enacting the behaviour
	 * @param map the map that actor is currently on
	 * @return an Action, or null if no MoveAction is possible
	 */
	@Override
	public Action getAction(Actor actor, GameMap map) {
		ArrayList<Action> actions = new ArrayList<Action>();
		
		for (Exit exit : map.locationOf(actor).getExits()) {
            Location destination = exit.getDestination();
            if (destination.canActorEnter(actor)) {
            	actions.add(exit.getDestination().getMoveAction(actor, "around", exit.getHotKey()));
            }
        }
		
		if (!actions.isEmpty()) {
			return actions.get(random.nextInt(actions.size()));
		}
		else {
			return null;
		}

	}

}
