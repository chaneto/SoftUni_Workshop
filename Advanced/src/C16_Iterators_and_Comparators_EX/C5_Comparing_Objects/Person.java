package C16_Iterators_and_Comparators_EX.C5_Comparing_Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }


    @Override
    public int compareTo(Person o) {
        int value = this.name.compareTo (o.name);
        if(value == 0){
            value = this.age - o.age;
            if(value == 0){
                value = this.town.compareTo (this.town);
            }
        }return value;
    }
}
