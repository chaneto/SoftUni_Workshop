package C6_Inheritance_Ex.animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) {

        super (name, age, gender);
    }
    public String produceSound(){
        return String.format ("Woof!");
    }
}
