package ATECHMODUL.Text_Processing_Ex;

import java.util.Scanner;

public class C7_String_Explosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        String out ="";
        int num = 0;
        int reserve = 0;
        for (int i = 0; i < p.length(); i++) {
            char vr = p.charAt(i);
           if(vr != '>'){
               out += vr;
           }else {
               out+=">";
               String chr ="";
                chr += p.charAt(i + 1);
                num = Integer.parseInt(chr);
                num = num + reserve;
               int counter = 0;
               for (int j = i + 1 ; j < p.length(); j++) {
                   counter++;
                   char b = p.charAt(j);
                   if(!Character.isLetterOrDigit(b)){
                       counter-=1;
                       break;
                   }
               }if(counter >= num){
                   i = i + num;
               }else {
                   i = i + counter;
                   reserve = num - counter;
               }
           }
        }
        System.out.println(out);
    }
}
