package C16_Iterators_and_Comparators_EX.C2_Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    private List<String> data;
    private int index;

    public Collection (List<String> data) {
        this.data = data;
        if (data.size () != 0) {
            index = 0;
        } else {
            index = -1;
        }
    }

    public boolean move() {
        if (this.index < this.data.size () - 1) {
            this.index++;
            return true;
        }
        return false;
    }

    public String Print() {
        if (this.index == -1) {
            return "Invalid Operation!";
        } else {
            return this.data.get (this.index);
        }
    }  public boolean HasNext() {
        if (this.index < this.data.size () - 1) {
            return true;
        }
        return false;
    }public void PrintAll(){
        List<String> output = new ArrayList<> ();
        if(this.index == -1){
            System.out.println ("Invalid Operation!");
        }else {
            for (int i = 0; i < this.data.size (); i++) {
                System.out.print (this.data.get (i) + " ");
            }
            System.out.println ();
        }
    }
}
