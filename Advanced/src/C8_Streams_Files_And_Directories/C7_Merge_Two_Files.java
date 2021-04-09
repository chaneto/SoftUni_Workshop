package C8_Streams_Files_And_Directories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class C7_Merge_Two_Files {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path path1 = Paths.get ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
        File file = new File ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\output7.txt");
        FileWriter fileWriter = new FileWriter (file);
        byte[] bytes = Files.readAllBytes (path);
        byte[] bytes1 = Files.readAllBytes (path1);
        for(byte out : bytes){
            fileWriter.write (out);
        }fileWriter.write (System.lineSeparator ());
        for(byte out : bytes1){
            fileWriter.write (out);

        }fileWriter.close ();

    }
}
