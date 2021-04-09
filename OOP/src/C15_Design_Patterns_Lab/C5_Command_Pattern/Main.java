package C15_Design_Patterns_Lab.C5_Command_Pattern;

public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker ();
        invoker.invoke ("PrintRandomNumber");
        invoker.invoke ("PrintNameCommand");
    }
}
