package Recursion;

import java.util.Scanner;

public class subsetSumtoK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int limit = (int)Math.pow(2 , ar.length);
        for (int i = 0; i < limit; i++) {
            //Convert i to binary and 0's or 1's
            String set = "";
            int s = 0;
            int temp = i;
            for (int j = ar.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;
                if (r == 0) {
                    set += " ";
                } else {
                    set = ar[j] + "\t" + set;
                    s += ar[j];
                }
            }
            if (s == k) {
                System.out.println(set);
            }
        }
    }
}
