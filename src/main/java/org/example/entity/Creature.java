package org.example.entity;

/**
 * Abstract base class representing any creature-like entity in the game,
 * such as players or monsters.
 * It stores shared properties like health bar coordinates and current HP.
 */
public abstract class Creature
{
    // Constants defining the screen coordinates of the HP bar
    private final int HP_BAR_START_X;
    private final int HP_BAR_END_X;
    private final int HP_BAR_START_Y;
    private final int HP_BAR_END_Y;

    // Current HP value (set by OCR or pixel analysis in future)
    private int currentHP;


    // Construct a Creatures with specific HP bar coordinates.
    public Creature(int HP_BAR_START_X, int HP_BAR_END_X, int HP_BAR_START_Y, int HP_BAR_END_Y)
    {
        this.HP_BAR_START_X = HP_BAR_START_X;
        this.HP_BAR_END_X = HP_BAR_END_X;
        this.HP_BAR_START_Y = HP_BAR_START_Y;
        this.HP_BAR_END_Y = HP_BAR_END_Y;
    }

    // --- Getters ---

    /**
     * @return X coordinate where the HP bar starts
     */

    public int getHP_BAR_START_X() {
        return HP_BAR_START_X;
    }

    /**
     *
     * @return X coordinate where the HP bar ends
     */

    public int getHP_BAR_END_X() {
        return HP_BAR_END_X;
    }

    /**
     *
     * @return Y coordinate where the HP bar starts
     */

    public int getHP_BAR_START_Y() {
        return HP_BAR_START_Y;
    }

    /**
     *
     * @return Y coordinate where the HP bar ends
     */

    public int getHP_BAR_END_Y() {
        return HP_BAR_END_Y;

    }
    // --- Setters  ---
    public void setCurrentHP(int currentHP){
        this.currentHP = currentHP;
    }
}
