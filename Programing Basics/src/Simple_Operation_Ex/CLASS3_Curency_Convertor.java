package Simple_Operation_Ex;

import java.util.Scanner;

public class CLASS3_Curency_Convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        String vhod = scanner.nextLine();
        String izhod = scanner.nextLine();
        if(vhod.equals("USD")){sum=sum*1.79549;
        }else if(vhod.equals("GBP")){sum=sum*2.53405;
        }else if(vhod.equals("EUR")){sum=sum*1.95583;}
        if(izhod.equals("USD")) {sum=sum/1.79549;
        }else if(izhod.equals("GBP")){sum=sum/2.53405;
        }else if(izhod.equals("EUR")){sum=sum/1.95583;}
        System.out.printf("%.2f %s",sum, izhod);

        }

    }

