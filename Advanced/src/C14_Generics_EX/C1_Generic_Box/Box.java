package C14_Generics_EX.C1_Generic_Box;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> value;

    public Box()
    {
        this.value = new ArrayList<> ();
    }
    public void add(T element){
        this.value.add (element);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder ();
        for(T out : this.value){

          sb.append (String.format ("%s: %s",out.getClass ().getName (),out));
          sb.append (System.lineSeparator ());
        }
        return sb.toString ();
    }
}
