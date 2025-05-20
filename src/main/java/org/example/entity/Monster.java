package org.example.entity;

/**
 * Child class
 * Represents a Monster in the game.
 * Inherits common HP bar logic from the Creature class.
 */
public class Monster extends Creature
{
    // Constant defining monster's HP bar screen coordinates
    private final static int HP_BAR_START_X =950;
    private final static int HP_BAR_END_X =1071;
    private final static int HP_BAR_START_Y =28;
    private final static int HP_BAR_END_Y = 36;

    /**
     * Constructs a Monster by passing HP bar coordinates to the Creature superclass.
     */
    public Monster()
    {
        super(HP_BAR_START_X, HP_BAR_END_X, HP_BAR_START_Y, HP_BAR_END_Y);
    }
}
