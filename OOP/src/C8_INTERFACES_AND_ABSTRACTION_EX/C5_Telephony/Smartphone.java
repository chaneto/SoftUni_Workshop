package C8_INTERFACES_AND_ABSTRACTION_EX.C5_Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        String out = "";
        for (int i = 0; i < this.urls.size (); i++) {
            int count = 0;
            for (int j = 0; j < this.urls.get (i).length (); j++) {
                if(Character.isDigit (this.urls.get (i).charAt (j))){
                    out += "Invalid URL!";
                    count++;
                    break;

                }
            }if(count == 0){
                out += String.format ("Browsing: %s!",this.urls.get (i));
            }out += System.lineSeparator ();
        }return out;
    }

    @Override
    public String call() {
        String out = "";
        for (int i = 0; i < this.numbers.size (); i++) {
            int count = 0;
            for (int j = 0; j < this.numbers.get (i).length (); j++) {
                if(Character.isLetter (this.numbers.get (i).charAt (j))){
                    out += "Invalid number!";
                    count++;
                    break;

                }
            }if(count == 0){
                out += String.format ("Calling... %s",this.numbers.get (i));
            }out += System.lineSeparator ();
        }return out;
    }
}
