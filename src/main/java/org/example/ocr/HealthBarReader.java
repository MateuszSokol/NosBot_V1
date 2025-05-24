package org.example.ocr;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


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
        tesseract.setLanguage("pol");
    }

    /**
     * Extracts numeric HP value from a defined screen area using OCR.
     *
     * @param start_x left boundary of capture region
     * @param start_y top boundary of capture region
     * @param end_x right boundary of capture region
     * @param end_y bottom boundary of capture region
     * @return string value representing current HP parsed by OCR
     * @throws AWTException when screen capture fails
     * @throws TesseractException when OCR processing fails
     */
    public String extractTextDataFromHpBar(int start_x, int start_y, int end_x, int end_y)
            throws AWTException, TesseractException
    {
        Rectangle rectangle = new Rectangle(start_x,start_y,end_x-start_x,end_y-start_y);
        BufferedImage captureHealthBar = new Robot().createScreenCapture(rectangle);
        return tesseract.doOCR(captureHealthBar);
    }




}
