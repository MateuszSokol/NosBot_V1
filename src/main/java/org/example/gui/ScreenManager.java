package org.example.gui;


import java.awt.*;

/**
 * Provides functionality to center a window on the screen.
 * Stores screen dimensions and calculates the central point
 * where a window should be placed.
 */
public class ScreenManager
{
    private final int screenWidth;
    private final int screenHeight;

    public ScreenManager()
    {
        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.screenWidth = screenDimension.width;
        this.screenHeight= screenDimension.height;

    }

    /**
     *
     * Returns a Point representing the top-left corner position
     * where the window should be placed to appear centered on the screen
     * @param windowWidth the width of the window
     * @param windowHeight the height of the window
     * @return a Point with x and y coordinates to center the window
     */
    public Point getCentrePoint(int windowWidth, int windowHeight)
    {
        return new Point((screenWidth -windowWidth)/2,(screenHeight-windowHeight)/2);
    }


}
