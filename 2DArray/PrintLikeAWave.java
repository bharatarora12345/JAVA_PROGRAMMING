package TwoDArray;

import java.util.Scanner;

public class PrintLikeAWave {

    public static int[][] input() {
        Scanner sc = new Scanner(System.in);
        int rac[] = new int[2];
        for (int i = 0; i < 2; i++) {
            rac[i] = sc.nextInt();
        }
        int row = rac[0];
        int col = rac[1];
        int ar[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        return ar;
    }

    public static int[] wavePrinting(int ar[][]) {
        int row = ar.length;
        int col = ar[0].length;
        int newar[] = new int[row * col];
        int k = 0;
        for (int i = 0; i < col; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < row; j++) {
                    newar[k] = ar[j][i];
                    k++;
                }
            }
            if (i % 2 != 0) {
                for (int j = (row - 1); j >= 0; j--) {
                    newar[k] = ar[j][i];
                    k++;
                }
            }
        }
        return newar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int ar[][] = input();
            int newar[] = wavePrinting(ar);
            for (int i = 0; i < newar.length; i++) {
                System.out.print(newar[i] + " ");
            }
        }
    }
}