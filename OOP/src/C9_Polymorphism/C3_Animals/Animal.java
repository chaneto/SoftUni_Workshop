package C9_Polymorphism.C3_Animals;

public class Animal {
   private String name;
   private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }
    public String explainSelf(){
        return null;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }
}
