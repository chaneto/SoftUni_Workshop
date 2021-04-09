import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sushi = scanner.nextLine();
        String name  = scanner.nextLine();
        double porcii = Double.parseDouble(scanner.nextLine());
        String YorN = scanner.nextLine();
        double total = 0;
        if(sushi.equals("sashimi")){
            if(name.equals("Sushi Zone")){
                total += porcii * 4.99;
            }else if(name.equals("Sushi Time")){
                total += porcii * 5.49;
            }else if(name.equals("Sushi Bar")){
                total += porcii * 5.25;
            }else if(name.equals("Asian Pub")){
                total += porcii * 4.50;
            }
        }if(sushi.equals("maki")){
            if(name.equals("Sushi Zone")){
                total += porcii * 5.29;
            }else if(name.equals("Sushi Time")){
                total += porcii * 4.69;
            }else if(name.equals("Sushi Bar")){
                total += porcii * 5.55;
            }else if(name.equals("Asian Pub")){
                total += porcii * 4.80;
            }
        }if(sushi.equals("uramaki")){
            if(name.equals("Sushi Zone")){
                total += porcii * 5.99;
            }else if(name.equals("Sushi Time")){
                total += porcii * 4.49;
            }else if(name.equals("Sushi Bar")){
                total += porcii * 6.25;
            }else if(name.equals("Asian Pub")){
                total += porcii * 5.50;
            }
        }if(sushi.equals("temaki")){
            if(name.equals("Sushi Zone")){
                total += porcii * 4.29;
            }else if(name.equals("Sushi Time")){
                total += porcii * 5.19;
            }else if(name.equals("Sushi Bar")){
                total += porcii * 4.75;
            }else if(name.equals("Asian Pub")){
                total += porcii * 5.50;
            }
        }if(!(name.equals("Sushi Zone") || name.equals("Sushi Time") || name.equals("Sushi Bar") || name.equals("Asian Pub"))){
            System.out.printf("%s is invalid restaurant!",name);
        }if(YorN.equals("Y")){
            total = total + total * 0.20;
        }if(name.equals("Sushi Zone") || name.equals("Sushi Time") || name.equals("Sushi Bar") || name.equals("Asian Pub")){
        System.out.printf("Total price: %.0f lv.",Math.ceil(total));
        }
    }
}
