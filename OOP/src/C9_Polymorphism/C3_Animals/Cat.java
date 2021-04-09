package C9_Polymorphism.C3_Animals;

public class Cat extends Animal{

    public Cat(String name, String favouriteFood) {
        super (name, favouriteFood);
    }
    public String explainSelf(){
        return String.format ("I am %s and my favourite food is %s%nMEEOW",getName (),getFavouriteFood ());
    }
}
