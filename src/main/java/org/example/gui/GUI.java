package org.example.gui;

import javax.swing.*;
import java.awt.*;

public class GUI
{
    private JFrame mainWindow;
    private JPanel mainPanel;
    private static final int WINDOW_WIDTH = 200;
    private static final int WINDOW_HEIGHT = 150;
    private final ScreenManager screenManager;

    public GUI()
    {
        screenManager = new ScreenManager();
        createMainWindow();
        createMainPanel();
        setContentPanelToMainFrame();
        centreTheMainWindow();
        showMainWindow();
        adjustComponentsSizeToWindow();




    }


    /**
     * Recalculates and adjusts the window size based on its current components and layout.
     * Should be called after adding or modifying components dynamically.
     */

    public void adjustComponentsSizeToWindow()
    {
        mainWindow.pack();
    }

    /**
     * Initializes the main application window (JFrame) with title, size, and close operation.
     */
    private void createMainWindow()
    {
        mainWindow = new JFrame();
        mainWindow.setTitle("NosBot_V1");
        mainWindow.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    /**
     * Positions the main window in the center of the screen,
     * based on predefined window width and height.
     */
    private void centreTheMainWindow()
    {
        Point p = screenManager.getCentrePoint(WINDOW_WIDTH,WINDOW_HEIGHT);
        mainWindow.setLocation(p);
    }
    /**
     * Makes the main window visible to the user.
     */
    private void showMainWindow()
    {
        mainWindow.setVisible(true);
    }

    /**
     * Sets the created main panel as the content pane of the main window.
     */

    private void setContentPanelToMainFrame()
    {
        mainWindow.setContentPane(mainPanel);
    }


    /**
     * Creates the main panel (JPanel) with a border layout and minimal padding.
     */
    private void createMainPanel()
    {
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        mainPanel.setLayout(new BorderLayout());

    }
}
