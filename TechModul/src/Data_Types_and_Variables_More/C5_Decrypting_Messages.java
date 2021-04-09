package ATECHMODUL.Data_Types_and_Variables_More;

import java.util.Scanner;

public class C5_Decrypting_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int numsymbol = Integer.parseInt(scanner.nextLine());
        String keysymbol = "";
        for (int i = 0; i < numsymbol ; i++) {
            char symbol = scanner.nextLine().charAt(0);
          symbol += key;
            keysymbol += symbol;

        }System.out.printf("%s",keysymbol);


    }
}
