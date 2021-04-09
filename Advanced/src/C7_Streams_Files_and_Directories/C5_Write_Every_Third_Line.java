package C7_Streams_Files_and_Directories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class C5_Write_Every_Third_Line {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("D:\\Advanced\\Streams-Files-and-Directories-Lab\\" +
                "05.WriteEveryThirdLineOutput.txt");
        int counter = 0;
            List<String> in = Files.readAllLines(Paths.get("D:\\Advanced\\Streams-Files-and-Directories-Lab\\input.txt"));
            for(String out : in){
                counter++;
                if(counter %3 == 0){
                    writer.write(out);
                    writer.write(System.lineSeparator());
                }
            }writer.close();
    }
}
