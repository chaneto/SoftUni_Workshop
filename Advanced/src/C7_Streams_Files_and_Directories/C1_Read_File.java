package C7_Streams_Files_and_Directories;
import java.io.*;
public class C1_Read_File {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream   inputStream = new FileInputStream(path);
        int redbyte = inputStream.read();
        while (redbyte >= 0){
            System.out.print(Integer.toBinaryString(redbyte) + " ");
            redbyte = inputStream.read();
        }
    }
}
