package C16_Iterators_and_Comparators_EX.C6_Strategy_Pattern;

import java.util.Comparator;

public class PersonbyAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int value = o1.getAge () - o2.getAge ();
        return value;
    }
}
