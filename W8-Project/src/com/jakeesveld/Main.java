package com.jakeesveld;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    
    
    
    public static void main(String[] args) throws IOException {
        String fileName = "src/com/jakeesveld/Sample500.csv";
        String goodFile = "src/com/jakeesveld/GoodData.txt";
        String badFile = "src/com/jakeesveld/BadData.txt";

        Path filePath = Paths.get(fileName);
        Path goodPath = Paths.get(goodFile);
        Path badPath = Paths.get(badFile);

        if(!Files.exists(filePath)){
            System.out.println("File at path " + fileName + " could not be found");
            return;
        }
        if(!Files.exists(goodPath)){
            System.out.println("File at path " + goodFile + " could not be found");
            return;
        }
        if(!Files.exists(badPath)){
            System.out.println("File at path " + badFile + " could not be found");
            return;
        }

        var reader = Files.newBufferedReader(filePath);
        var badWriter = Files.newBufferedWriter(badPath);
        var goodWriter = Files.newBufferedWriter(goodPath);
        var data = reader.readLine();
        var tree = new TreeSet<User>();
        data = reader.readLine();
        var counter = 1;
        while(data != null){
            var ele = data.split(",", 8);
            boolean badData = Arrays.asList(ele).contains("") || Arrays.asList(ele).contains(null);
            var user = new User(ele[0], ele[1], ele[2], ele[3], ele[4], ele[5], ele[6], ele[7]);
            if(badData){
                writeBadData(badWriter, user, counter);
            }else{
                tree.add(user);
            }
            data = reader.readLine();
            counter += 1;
        }

        for (var userData:tree) {
            goodWriter.append(userData.toString());
            goodWriter.newLine();
        }

        goodWriter.close();
        badWriter.close();
        reader.close();
    }

    private static void writeBadData(BufferedWriter writer, User user, int counter) throws IOException {
        writer.append("Line " + counter + " Row " + user.getBadLine());
        writer.newLine();
    }
}
