package Recursion;

import java.util.Scanner;

public class ChocolateCartonDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of chochlates");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Number of Childrens");
        int m = sc.nextInt();
        // Sort the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i+m-1 < n ; i++) {
            int diff = ar[i+m-1] - ar[i];
            if (diff < min_diff){
                min_diff = diff;
            }
        }
        System.out.println(min_diff);
    }
}

