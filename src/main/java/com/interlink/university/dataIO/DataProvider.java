package com.interlink.university.dataIO;

import java.io.*;

public class DataProvider {
    private BufferedReader reader;

    public DataProvider() {
        try {
            reader = new BufferedReader(new FileReader(new File("src/main/resources/data.txt")));
        } catch(IOException e) {
            System.out.println("DataProvider file not found Error");
            e.printStackTrace();
        }
    }

    public String read() {
        String line = null;
        try {
            while (reader.ready()) {
                line += reader.readLine();

            }
            reader.close();
        } catch(IOException e) {
            System.out.println("DataProvider read file Error");
            e.printStackTrace();
        }
        return line;
    }
}
