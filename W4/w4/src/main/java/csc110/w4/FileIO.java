package csc110.w4;

import static java.lang.System.out;

import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.lang.StringBuilder;

import java.util.PriorityQueue;
import java.util.Queue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class FileIO {

    public static void main(String... args) throws IOException {
            String filename = "W4/w4/src/main/java/csc110/w4/Sample1000.csv";
            String outputFileName = "W4/w4/src/main/java/csc110/w4/data.txt";

            var outputFilePath = Paths.get(outputFileName);
            var filePath = Paths.get(filename);

            if(!Files.exists(filePath)){
                out.println("The File " + filename + " could not be found");
                return;
            }
            if(!Files.exists(outputFilePath)){
                out.println("The Output File " + outputFileName + " could not be found");
                return;
            }

            var reader = Files.newBufferedReader(filePath);
            var data = reader.readLine();
            var set = new TreeSet<User>();
            int setTime = 0;
            var list = new ArrayList<User>();
            int listTime = 0;
            data = reader.readLine();

            var start = System.currentTimeMillis();

            while(data != null){
                var ele = data.split(",");
                list.add(new User(
                    ele[0],
                    ele[1],
                    ele[2],
                    ele[3],
                    ele[4]
                ));
                data = reader.readLine();
            }
            var stop = System.currentTimeMillis();
            listTime += (stop - start);

            var reader2 = Files.newBufferedReader(filePath);
            data = reader2.readLine();

            start = System.currentTimeMillis();
            while(data != null){
                var ele = data.split(",");
                set.add(new User(
                    ele[0],
                    ele[1],
                    ele[2],
                    ele[3],
                    ele[4]
                ));
                data = reader2.readLine();
            }
            stop = System.currentTimeMillis();

            setTime += (stop - start);
            var writer = Files.newBufferedWriter(outputFilePath, StandardCharsets.UTF_8, StandardOpenOption.WRITE);

            start = System.currentTimeMillis();
            list.sort(Collections.reverseOrder());
            var builder = new StringBuilder();
            for(var user: list){
                builder.append(user.toString());
            }

            writer.write(builder.toString());
            stop = System.currentTimeMillis();

            listTime += (stop - start);

            start = System.currentTimeMillis();
            var builder2 = new StringBuilder();
            for(var user: set.descendingSet()){
                builder2.append(user.toString());
            }
            writer.write(builder2.toString());

            stop = System.currentTimeMillis();
            writer.close();
            setTime += (stop - start);

            out.println("List Time = " + String.valueOf(listTime));
            out.println("Set Time = " + String.valueOf(setTime));

            out.println("Average Times per entry");

            out.println("List = " + String.valueOf(
                Float.valueOf(listTime) / Float.valueOf(list.size())
            ));
            out.println("Set = " + String.valueOf(
                Float.valueOf(setTime) / Float.valueOf(set.size())
            ));


/*             var counter = 0;
            while(data != null && data.length() > 0){
                set.add(data);
                list.add(data);
                map.put(counter, data);
                counter += 1;
                data = reader.readLine();
            }

            var start = System.currentTimeMillis();
            for(var user: set){
                out.println(user);
            }
            var stop = System.currentTimeMillis();
            var setTime = stop - start;
            out.println("SET TIME ELAPSED = " + String.valueOf(setTime));


            start = System.currentTimeMillis();
            for(var user: list){
                out.println(user);
            }
            stop = System.currentTimeMillis();
            var listTime = stop - start;
            out.println("ARRAYLIST TIME ELAPSED = " + String.valueOf(listTime));


            start = System.currentTimeMillis();
            for(int i=0; i < counter; i++){
                out.println(map.get(i));
            }
            stop = System.currentTimeMillis();
            var mapTime = stop - start;
            out.println("HASHMAP TIME ELAPSED = " + String.valueOf(mapTime));

            out.println("TIME COMPARISONS");
            out.println("LIST TIME = " + listTime);
            out.println("SET TIME = " + setTime);
            out.println("MAP TIME = " + mapTime);
 */





/*                 stack.push(new User(elements[0].trim(),
                    elements[1].trim(),
                    elements[2].trim()));
                queue.add(new User(elements[0].trim(),
                    elements[1].trim(),
                    elements[2].trim())); */

/*             out.println("---------- NAMES ---------");
            for(var entry:list){
                out.println(entry.getName());
            }            
            
            out.println("---------- ADDRESSES ---------");
            for(var entry:list){
                out.println(entry.getAddress());
            }            
            
            out.println("---------- PHONES ---------");
            for(var entry:list){
                out.println(entry.getPhone());
            }

            out.println("-----------------------");

            out.println("---------- NAMES ---------");
            for(var entry:list){
                if(!entry.getName().startsWith("X")){
                    out.println(entry.getName());
                }
            }

            out.println("---------- STACK ----------");
            while(!stack.empty()){
                out.println(stack.pop().toString());
            }

            out.println("---------- QUEUE ----------");
            while(queue.peek() != null){
                out.println(queue.remove().toString());
            } */



           
/*            while(data != null){
                list.add("\n" + data);
                data = reader.readLine();
           }


           printData(list);

           for(String line: list){
               if(!line.trim().startsWith("X")){
                   out.println(line.trim());
               }
           } */
    }


/*     private static void printData(List<String> data){
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
    } */
}
