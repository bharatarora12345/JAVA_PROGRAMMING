package Recursion;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int summ = 0;
        for (int i = 0; i < n ; i++) {
            summ += ar[i];
            if (maxSum < summ) {
                maxSum = summ;
            }if(summ < 0) {
                summ = 0;
            }
        }
        System.out.println(maxSum);
    }
}
