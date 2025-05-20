package org.example.ocr;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.awt.*;
import java.awt.image.BufferedImage;


/**
 *
 * Service class responsible for reading a creature's HP value from the screen.
 * Uses the Tesseract OCR engine to extract numeric data from the HP bar area.
 */

public class HealthBarReader
{
    private final Tesseract tesseract;

    /**
     *
     * Initializes the Tesseract engine with configuration data.
     */
    public HealthBarReader()
    {
        tesseract = new Tesseract();
        tesseract.setDatapath("tessdata");
        tesseract.setLanguage("eng");
    }

    /**
     * Extracts numeric HP value from a defined screen area using OCR.
     *
     * @param x1 left boundary of capture region
     * @param y1 top boundary of capture region
     * @param x2 right boundary of capture region
     * @param y2 bottom boundary of capture region
     * @return string value representing current HP parsed by OCR
     * @throws AWTException when screen capture fails
     * @throws TesseractException when OCR processing fails
     */
    public String extractNumericDataFromHpBar(int x1, int y1, int x2, int y2) throws AWTException, TesseractException
    {
        Rectangle rectangle = new Rectangle(x1,y1,x2-x1,y2-x2);

        try
        {
            BufferedImage captureHealthBar = new Robot().createScreenCapture(rectangle);
            return tesseract.doOCR(captureHealthBar);
        }
        catch (TesseractException tessE)
        {
            System.out.println("Error due to processing data with OCR: "+ tessE.getMessage());
        }
        catch (AWTException awtE)
        {
            System.out.println("Error due to invalid Robot actions: " + awtE.getMessage());
        }

        return "";
    }



}
