package C8_Streams_Files_And_Directories;

import javafx.scene.shape.Path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class C1_Sum_Lines {
    public static void main(String[] args) throws IOException {
        try {
            List<String> in = Files.readAllLines(Paths.get("D:\\Advanced\\Streams-Files-and-Directories-Ex\\input.txt"));
            for(String out : in){
                int sum = 0;
                for (int i = 0; i < out.length(); i++) {
                    sum += out.charAt(i);
                }System.out.println(sum);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
