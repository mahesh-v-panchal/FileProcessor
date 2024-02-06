package com.file.tdd;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        AsciiFileReader asciiFileReader=new AsciiFileReader();
        asciiFileReader.readAndProcessFile("src/main/resources/123.txt");
        System.out.printf("Done!");

    }
}