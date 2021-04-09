package C8_Streams_Files_And_Directories;

import java.io.File;

public class C8_Get_Folder_Size {
    public static void main(String[] args) {
        File file = new File("D:\\Advanced\\1. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        File[] files = file.listFiles();
        int size = 0;
        for(File f : files){
            size += f.length ();

        }
        System.out.println (size);
    }
}
