package C14_Generics_EX.C4_Generic_Swap_Method_Integers;

import java.util.ArrayList;
import java.util.List;

public class Swap_Int<T> {
        private List<T> list;

        public Swap_Int(){
            this.list = new ArrayList<> ();
        }
        public void  add(T element){
            this.list.add (element);
        }

        public void swap (int one, int two){
            T word1 = list.get (one);
            T word2 = list.get (two);
            this.list.add (one,word2);
            this.list.remove (one + 1);
            this.list.add (two, word1);
            this.list.remove (two + 1);
        }
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder ();
            for(T out : this.list){

                sb.append (String.format ("%s: %s",out.getClass ().getName (),out));
                sb.append (System.lineSeparator ());
            }
            return sb.toString ();
        }
}
