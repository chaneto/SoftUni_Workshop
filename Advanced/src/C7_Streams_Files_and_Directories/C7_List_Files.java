package C7_Streams_Files_and_Directories;

import java.io.File;

public class C7_List_Files {
    public static void main(String[] args) {
        File file = new File("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        File[] files = file.listFiles();
        for(File f : files){
            if(!f.isDirectory()){
                System.out.printf("%s: [%d]%n",f.getName(),f.length());
            }
        }
    }
}
