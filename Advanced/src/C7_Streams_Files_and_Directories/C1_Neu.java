package C7_Streams_Files_and_Directories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C1_Neu {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

        File file = new File ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt");

        PrintWriter printWriter = new PrintWriter (file);

        byte[] bytes = Files.readAllBytes (path);
        for(byte out : bytes){
            printWriter.write (Integer.toBinaryString (out) + " ");
        }printWriter.flush ();

    }
}
