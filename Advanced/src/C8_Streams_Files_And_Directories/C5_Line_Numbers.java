package C8_Streams_Files_And_Directories;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class C5_Line_Numbers {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");
        File file = new File ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\output5.txt");
        FileWriter fileWriter = new FileWriter (file);
        List<String> text = Files.readAllLines (path);
        int counter = 0;
        for (int i = 0; i < text.size (); i++) {
            counter++;
            fileWriter.write (counter + ". " + text.get (i));
            fileWriter.write (System.lineSeparator ());
        }
        fileWriter.close ();
    }
}
