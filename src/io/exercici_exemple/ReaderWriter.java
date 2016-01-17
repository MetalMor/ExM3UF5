package io.exercici_exemple;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mor
 * 150116
 */
public class ReaderWriter {
    
    private static final String RW_ERROR = "Error amb els fitxers :(";
    private static final String IN_FILE = "in.txt";
    private static final String OUT_FILE = "out.txt";
    
    public static void main(String[] args) {

        try (FileReader fr = new FileReader(IN_FILE);
                FileWriter fw = new FileWriter(OUT_FILE);
                ) {
            
            BufferedReader inputStream = new BufferedReader(fr);
            PrintWriter outputStream = new PrintWriter(fw);
            
            String l;
            while ((l = inputStream.readLine()) != null) { // readline() lee hasta el siguiente carriage return
                System.out.println(l);
                outputStream.println(l);
            }
            
            if (inputStream != null)
                inputStream.close();
            
            if (outputStream != null)
                outputStream.close();
            
        } catch (IOException ioEx) {
            
            System.out.println(RW_ERROR);
            ioEx.printStackTrace();
            
        }
        
    }
    
}
