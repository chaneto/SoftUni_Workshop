package EXAM1;

import java.util.Scanner;

public class C3_Football_Souvenir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String otbor = scanner.nextLine();
        String suvenir = scanner.nextLine();
        double broi = Double.parseDouble(scanner.nextLine());
        double total = 0;
        if(otbor.equals("Argentina")){
            if(suvenir.equals("flags")){
                total = broi * 3.25;
            }else if (suvenir.equals("caps")){
                total = broi * 7.20;
            }else if(suvenir.equals("posters")){
                total = broi * 5.10;
            }else if(suvenir.equals("stickers")){
                total = broi * 1.25;
            }
        }if(otbor.equals("Brazil")){
            if(suvenir.equals("flags")){
                total = broi * 4.20;
            }else if (suvenir.equals("caps")){
                total = broi * 8.50;
            }else if(suvenir.equals("posters")){
                total = broi * 5.35;
            }else if(suvenir.equals("stickers")){
                total = broi * 1.20;
            }
        }if(otbor.equals("Croatia")){
            if(suvenir.equals("flags")){
                total = broi * 2.75;
            }else if (suvenir.equals("caps")){
                total = broi * 6.90;
            }else if(suvenir.equals("posters")){
                total = broi * 4.95;
            }else if(suvenir.equals("stickers")){
                total = broi * 1.10;
            }
        }if(otbor.equals("Denmark")){
            if(suvenir.equals("flags")){
                total = broi * 3.10;
            }else if (suvenir.equals("caps")){
                total = broi * 6.50;
            }else if(suvenir.equals("posters")){
                total = broi * 4.80;
            }else if(suvenir.equals("stickers")){
                total = broi * 0.90;
            }
        }if(!(otbor.equals("Argentina") || otbor.equals("Brazil") || otbor.equals("Croatia") || otbor.equals("Denmark"))){
            System.out.println("Invalid country!");

        }if(!(suvenir.equals("flags") || suvenir.equals("caps") || suvenir.equals("posters") || suvenir.equals("stickers"))){
            System.out.println("Invalid stock!");

        }else if((otbor.equals("Argentina") || otbor.equals("Brazil") || otbor.equals("Croatia") || otbor.equals("Denmark")) &&
                (suvenir.equals("flags") || suvenir.equals("caps") || suvenir.equals("posters") || suvenir.equals("stickers")) ) {
            System.out.printf("Pepi bought %.0f %s of %s for %.2f lv.",broi,suvenir,otbor,total);
        }
    }
}
