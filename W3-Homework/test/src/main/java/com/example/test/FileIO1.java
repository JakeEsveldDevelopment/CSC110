package com.example.test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.lang.System.out;

public class FileIO1 {

    public static void main(String... args) throws IOException {
        var filename = "W3-Homework/test/src/main/java/com/example/test/data.txt";
        var filePath = Paths.get(filename);

        if(!Files.exists(filePath)){
            out.println("File cannot be found");
        }

        var reader = Files.newBufferedReader(filePath);
        String line = reader.readLine();
        int lineCount = 1;

        while(line != null){
            out.println(Integer.toString(lineCount) + " the data " + line.toUpperCase());
            lineCount++;
            line = reader.readLine();
        }
    }
}
