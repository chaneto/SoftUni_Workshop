package C6_Inheritance_Ex.animals;

public class Kitten extends Cat{
    public Kitten(String name, int age) {
        super (name, age, "Female");
    }
    @Override
    public String produceSound(){
        return "Meow";
    }
}
