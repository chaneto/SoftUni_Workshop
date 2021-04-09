package C7_Streams_Files_and_Directories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class C8_Nested_Folders {
    public static void main(String[] args) {
        File file = new File ("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        Deque<File> deque = new ArrayDeque<> ();
        deque.offer (file);
        System.out.println (file.getName ());
        int counter = 1;
        while (!deque.isEmpty ()){
            File one = deque.poll ();
            File[] files = one.listFiles ();
            for(File out: files){
                if(out.isDirectory ()){
                    deque.offer (out);
                    System.out.println (out.getName ());
                    counter++;

                }
            }
        }
        System.out.println (counter + " folders");
    }
}
