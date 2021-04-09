package C8_Streams_Files_And_Directories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class C3_ALL_CAPITALS {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        File file = new File ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\output3.txt");
        FileWriter fileWriter = new FileWriter (file);
        List<String> text = Files.readAllLines (path);
        for(String out : text){
            fileWriter.write (out.toUpperCase ());
            fileWriter.write (System.lineSeparator ());
        }fileWriter.close ();
    }
}
