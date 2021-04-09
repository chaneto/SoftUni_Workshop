package C7_Streams_Files_and_Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class C6_Sort_Lines {
    public static void main(String[] args) throws IOException {
        List<String> out = Files.readAllLines(Paths.get("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt"))
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        Files.write(Paths.get("D:\\Advanced\\Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt"),out);
    }
}
