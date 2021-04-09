package C7_Streams_Files_and_Directories;

import java.io.*;
import java.util.Scanner;

public class C4_Extract_Integers {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter writer = new PrintWriter("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\output4.txt");
        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                int chisla = scanner.nextInt();
                writer.println(chisla);
            }else {
                scanner.next();
            }


        }writer.flush();


    }
}
