package game.Action;

import basecode.engine.Action;
import basecode.engine.Actor;
import basecode.engine.GameMap;


/**
 * @version 1.0.0
 * @see RefuelAction
 */

public class QuitAction extends Action {

    /**
     * Exits the program if player decides to Quit.
     *
     * @param actor The actor performing the action.
     * @param map The map the actor is on.
     * @return the menuDescription
     */
    @Override
    public String execute(Actor actor, GameMap map) {
        System.exit(0);
        return menuDescription(actor);
    }

    /**
     * Display "Quit" in the menu
     *
     * @param actor The actor performing the action.
     * @return return "Quit"
     */
    @Override
    public String menuDescription(Actor actor) {
        return "Quit";
    }

    /**
     * Displays the hotkey
     *
     * @return the hotkey
     */
    @Override
    public String hotkey() {
        return "Q";
    }
}
