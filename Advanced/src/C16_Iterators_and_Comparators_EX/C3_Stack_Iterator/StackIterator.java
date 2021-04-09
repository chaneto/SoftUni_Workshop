package C16_Iterators_and_Comparators_EX.C3_Stack_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StackIterator<T> {
    private List<T> stack;
    private int index;

    public StackIterator(List<T> list){
        this.stack = list;
        this.index = this.stack.size () - 1;
    }
    public void push(T element){
        this.stack.add (element);
        index++;
    }
    public void pop(){
        if(index >= 0){
        this.stack.remove (index);
        index--;
        }else {
            System.out.println ("No elements");
        }
    }
    public void print() {
        if (index >= 0) {
            for (int i = 0; i < 2; i++) {
                int rr = index;
                while (rr >= 0) {
                    System.out.println (stack.get (rr));
                    rr--;
                }
            }
        }
    }

}
