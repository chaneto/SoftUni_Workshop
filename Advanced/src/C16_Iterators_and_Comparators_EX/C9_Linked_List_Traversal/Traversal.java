package C16_Iterators_and_Comparators_EX.C9_Linked_List_Traversal;

import java.util.Iterator;
import java.util.List;

public class Traversal implements Iterable<Integer> {
    public List<Integer> list;

    public Traversal(List<Integer> list) {
        this.list = list;
    }
    public Integer getSize(){
        int size = this.list.size ();
        return size;
    }
    public void Add(int element){
        this.list.add (element);
    }
    public void Remove(int element){
        for (int i = 0; i < this.list.size (); i++) {
            if(this.list.get (i) == element){
                this.list.remove (i);
                break;
            }
        }
    }

    public List<Integer> getList() {
        return list;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
