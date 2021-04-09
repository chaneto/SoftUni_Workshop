package C15_Design_Patterns_Lab.C3_Clone_Pattern;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair (15, 17, "Green");
        Chair cloniran = chair.clone ();
        Chair cloniran1 = chair.clone1 ();
        System.out.println ();

    }
}
