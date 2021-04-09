package C4_Multidimensional_Arrays_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C6_String_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        List<String> in = new ArrayList<>();
        int rol = 0;
        int col = 0;
        String[][] matrix = new String[rol][col];
        int num = 0;
        String replase = "";
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(p);
        if(matcher.find()){
            num = Integer.parseInt(matcher.group());

        }
        if(num >= 360){
            num = num % 360;
            replase += num;
            p = p.replaceAll(matcher.group(),replase);
        }

        if(p.equals("Rotate(0)")){
            String vhod = scanner.nextLine();
            while (!vhod.equals("END")){
                rol++;
                if(vhod.length() > col){
                    col = vhod.length();
                }in.add(vhod);
                vhod = scanner.nextLine();
            } matrix = new String[rol][col];

            full(rol,col,in,matrix);
            R0(matrix,rol,col);

        } if(p.equals("Rotate(90)")){
            String vhod = scanner.nextLine();
            while (!vhod.equals("END")){
                rol++;
                if(vhod.length() > col){
                    col = vhod.length();
                }in.add(vhod);
                vhod = scanner.nextLine();
            } matrix = new String[rol][col];

            full(rol,col,in,matrix);
            R90(matrix,rol,col);

        }if(p.equals("Rotate(180)")){
            String vhod = scanner.nextLine();
            while (!vhod.equals("END")){
                rol++;
                if(vhod.length() > col){
                    col = vhod.length();
                }in.add(vhod);
                vhod = scanner.nextLine();
            } matrix = new String[rol][col];

            full(rol,col,in,matrix);
            R180(matrix,rol,col);

        }if(p.equals("Rotate(270)")){
            String vhod = scanner.nextLine();
            while (!vhod.equals("END")){
                rol++;
                if(vhod.length() > col){
                    col = vhod.length();
                }in.add(vhod);
                vhod = scanner.nextLine();
            } matrix = new String[rol][col];

            full(rol,col,in,matrix);
            R270(matrix,rol,col);

        }
    }

    private static void R270(String[][] matrix, int rol, int col) {
        int colona = col - 1;
        while (colona >= 0){//270
            int red = 0;
            while (red < rol){
                System.out.print(matrix[red][colona]);
                red++;
            }colona--;
            System.out.println();
        }
    }

    private static void R180(String[][] matrix, int rol, int col) {
        for (int i = rol - 1; i >= 0 ; i--) {//180
            for (int j = col - 1; j >= 0 ; j--) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void R90(String[][] matrix, int rol, int col) {
        int colona = 0;
        while (colona < col){//90
            int red = rol - 1;
            while (red >= 0){
                System.out.print(matrix[red][colona]);
                red--;
            }colona++;
            System.out.println();

        }
    }

    public static void full(int rol, int col, List<String> in, String[][] matrix) {
        for (int i = 0; i < in.size(); i++) {
            String vr = in.get(i);
            int yyy = vr.length();
            if(vr.length() < col){
                for (int j = 0; j < col - yyy; j++) {
                    vr+=" ";
                }
            }in.remove(i);
            in.add(i,vr);
        }
        for (int i = 0; i < rol; i++) {
            String vr = in.get(i);
            String chr = "";
            for (int j = 0; j < col; j++) {
                chr += vr.charAt(j);
                matrix[i][j] = chr;
                chr = "";
            }
        }
    }public static void R0(String[][] matrix,int rol,int col){
        for (int i = 0; i < rol; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
