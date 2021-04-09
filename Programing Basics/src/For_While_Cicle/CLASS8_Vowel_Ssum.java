package For_While_Cicle;

import java.util.Scanner;

public class CLASS8_Vowel_Ssum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < p.length(); i++) {
            char a = p.charAt(i);
            switch (a){
                case 'a':
                    sum += 1;break;
                case 'e':
                    sum += 2;break;
                case 'i':
                    sum += 3;break;
                case 'o':
                    sum += 4;break;
                case 'u':
                    sum += 5;break;
            }

        }
        System.out.println(sum);
    }
}
