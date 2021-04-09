package ATECHMODUL.Data_Types_and_Variables_More;

import java.util.Scanner;

public class C6_Balanced_Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a = Byte.parseByte(scanner.nextLine());
        byte open = 0;
        byte close = 0;
        byte midl = 0;
        byte num = 0;
        for (int i = 0; i < a; i++) {
        String p = scanner.nextLine();
        if(p.equals("(")){
            open++;
        }if(p.equals(")")){
            close++;
            if(open == 0){
                midl++;
            }if(!(open == close)){
                num++;
                }
        }
        }
        if(open == close && midl == 0 && num == 0){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }

    }
}
