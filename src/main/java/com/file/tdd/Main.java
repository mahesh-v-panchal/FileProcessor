package com.file.tdd;
public class Main {
    public static void main(String[] args) {


        AsciiFileReader asciiFileReader=new AsciiFileReader();
        asciiFileReader.readAndProcessFile("src/main/resources/input.txt");
        System.out.printf("Done!");

    }
}