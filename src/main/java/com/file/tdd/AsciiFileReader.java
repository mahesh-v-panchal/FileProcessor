package com.file.tdd;

import org.apache.commons.lang3.StringUtils;

import java.io.*;

public class AsciiFileReader {

    public boolean readAndProcessFile(String fileName) {

        boolean isFileProcessed = false;

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {

            if (StringUtils.isEmpty(fileName)) {
                return false;
            }

            File file = new File(fileName);

            if (!validateFile(file))
                return false;

            bufferedReader = new BufferedReader(new FileReader(file));
            bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

            while (bufferedReader.ready()) {
                bufferedWriter.write(new StringBuilder(bufferedReader.readLine()).reverse().toString());
            }

            bufferedWriter.flush();
            bufferedReader.close();
            bufferedWriter.close();

            isFileProcessed = true;
        } catch (Exception e) {
            isFileProcessed = false;
        }
        return isFileProcessed;
    }

    public boolean validateFile(File file) {

        boolean validFile = true;

        if (!file.exists())
            validFile = false;

        if (file.length() <= 0)
            validFile = false;

        if (!file.canRead())
            validFile = false;

        return validFile;
    }

}
