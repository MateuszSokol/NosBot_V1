package org.example.ocr;

import net.sourceforge.tess4j.Tesseract;


/**
 * Service class responsible for reading a creature's HP value from the screen.
 * Uses the Tesseract OCR engine to extract numeric data from the HP bar area.
 */

public class HealthBarReader
{
    private final Tesseract tesseract;

    /**
     * Initializes the Tesseract engine with configuration data.
     */
    public HealthBarReader()
    {
        tesseract = new Tesseract();
        tesseract.setDatapath("tessdata");
        tesseract.setLanguage("eng");
    }



}
