package TwoDArray;

import java.util.Scanner;

public class RowWishSum {
    public static int[][] inputs(){
        Scanner sc = new Scanner(System.in);
        int rac[] = new int[2];
        for (int i = 0; i < 2; i++) {
            rac[i] = sc.nextInt();
        }
        int row = rac[0];
        int col = rac[1];
        int ar[][] = new int[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        return ar;
    }
    public static void RowWishSum(int ar[][]){
        int row = ar.length;
        int col = ar[0].length;
        for (int i = 0; i < row; i++) {
            int sum=0;
            for (int j = 0; j < col; j++) {
                sum+=ar[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }
    public static void colWiseSum(int  ar[][]){
        int row = ar.length;
        int col = ar[0].length;
        int lar = 0;
        int colNo = 0;
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum= sum +  ar[j][i];
                if (sum  > lar){
                    lar = sum;
                    colNo  = i;
                }
            }
            System.out.println(sum);
        }
        System.out.println("Highest colsum is:" + lar);
        System.out.println("Highest colsum num:" + colNo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int ar[][]  = inputs();
            RowWishSum(ar);
            colWiseSum(ar);
//            int rac[] = new int[2];
//            for (int i = 0; i < 2; i++) {
//                rac[i] = sc.nextInt();
//            }
//            int row = rac[0];
//            int col = rac[1];
//            int ar[][] = new int[row][col];
//            for (int i = 0; i <row ; i++) {
//                for (int j = 0; j < col; j++) {
//                    ar[i][j] = sc.nextInt();
//                }
//            }
////            int ar[][] = inputs();
//            for (int i = 0; i < row; i++) {
//                int sum = 0;
//                for (int j = 0; j < col; j++) {
//                    sum += ar[i][j];
//                }
//                System.out.print(sum + " ");
//            }
//            System.out.println();
            t--;
        }
    }
}
