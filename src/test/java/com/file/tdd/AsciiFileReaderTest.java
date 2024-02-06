package com.file.tdd;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class AsciiFileReaderTest {

    private File file;
    private AsciiFileReader asciiFileReader;


    @Before
    public void setup() {
        asciiFileReader = new AsciiFileReader();
    }

    @Test
    public void validateFileTest() {
        boolean validFile = asciiFileReader.readAndProcessFile("src/test/resources/input.txt");
        assertTrue(validFile);
    }

    @Test
    public void checkForNullFileName() {
        boolean validFile = asciiFileReader.readAndProcessFile(null);
        assertFalse(validFile);
    }

    @Test
    public void checkForEmptyFileName() {
        boolean validFile = asciiFileReader.readAndProcessFile("");
        assertFalse(validFile);
    }

    @Test
    public void isFileExists() {
        boolean validFile = asciiFileReader.readAndProcessFile("src/test/resources/ABC.txt");
        assertFalse(validFile);
    }

    @Test
    public void checkForEmptyFileTest() {
        boolean validFile = asciiFileReader.readAndProcessFile("src/test/resources/ABC.txt");
        assertFalse(validFile);
    }

    @Test
    public void isFileReadableCheck() {
        boolean validFile = asciiFileReader.readAndProcessFile("src/test/resources/input.txt");
        assertTrue(validFile);
    }

    @Test
    public void readFileRelativePath() {
        File file = new File("src/test/resources/input.txt");
        assertTrue(file.exists());
    }

}
