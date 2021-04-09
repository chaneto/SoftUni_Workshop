package C14_Generics_EX.C2_Generic_Box_of_Integer;

import java.util.ArrayList;
import java.util.List;

public class GenericBox<T> {
   private List<T> value;

   public GenericBox(){
       this.value = new ArrayList<> ();
   }
   public void  add(T element){
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
