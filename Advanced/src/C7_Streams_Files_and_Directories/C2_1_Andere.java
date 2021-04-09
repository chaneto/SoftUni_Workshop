package C7_Streams_Files_and_Directories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class C2_1_Andere {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

        File files = new File ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt");

        PrintWriter printWriter = new PrintWriter (files);

        byte[] bytes = Files.readAllBytes (path);
        for(byte out : bytes){
            if(out != ',' && out != '.' && out != '?' && out != '!'){
                printWriter.write (out);
            }
        }printWriter.close ();
    }
}
