package C6_Sets_And_Maps_Advanced_EX;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C5_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> phonebook = new HashMap<>();
        while (true){
            String[] input = scanner.nextLine().split("-");
            String name = input[0];
            if (name.equals("search")){
                break;
            }
            String number = input[1];
            if(!phonebook.containsKey(name)){
                phonebook.put(name,number);
            }else {
                phonebook.put(name,number);
            }
        }while (true){
            String name = scanner.nextLine();
            if(name.equals("stop")){break;}
            if(phonebook.containsKey(name)){
                System.out.printf("%s -> %s%n",name,phonebook.get(name));
            }else {
                System.out.printf("Contact %s does not exist.%n",name);
            }
        }
    }
}
