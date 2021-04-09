package C7_Streams_Files_and_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class C2_Neuu {
    public static void main(String[] args) throws IOException {
        String input = "D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream (input);
        String output = "D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";
        FileOutputStream outputStream = new FileOutputStream (output);
        Scanner scanner = new Scanner (inputStream);
        String table = ",.!?";
        while (scanner.hasNext ()) {
            String readtext = scanner.nextLine ();
            for (int i = 0; i < readtext.length (); i++) {
                char symbol = readtext.charAt (i);
                if(!table.contains (String.valueOf (symbol))){
                    outputStream.write (symbol);
                }
            }
            outputStream.write ('\n');
        }

    }

}

