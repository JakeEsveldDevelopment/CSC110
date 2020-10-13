package com.example.test;

import static java.lang.System.out;
import java.nio.file.*;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO {

    public static void main(String... args) throws IOException {
        String filename = "W4-Homework/test/src/main/java/com/example/test/data.txt";


        var filePath = Paths.get(filename);
        if(!Files.exists(filePath)){
            out.println("The File " + filename + " could not be found");
            return;
        }

        var reader = Files.newBufferedReader(filePath);
        var data = reader.readLine();
        List<String> list = new ArrayList();
        
        while(data != null){
             list.add("\n" + data);
             data = reader.readLine();
        }


        printData(list);

        for(String line: list){
            if(!line.trim().startsWith("X")){
                out.println(line.trim());
            }
        }
 }


 private static void printData(List<String> data){
     String header = data.get(0);
     String[] headers = header.split(",");
     for(int i =0; i < headers.length; i++){
         out.println("----------" + headers[i] + "s ----------");
         for(int k=1;k<data.size();k++){
             String initial = data.get(k);
             String[] breakDown = initial.split(",");
             out.println(breakDown[i]);
         }
     }
 }
}
