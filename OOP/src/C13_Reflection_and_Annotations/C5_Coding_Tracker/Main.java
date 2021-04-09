package C13_Reflection_and_Annotations.C5_Coding_Tracker;

public class Main {
    @Author(name = "Gosho")
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor (Tracker.class);
    }
}
