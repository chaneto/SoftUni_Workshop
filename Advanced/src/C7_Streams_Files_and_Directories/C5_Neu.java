package C7_Streams_Files_and_Directories;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class C5_Neu {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        List<String> text = Files.readAllLines (path);

        File file = new File ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt");
        FileWriter fileWriter = new FileWriter (file);
        for (int i = 0; i < text.size (); i++) {
            if(i%3 == 0){
                fileWriter.write (text.get (i));
                fileWriter.write(System.lineSeparator ());
            }
        }fileWriter.close ();
    }
}
