package C4_Multidimensional_Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class C9_Parking_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean[][] matrix = new boolean[a[0]][a[1]];
        int counter = 0;
        while (true) {
            String[] p = scanner.nextLine().split(" ");
            if (p[0].equals("stop")) {
                break;
            }
            int vhod = Integer.parseInt(p[0]);
            int red = Integer.parseInt(p[1]);
            int col = Integer.parseInt(p[2]);
            boolean yes = false;
            counter = Math.abs(vhod - red) + 1;
            if(!matrix[red][col]){
                matrix[red][col] = true;
                counter = counter + col;
                System.out.println(counter);
                counter = 0;
            }else if(matrix[red][col]){
                int left = col;
                int right = col;
                while (left > 1 || right < matrix[red].length - 1){
                    left--;
                    right++;
                    if(right >= matrix[red].length && left > 1 ){
                        right = matrix[red].length - 1;
                    }if(left <= 1 && right <= matrix[red].length - 1){
                        left = 1;
                    }
                    if(!matrix[red][left]){
                        matrix[red][left] = true;
                        counter = counter + left;
                        System.out.println(counter);
                        counter = 0;
                        yes = true;
                        break;
                    } if(!matrix[red][right]){
                        matrix[red][right] = true;
                        counter = counter + right;
                        System.out.println(counter);
                        counter = 0;
                        yes = true;
                        break;
                    }
                }if(!yes){
                    System.out.printf("Row %d full%n",red);
                    yes = false;
                }
            }
        }
    }
}
