package game;

import basecode.engine.Location;


/**
 * @version 1.0.0
 * @see Floor
 * @see game.JurassicParkGameMap
 */

/**
 * A class to calculate the Manhattan distance of the two location
 */
public class Distance {

    /**
     * This method will calculate the Manhattan distance of the two location
     * @param a first location
     * @param b second location
     * @return the Manhattan distance between location a and location b
     */
    public static int distance(Location a, Location b) {
        return Math.abs(a.x() - b.x()) + Math.abs(a.y() - b.y());
    }
}
