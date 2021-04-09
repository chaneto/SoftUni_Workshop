package C11_solidLab.p05_DependencyInversion.p01_HelloWord;

public class Main {
    public static void main(String[] args) {
        HelloWorld stoqn = new HelloWorld ();
        System.out.println (stoqn.greeting ("Stoyan"));
    }
}
