package C7_Streams_Files_and_Directories;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C2_Write_to_File {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
       FileInputStream inputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(inputStream);
        StringBuilder bilder = new StringBuilder();
        String p = scanner.nextLine();
        while (p != null){
            bilder.append(p.replaceAll("[,.?!]",""))
            .append(System.lineSeparator());
            try{
            p = scanner.nextLine();
           }catch (NoSuchElementException ex){
                inputStream.close();
                break;
            }
        }
        String out = bilder.toString();
        OutputStream output = new FileOutputStream("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt");
        PrintWriter printWriter = new PrintWriter(output);
        printWriter.print(out);
        printWriter.flush();
    }
}
