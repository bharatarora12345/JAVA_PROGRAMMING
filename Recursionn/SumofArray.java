package Recursion;

import java.util.Scanner;

public class SumofArray {
    public static int summ(int ar[]){
        if (ar.length == 0){
            return 0;
        }
        int s = ar[0];
        if (ar.length == 1){
            return s;
        }
        int smallArr[] = new int[ar.length-1];
        for (int i = 1; i < ar.length; i++) {
            smallArr[i-1] = ar[i];
        }
        int sum = summ(smallArr);
        return s + sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(summ(ar));
    }
}
