package C6_Inheritance_Ex.animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName (name);
        setAge (age);
        setGender (gender);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(!name.equals ("") || !name.trim ().isEmpty ()){
            this.name = name;
        }else {
            throw new IllegalArgumentException ("Invalid input!");
        }

    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }else {
            throw new IllegalArgumentException ("Invalid input!");
        }
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        if(gender.equals ("Male") || gender.equals ("Female")){
            this.gender = gender;
        }else {
            throw new IllegalArgumentException ("Invalid input!");
        }
    }public String produceSound(){
        return "";
    }

    @Override
    public String toString() {
        return String.format ("%s%n%s %s %s%n%s",this.getClass ().getSimpleName (),this.name,this.age,this.gender,this.produceSound ());
    }
}
