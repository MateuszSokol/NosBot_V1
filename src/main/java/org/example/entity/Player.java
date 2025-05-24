package org.example.entity;

import net.sourceforge.tess4j.TesseractException;
import org.example.ocr.HealthBarReader;

import javax.swing.*;
import java.awt.*;

/**
 * Child class
 * Represents a Player in the game.
 * Inherits common HP bar logic from the Creature class.
 */
public class Player extends Creature
{
    // Constant defining player's HP bar screen coordinates
    // Adjust those value to point the character health bar
    // Default coordinates defined
    private final static int HP_BAR_START_X = 141;
    private final static int HP_BAR_END_X = 209;
    private final static int HP_BAR_START_Y= 27;
    private final static int HP_BAR_END_Y= 40;
    // dodanie klasy HealthBarReader jako zmienna klasowa.
    private final HealthBarReader healthBarReader;

    /**
     * Constructs a Player by passing HP bar coordinates to the Creature superclass.
     */
    public Player()
    {

        super(HP_BAR_START_X, HP_BAR_END_X, HP_BAR_START_Y,HP_BAR_END_Y);
        healthBarReader = new HealthBarReader();
    }

    /**
     * Extracts the player's health value from the health bar using OCR (Optical Character Recognition).
     * This method captures the screen area defined by the player's health bar coordinates and processes it to
     * extract the health value as text.
     *
     * @return A string representing the player's health. If OCR fails, returns "unknown".
     * @throws AWTException If screen capture fails due to issues with the Robot or screen access.
     * @throws TesseractException If OCR processing fails (e.g., issues with image recognition).
     */
    public String getHealthValueUsingOCRFromHealthBarReader()
    {
        try {
            return healthBarReader.extractTextDataFromHpBar(
                    HP_BAR_START_X,HP_BAR_START_Y,
                    HP_BAR_END_X,HP_BAR_END_Y);
        } catch (AWTException | TesseractException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "OCR failed during Player creation: " + e.getMessage(),
                    "OCR Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return "unknown";
        }

    }
}
