package C7_Streams_Files_and_Directories;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;

public class C3_Copy_Bytes1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

        byte[] bytes = Files.readAllBytes(file.toPath());

        Writer writer = new FileWriter("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt");

        for(byte b : bytes){
            String out = String.valueOf(b);
            if(b == 32){
                out = " ";
            }else if(b == 10){
                out = System.lineSeparator();
            }writer.write(out);
        }
    }
}
