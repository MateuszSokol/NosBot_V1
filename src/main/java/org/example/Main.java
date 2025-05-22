package org.example;

import org.example.entity.Creature;
import org.example.entity.Monster;
import org.example.entity.Player;

/**
 *
 * Entry point of the program.
 * Initializes game entities and starts the core logic.
 */
public class Main
{
    public static void main(String[] args)
    {
        Creature player = new Player();
        Creature monster = new Monster();

    }
}