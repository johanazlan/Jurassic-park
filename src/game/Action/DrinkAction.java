package game.Action;

import basecode.engine.Action;
import basecode.engine.Actor;
import basecode.engine.GameMap;
import basecode.engine.Location;
import game.Dinosaur.*;
import game.Ground.Lake;

/**
 * @version 1.0.0
 * @see game.Application
 */

/**
 * A class that represents a drinking action
 */
public class DrinkAction extends Action {

    /**
     * the location of the lake
     */
    private Location lakeLocation;

    /**
     * the drinking capacity of the dinosaur after drinking from the lake
     */
    private int drink_cap;

    /**
     * Constructor for the DrinkAction
     * @param lakeLocation the location of the lake
     */
    public DrinkAction(Location lakeLocation){
        this.lakeLocation = lakeLocation;
    }

    @Override
    public String execute(Actor actor, GameMap map) {
        Dinosaur dinosaur = (Dinosaur) actor;

        // if the current ground is an instance of a lake
        if(lakeLocation.getGround() instanceof Lake){
            Lake lake = (Lake) lakeLocation.getGround();
            lake.setLakeCapacity(lake.getLakeCapacity() - 1);

            // if it's a Stegosaur, Allosaur or Pterodactyl add 30 to the drinking capacity
            if(actor instanceof Stegosaur || actor instanceof Allosaurs || actor instanceof Pterodactyl){
                drink_cap = dinosaur.getThirst_level() + 30;
                dinosaur.setThirst_level(Math.max(drink_cap, dinosaur.getMAX_WATER_CAP()));
            }

            // if it's a Brachiosaur add 80 to the drinking capacity
            else if(actor instanceof Brachiosaur){
                drink_cap = dinosaur.getThirst_level() + 80;
                dinosaur.setThirst_level(Math.max(drink_cap, dinosaur.getMAX_WATER_CAP()));
            }
        }
        return actor + " drink water from lake at x:" + lakeLocation.x() +", y:" + lakeLocation.y();
    }

    @Override
    public String menuDescription(Actor actor) {
        return "";
    }
}
