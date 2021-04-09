package C8_Streams_Files_And_Directories;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C6_Word_Count {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\output6.txt");
        List<String> in = Files.readAllLines(Paths.get("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt"));
        String[] word = in.get(0).split(" ");
        List<String> text = Files.readAllLines(Paths.get("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt"));
        String[] tekst = text.get(0).split(" ");
        for(String f : word){
            int counter = 0;
            String output = f;
            for(String m : tekst){
                if(f.equals(m)){
                    counter++;
                }
            }writer.write (f + " - " + counter);
            writer.write (System.lineSeparator ());
        }


        writer.close();
    }
}
