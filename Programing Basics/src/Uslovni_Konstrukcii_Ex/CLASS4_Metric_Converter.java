package Uslovni_Konstrukcii_Ex;

import java.util.Scanner;

public class CLASS4_Metric_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String vhod = scanner.nextLine();
        String izhod = scanner.nextLine();

            if(vhod.equals("mm")) {a = a/1000;}
            else if(vhod.equals("cm")){a=a/100;}
            else if(vhod.equals("mi")){a=a/0.000621371192;}
            else if(vhod.equals("in")){a=a/39.3700787;}
            else if(vhod.equals("km")){a=a/0.001;}
            else if(vhod.equals("ft")){a=a/3.2808399;}
            else if(vhod.equals("yd")){a=a/1.0936133;}

                if(izhod.equals("mm")) {a = a*1000;}
                else if(izhod.equals("cm")){a=a*100;}
                else if(izhod.equals("mi")){a=a*0.000621371192;}
                else if(izhod.equals("in")){a=a*39.3700787;}
                else if(izhod.equals("km")){a=a*0.001;}
                else if(izhod.equals("ft")){a=a*3.2808399;}
                else if(izhod.equals("yd")){a=a*1.0936133;}
        System.out.printf("%.8f",a);


    }
}
