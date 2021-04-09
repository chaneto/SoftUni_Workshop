package C8_Streams_Files_And_Directories;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class C4_Count_Character_Types {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("D:\\Advanced\\Streams-Files-and-Directories-Ex\\output4.txt");
        int glasni = 0;
        int saglasni = 0;
        int znaci = 0;
        String Vowels = "Vowels: ";
        String Consonants = "Consonants: ";
        String Punctuation = "Punctuation: ";
        try {
            List<String> in = Files.readAllLines(Paths.get("D:\\Advanced\\Streams-Files-and-Directories-Ex\\input.txt"));
            for(String out : in){
                String wort = out;
                for (int i = 0; i < wort.length(); i++) {
                    char bukva  = wort.charAt(i);
                    if(bukva == ' '){continue;}
                    if(bukva == '.' || bukva == ',' || bukva == '!' || bukva == '?'){
                        znaci++;
                    }else if(bukva == 'a' || bukva == 'e' || bukva == 'i' || bukva == 'o' || bukva == 'u'){
                        glasni++;
                    }else {
                        saglasni++;
                    }

                }
            }writer.write(Vowels+=glasni);
            writer.write(System.lineSeparator());
            writer.write(Consonants+=saglasni);
            writer.write(System.lineSeparator());
            writer.write(Punctuation+=znaci);

        }catch (IOException e) {
            e.printStackTrace();
        }writer.close();
    }
}
