package com.example.test;

import java.io.InputStream;
import java.io.InputStreamReader;

import sun.nio.cs.UTF_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import static java.lang.System.out;

public class FileIO {

    public static void main(String... args) {
        File f = new File("file.txt");


        try{
            StringBuilder b = new StringBuilder();
            b.append("VS Code is for C++");
            b.append("\n.");
            b.append("\n.");
            b.append("\n.");
            b.append("\nNot Java");
            
            String fileWrite = b.toString();
            FileWrite(f, fileWrite);

        }catch(IOException e){
            out.println("IO Exception happened writing file.");
            out.println(e);
        }

        try{
            String fileContent = FileRead(f);
            out.println(fileContent);

        }catch(IOException e){
            out.println("IO Exception happened reading file.");
            out.println(e);
        }


     }


    private static String FileRead(File f) throws IOException{
        StringBuilder outputTextBuilder = new StringBuilder();
        InputStream stream = new FileInputStream(f);
        InputStreamReader inputStreamReader = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = reader.readLine();
        while(line != null){
            outputTextBuilder.append(line);
            outputTextBuilder.append("\n");
            line = reader.readLine();
        }
        reader.close();

        return outputTextBuilder.toString();
    }

    private static void FileWrite(File f, String s) throws IOException{
        FileWriter writer = new FileWriter(f);
        writer.write(s);
        writer.close();

    }

}
