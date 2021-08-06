package TwoDArray;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
//        int arr[][] = new int[3][4];
//        System.out.println(arr[1][2]);
//        arr[2][0] = 15;
//        System.out.println(arr[2][0]);
//
//        int arr2[][] = {{1,2,3},{4,5,6}};
//
//

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int ar[][] = new int[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
