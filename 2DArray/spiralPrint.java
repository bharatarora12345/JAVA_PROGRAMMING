//package TwoDArray;
//
//import java.util.Scanner;
//
//public class spiralPrint {
//    public static int[][] input() {
//        Scanner sc = new Scanner(System.in);
//        int rac[] = new int[2];
//        for (int i = 0; i < 2; i++) {
//            rac[i] = sc.nextInt();
//        }
//        int row = rac[0];
//        int col = rac[1];
//        int ar[][] = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                ar[i][j] = sc.nextInt();
//            }
//        }
//        return ar;
//    }
//
////    public static int[] spiralPrint(int ar[][]) {
////
////    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int ar[][] = input();
//            int newar[] = spiralPrint(ar);
//            for (int i = 0; i < newar.length; i++) {
//                System.out.print(newar[i] + " ");
//            }
//        }
//    }
//}
