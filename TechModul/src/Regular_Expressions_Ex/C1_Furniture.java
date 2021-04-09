package ATECHMODUL.Regular_Expressions_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C1_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> product = new ArrayList<>();
        double sum = 0.0;
        Pattern pattern = Pattern.compile(">>(?<name>\\w+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<kolichestvo>[0-9])");
        while (true){
            String p = scanner.nextLine();
            if(p.equals("Purchase")){break;}
            Matcher matcher = pattern.matcher(p);
            if(matcher.find()){
                String name  = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int kolichestvo = Integer.parseInt(matcher.group("kolichestvo"));
                product.add(name);
                sum += price * kolichestvo;
            }
        }
        System.out.println("Bought furniture:");
        for(String out : product){
            System.out.println(out);
        }
        System.out.printf("Total money spend: %.2f",sum);
    }
}
