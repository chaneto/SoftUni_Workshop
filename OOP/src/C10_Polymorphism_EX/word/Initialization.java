package C10_Polymorphism_EX.word;

public class Initialization extends CommandImpl{

    public Initialization(StringBuilder text) {
        super (text);
    }


    public static CommandInterface buildCommandInterface(StringBuilder text) {
        return new Initialization (text);
    }
}
