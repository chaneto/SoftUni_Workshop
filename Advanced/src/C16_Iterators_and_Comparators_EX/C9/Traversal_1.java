package C16_Iterators_and_Comparators_EX.C9;

import java.util.Iterator;
import java.util.List;

public class Traversal_1 implements Iterable<Integer>{
    private List<Integer> list;

    public Traversal_1(List<Integer> list) {
        this.list = list;
    }
    public int size(){
      return  this.list.size ();

    }

    public void Add(int element){
        this.list.add (element);

    }
    public void Remove(int element){
        if(this.list.size () > 0){
            int index = 0;
            while (index < this.list.size ()){
               if(element == this.list.get (index)){
                   this.list.remove (index);
                   break;
               }index++;
            }
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer> () {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return this.index < list.size () ;
            }

            @Override
            public Integer next() {
                return list.get (this.index++);
            }
        };
    }
}
