package C8_INTERFACES_AND_ABSTRACTION_EX.C4_Food_Shortage;

public class Citizen implements Person,Identifiable, Buyer{
   private String name;
   private int age;
   private String id;
   private String birthDate;
   private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public String getId() {
        return id;
    }
}