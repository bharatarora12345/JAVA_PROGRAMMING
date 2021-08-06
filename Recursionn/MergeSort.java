package Recursion;

import java.util.Scanner;

public class MergeSort {
    static void mergeSort(int input[] , int l , int r) {
//        if (l >= r){
//            return;
//        }
        if (l < r) {
            int mid = (l + r) / 2;
            //Part1
            mergeSort(input, l, mid);
            //Part2
            mergeSort(input, mid + 1, r);
            merge(input, l, mid, r);
        }
    }

    public static void merge(int[] input , int l ,int mid , int r) {
        int ans[] = new int[l + r +1];
        int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid  && j <= r) {
            if(input[i] < input[j]) {
                ans[k] = input[i];
                i++;
                k++;
            } else {
                ans[k] = input[j];
                k++;
                j++;
            }
        }
        if ( i > mid){
            while (j <= r){
                ans[k] = input[j];
                k++;
                j++;
            }
        }else {
            while (i <= mid){
                ans[k] = input[i];
                i++;
                k++;
            }
        }

//        while (i <= mid) {
//            ans[k] = input[i];
//            i++;
//            k++;
//        }
//        while (j <= r) {
//            ans[k] = input[j];
//            k++;
//            j++;
//        }
        for (int index = l; index <= r; index++) {
            input[index] = ans[index];
        }
    }

    public static void main(String[] args) {
//        int arr[] = {5,2,8,9,1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Time complexity : O(nlogn)
