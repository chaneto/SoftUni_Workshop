package C3_Multidimensional_Arrays;

import java.util.Scanner;

public class C7_Find_The_Real_Queen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int red = 0;
        int col = 0;
        String[][] in = new String[8][8];
        for (int i = 0; i < 8; i++) {
            String[] p = scanner.nextLine().split(" ");
            for (int j = 0; j < 8; j++) {
                in[i][j] = p[j];
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(in[i][j].equals("q")){
                    boolean yes = true;
                    int counter = 0;
                    for (int k = 0; k < 8; k++) {
                        if (in[i][k].equals("q")) {
                            counter++;
                            if(counter > 1){
                            yes = false;
                            break;}
                        }
                    }if(!yes){
                        break;
                    }else {
                        counter = 0;
                        for (int k = 0; k < 8; k++) {
                            if (in[k][j].equals("q")) {
                                counter++;
                                if(counter > 1){
                                yes = false;
                                break;
                                }
                            }
                        }
                    }
                    if(!yes){
                        break;
                    }else {
                        red = i - 1;
                        col = j - 1;
                        while (red >= 0 && col >= 0) {
                            if (in[red][col].equals("q")) {
                                yes = false;
                                break;
                            }
                            red--;
                            col--;
                        }
                    }if(!yes){
                        break;
                    }else {
                        red = i + 1;
                        col = j + 1;
                        while (red < 8 && col < 8){
                            if(in[red][col].equals("q")){
                                yes = false;
                                break;
                            }red++;
                            col++;
                        }
                    }if(!yes){
                        break;
                    }else {
                        red = i + 1;
                        col = j - 1;
                        while (red < 8 && col >= 0){
                            if(in[red][col].equals("q")){
                                yes = false;
                                break;
                            }red++;
                            col--;
                        }
                    }if(!yes){
                        break;
                    }else {
                        red = i - 1;
                        col = j + 1;
                        while (red >= 0 && col < 8){
                            if(in[red][col].equals("q")){
                                yes = false;
                                break;
                            }red--;
                            col++;
                        }
                    }if(!yes){
                        break;
                    }else {
                        red = i;
                        col = j;
                        System.out.println(red + " " + col);
                        return;
                    }
                }
            }
        }

    }
}
