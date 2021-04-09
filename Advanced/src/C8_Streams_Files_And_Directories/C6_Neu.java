package C8_Streams_Files_And_Directories;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class C6_Neu {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Path path1 = Paths.get ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        File file = new File ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\output6.txt");
        FileWriter fileWriter = new FileWriter (file);
        List<String> text = Files.readAllLines (path);
        List<String> text1 = Files.readAllLines (path1);
        for (int i = 0; i < text.size (); i++) {
            String [] input= text.get (i).split (" ");
            for (int j = 0; j < input.length; j++) {
                String word = input[j];
                int counter = 0;
                for (int k = 0; k < text1.size (); k++) {
                    String[] output = text1.get (k).split (" ");
                    for (int l = 0; l < output.length; l++) {
                        String word1 = output[l];
                        if (word.equals (word1)) {
                            counter++;
                        }
                    }fileWriter.write (word + " - " + counter);
                    fileWriter.write (System.lineSeparator ());
                }
            }
        }
        fileWriter.close ();
    }
}
