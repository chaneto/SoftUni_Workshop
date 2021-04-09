package C14_Generics_EX.C7_Custom_List;

import java.util.ArrayList;
import java.util.List;

public class Customlist<T extends Comparable> {
    private List<T> list;
    public Customlist(){
        this.list = new ArrayList<> ();
    }
    public void add(T element){
        this.list.add (element);
    }
    public T remove(int index){
        Empti (this.list);
        validation (index);
      return this.list.remove (index);
    }
    public boolean contains(T element){
        if(list.contains (element)){
            return true;
        }return false;
    }
    public void swap (int one, int two){
        validation (one);
        validation (two);
        T word1 = list.get (one);
        T word2 = list.get (two);
        this.list.add (one,word2);
        this.list.remove (one + 1);
        this.list.add (two, word1);
        this.list.remove (two + 1);
    }
    public int countGreaterThan(T element){
        Empti (this.list);
        int count = 0;
        for(T out : this.list){
            if(out.compareTo (element) > 0){
                count++;
            }
        }return count;
    }
    public T getMax(){
        Empti (this.list);
        T count = list.get (0);
        for(T out : this.list){
            if(out.compareTo (count) > 0){
                count = out;
            }
        }return count;
    }
    public T getMin(){
        Empti (this.list);
        T count = list.get (0);
        for(T out : this.list){
            if(out.compareTo (count) < 0){
                count = out;
            }
        }return count;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder ();
        for(T out : this.list){

            sb.append (String.format ("%s%n",out));
        }
        return sb.toString ();
    }public void Empti(List<T> customlist){
        if(customlist.isEmpty ()){
            throw new IndexOutOfBoundsException ("eror");
        }
    }public void validation(int index){
        if(index < 0 || index >= this.list.size ()){
            throw new IndexOutOfBoundsException ("eror");
        }
    }
}
