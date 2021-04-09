package C16_Iterators_and_Comparators_EX.C7_Equality_Logic;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        int resulr = this.name.compareTo (other.name);
        if(resulr == 0){
            resulr = this.age - other.age;
        }return resulr;
    }

    @Override
    public int hashCode() {
        return 17 * (this.name.hashCode () + Integer.hashCode (this.age));
    }

    @Override
    public boolean equals(Object obj) {
        Person other = (Person)obj;
        return this.name.equals (other.name) && this.age == other.age;
    }
}
