package org.example.entity;

/**
 * Child class
 * Represents a Player in the game.
 * Inherits common HP bar logic from the Creature class.
 */
public class Player extends Creature
{
    // Constant defining player's HP bar screen coordinates
    private final static int HP_BAR_START_X = 114;
    private final static int HP_BAR_END_X = 238;
    private final static int HP_BAR_START_Y= 28;
    private final static int HP_BAR_END_Y= 40;

    /**
     * Constructs a Player by passing HP bar coordinates to the Creature superclass.
     */
    public Player()
    {
        super(HP_BAR_START_X, HP_BAR_END_X, HP_BAR_START_Y,HP_BAR_END_Y);
    }
}
