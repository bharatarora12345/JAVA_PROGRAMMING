package Recursion;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static int binarySearch(int[] ar ,int l , int r , int x){
        if (r >= 1){
            int mid = 1 + (r-l)/2;

            if (ar[mid] == x){
                return mid;
            }

            if (ar[mid] > x){
                return binarySearch(ar , l , mid -1 , x);
            }

            return binarySearch(ar , mid+1 , r , x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int result = binarySearch(ar , 0 , n-1 , x);
        if (result == -1){
            System.out.println("Element not present");
        }else {
            System.out.println("At index " + result);
        }
    }
}
