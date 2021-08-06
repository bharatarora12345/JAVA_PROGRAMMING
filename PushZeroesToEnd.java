package codingNinjaCourse;

import java.util.Scanner;

public class PushZeroesToEnd {
    public static int[] inputs() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }
    public static void pushZeroes(int ar[]){
        int k=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0){
                ar[k] = ar[i];
                System.out.print(ar[k] + " ");
                k++;
            }
        }
        for (int i = k; i < ar.length; i++) {
//            if (ar[i] == 0){
                ar[i] = 0;
                System.out.print(ar[i] + " ");
//            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int ar[] = inputs();
            pushZeroes(ar);
            t--;
        }
    }
}
