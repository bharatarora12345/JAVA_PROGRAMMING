package Recursion;

import java.util.Scanner;

public class GeometricSum {
    public static double GeoSum(int k){
        if (k == 0){
            return 1;
        }

        double ans = 1 / (double)Math.pow(2,k) + GeoSum(k-1);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(GeoSum(k));

    }
}




//Implementation in flipflop