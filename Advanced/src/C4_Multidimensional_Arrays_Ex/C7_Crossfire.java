package C4_Multidimensional_Arrays_Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C7_Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<List<Integer>> matrix = new ArrayList<>();
        int counter = 1;
        for (int i = 0; i < a[0]; i++) {
            List<Integer> num = new ArrayList<>();
            for (int j = 0; j < a[1]; j++) {
                num.add(counter);
                counter++;
            }matrix.add(num);
        }
        while (true){
            String p = scanner.nextLine();
            if(p.equals("Nuke it from orbit")){
                break;
            }String[] cmd = p.split(" ");
            int red = Integer.parseInt(cmd[0]);
            int col = Integer.parseInt(cmd[1]);
            int rad = Integer.parseInt(cmd[2]);
            int start = col - rad;
            int end = col + rad;

            for (int i = start; i <= end; i++) {
                if(red >= 0 && red < matrix.size() && i >= 0 && i < matrix.get(red).size()) {
                    matrix.get(red).set(i, 0);
                }

            }start = red - rad;
            end = red + rad;
            for (int i = start; i <= end; i++) {
                if(i >= 0 && i < matrix.size() && matrix.get(i).size() > col) {
                    matrix.get(i).set(col, 0);
                }

            }
            for (int i = 0; i < matrix.size(); i++) {
                for (int j = 0; j < matrix.get(i).size(); j++) {
                    if (matrix.get(i).get(j) == 0) {
                        matrix.get(i).remove(j);
                        j--;
                    }
                }

            }
        }
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
