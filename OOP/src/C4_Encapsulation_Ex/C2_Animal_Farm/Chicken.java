package C4_Encapsulation_Ex.C2_Animal_Farm;

public class Chicken {
    private String name;
    private  int age;

    public Chicken(String name, int age) {
        setName (name);
        setAge (age);
    }
    public void setName(String name) {
        if( name == null || name.trim ().isEmpty () ){
            throw new IllegalArgumentException ("Name cannot be empty.");
        }else {
        this.name = name;
        }
    }
    public void setAge(int age) {
        if(age < 0 || age > 15){
            throw new IllegalArgumentException ("Age should be between 0 and 15.");
        }else {
        this.age = age;
        }
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double productPerDay (){
       return calculateProductPerDay ();
    }private double calculateProductPerDay(){
        if(getAge () < 6){
            return 2;
        }else if(getAge () < 12){
            return 1;
        }else {
            return 0.75;
        }

    }

    @Override
    public String toString() {
            return String.format ("Chicken Mara (age %d) can produce %.2f eggs per day.",getAge ()
                    ,Math.floor (calculateProductPerDay ()));
    }
}