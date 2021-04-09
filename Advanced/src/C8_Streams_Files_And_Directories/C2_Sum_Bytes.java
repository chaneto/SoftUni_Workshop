package C8_Streams_Files_And_Directories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class C2_Sum_Bytes {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> text = Files.readAllLines (path);
        int sum = 0;
        for(String out : text){
            for (int i = 0; i < out.length (); i++) {
                sum += out.charAt (i);
            }
        }
        System.out.println (sum);

    }
}
