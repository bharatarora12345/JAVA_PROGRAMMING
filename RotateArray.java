package codingNinjaCourse;

import java.util.Scanner;

public class RotateArray {

    public static int[] inputs() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    public static void rotateArray(int ar[] , int d){
        for (int i = d; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        for (int i = 0; i < d ; i++) {
            System.out.print(ar[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            int ar[] = inputs();
            int d = sc.nextInt();
            rotateArray(ar,d);
        }
    }
}
