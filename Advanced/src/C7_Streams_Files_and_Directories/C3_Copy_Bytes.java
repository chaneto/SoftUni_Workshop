package C7_Streams_Files_and_Directories;

import java.io.*;
import java.nio.file.Files;

public class C3_Copy_Bytes {
    public static void main(String[] args) throws IOException {
        File files = new File ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

        FileWriter fileWriter = new FileWriter ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt");

        byte[] bytes =  Files.readAllBytes (files.toPath ());
        for(byte out : bytes) {
            int sum = 0;
            if (out == 10) {
                System.out.println ();
                continue;
            }
            if (out == 32) {
                System.out.print ((char) ' ');
                continue;
            }System.out.print (out);
        }
    }
}
