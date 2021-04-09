package C7_Streams_Files_and_Directories;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class C6_Nue {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        List<String> readtext = Files.readAllLines (path).stream ()
                .sorted (String::compareTo)
                .collect(Collectors.toList());

        File file = new File ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt");
        FileWriter fileWriter = new FileWriter (file);

        for (int i = 0; i < readtext.size (); i++) {
            fileWriter.write (readtext.get (i));
            fileWriter.write (System.lineSeparator ());
        }fileWriter.close ();
    }
}
