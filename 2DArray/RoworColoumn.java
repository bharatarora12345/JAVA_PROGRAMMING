package TwoDArray;

import java.util.Scanner;

public class RoworColoumn {
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

    public static void RoworColoumn(int ar[][]){
        int row = ar.length;
        int col = ar[0].length;
        int larRowSum = 0;
        int rowIndex = 0;
        int colIndex = 0;
        int larColSum = 0;
        int largest = 0;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum+=ar[i][j];
                if (sum > larRowSum){
                    larRowSum = sum;
                    rowIndex = i;
                }
            }
        }

        for (int i = 0; i <col ; i++) {
            int sum=0;
            for (int j = 0; j < row; j++) {
                sum+=ar[j][i];
                if (sum>larColSum){
                    larColSum = sum;
                    colIndex = i;
                }
            }
        }
        if (larColSum > larRowSum){
        System.out.print("column " + colIndex + " " + larColSum );
        System.out.println();}
        else{
            System.out.print("row " + rowIndex + " " + larRowSum );
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int ar[][] = inputs();
            RoworColoumn(ar);
        }
    }
}
