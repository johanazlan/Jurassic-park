package game.Item;

import basecode.engine.WeaponItem;

/**
 * @version 1.0.0
 * @see PortableItem
 */

/**
 * A class representing Laser Gun item
 */
public class LaserGun extends WeaponItem {
    /**
     * the price of one Laser Gun item
     */
    private int ecoPointsPrice = 500;

    /**
     * Constructor
     */
    public LaserGun() {
        super("Laser Gun", '>', 50, "shoots");
    }

    public int getEcoPointsPrice(){
        return ecoPointsPrice;
    }

}
