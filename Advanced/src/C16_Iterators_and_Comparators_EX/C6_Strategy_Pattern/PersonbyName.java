package C16_Iterators_and_Comparators_EX.C6_Strategy_Pattern;

import java.util.Comparator;

public class PersonbyName implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        int value = o1.getName ().length () - (o2.getName ().length ());
        if(value == 0){
            if(o1.getName ().toLowerCase ().charAt (0) > o2.getName ().toLowerCase ().charAt (0)){
                value = 1;
            }else {
                value = -1;
            }
        }return value;
    }
}
