package C8_Streams_Files_And_Directories;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class C4_Neu {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        File file = new File ("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\output4.txt");
        FileWriter fileWriter = new FileWriter (file);
        List<String> text = Files.readAllLines (path);
        int glasni = 0;
        int salgasni = 0;
        int znaci  = 0;
        for (int i = 0; i < text.size (); i++) {
            for (int j = 0; j < text.get (i).length (); j++) {
                char cymbol = text.get (i).charAt (j);
                if(cymbol == ' '){
                    continue;
                }
                if(cymbol == 'a' || cymbol == 'u' || cymbol == 'i' || cymbol== 'o' || cymbol == 'e'){
                    glasni++;
                }else if(cymbol == '.' || cymbol == ',' || cymbol == '!' || cymbol == '?'){
                    znaci++;
                }else {
                    salgasni++;
                }
            }
        }fileWriter.write ("Vowels: " + glasni);
        fileWriter.write (System.lineSeparator ());
        fileWriter.write ("Consonants: " + salgasni);
        fileWriter.write (System.lineSeparator ());
        fileWriter.write ("Punctuation: " + znaci);
        fileWriter.close ();
    }
}
