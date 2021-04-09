package ATECHMODUL.Regular_Expressions_Ex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3_SoftUni_Bar_Income {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>" +
                "[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$$");
        double sum = 0;
        while (true){
            String p = scanner.nextLine();
            if(p.equals("end of shift")){break;}
            Matcher matches = pattern.matcher(p);
           if(matches.find()){
               String name = matches.group("name");
               String product = matches.group("product");
               double price = Double.parseDouble(matches.group("price"));
               int bori = Integer.parseInt(matches.group("count"));
               System.out.printf("%s: %s - %.2f%n",name,product,price*bori);
               sum += bori * price;
           }
        }
        System.out.printf("Total income: %.2f",sum);
    }
}
