package C14_Generics_EX.C8_Custom_List_Sorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomListSorter<T extends Comparable> {
    private List<T> list;
    public CustomListSorter(){
        this.list = new ArrayList<> ();
    }
    public void add(T element){
        this.list.add (element);
    }
    public List<T>  pppp(){
return null;
    }
    public void remove(T element){
        this.list.remove (element);
    }
    public boolean contains(T element){
        if(list.contains (element)){
            return true;
        }return false;
    }
    public void swap (int one, int two){
        T word1 = list.get (one);
        T word2 = list.get (two);
        this.list.add (one,word2);
        this.list.remove (one + 1);
        this.list.add (two, word1);
        this.list.remove (two + 1);
    }
    public int count(T element){
        int count = 0;
        for(T out : this.list){
            if(out.compareTo (element) > 0){
                count++;
            }
        }return count;
    }
    public T getMax(){
        T count = list.get (0);
        for(T out : this.list){
            if(out.compareTo (count) > 0){
                count = out;
            }
        }return count;
    }
    public T getMin(){
        T count = list.get (0);
        for(T out : this.list){
            if(out.compareTo (count) < 0){
                count = out;
            }
        }return count;
    }

    public void Print(){ {

            list.stream ().forEach (f -> System.out.println (f));
        }
    }public boolean Empti(List<T> customlist){
        if(customlist.isEmpty ()){
            return true;
        }
        return false;
    }public void sorted(){
        Collections.sort (this.list);
    }

}
