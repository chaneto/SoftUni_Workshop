package C14_Generics_EX.C5_Generic_Count_Method_Strings;

import java.util.HashSet;
import java.util.Set;

public class Counter<T extends Comparable> {
    private Set<T> set;
    public Counter(){
        this.set = new HashSet<> ();
    }
    public void add(T element){
        this.set.add (element);
    }
    public int count(T element){
        int count = 0;
        for(T out : set){
            if(out.compareTo (element) > 0){
                count++;
            }
        }return count;
    }
}
