package Recursion;

import java.util.Scanner;

public class GatherRainWater {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max <= ar[i]){
                max = ar[i];
            }
        }
        int secmax = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] != max){
                if (secmax <= ar[i]){
                    secmax = ar[i];
                }
            }
        }
        int indexmax = 0;
        int indexsecmax = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] == max){
                indexmax = i;
            }
            if (ar[i] == secmax){
                indexsecmax = i;
            }
        }
        int sumtrap = 0;
        if (indexmax < indexsecmax){
            for (int i = indexmax; i < indexsecmax ; i++) {
                if (ar[i] < max)
                    sumtrap += secmax - ar[i];
            }
        }
        else{
            for (int i = indexsecmax; i <indexmax; i++) {
                if (ar[i] < max)
                    sumtrap += secmax - ar[i];
            }
        }
        System.out.println(sumtrap);
    }
}
