package While_Cicle_Ex;

import java.util.Scanner;

public class CLASS2_Old_Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while(capacity>counter){
            String input = scanner.nextLine();
            counter++;
            if(input.equalsIgnoreCase(book)){
            --counter;
            break;
            }
        }
        if(counter>=capacity)
        {System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",counter);
        }else {System.out.printf("You checked %d books and found it.",counter);}




    }
}
