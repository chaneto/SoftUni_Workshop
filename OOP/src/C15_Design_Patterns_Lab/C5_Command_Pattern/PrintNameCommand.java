package C15_Design_Patterns_Lab.C5_Command_Pattern;

public class PrintNameCommand implements Comand{

    @Override
    public void execute() {
        System.out.println ("Printing name");
    }
}
