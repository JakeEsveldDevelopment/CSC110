package csc110.w3;

import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;



public class FileIO {

    public static void main(String... args)  throws IOException{ 
        var fileName = "W3/w3/src/main/java/csc110/w3/data.txt";        
        // it is agood habit to check if the file can be found programetically        
        var filePath = Paths.get(fileName);        
        if(!Files.exists(filePath)){            
            System.out.println("The File "+ fileName + " Could not be found");        
        }        
        var readStream = Files.newBufferedReader(filePath);        
        var data = readStream.readLine();        
        System.out.println("The data: \n  "+ data);  
        data = readStream.readLine();
        while(data != null){
            System.out.println(data);
            data = readStream.readLine();
        }  
    }
}
