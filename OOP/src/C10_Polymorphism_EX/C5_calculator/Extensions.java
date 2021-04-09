package C10_Polymorphism_EX.C5_calculator;

public class Extensions {

    public static InputInterpreter buildInterpreter(CalculationEngine engine)
    {

        return new InputInterpreter (engine);
    }

}
