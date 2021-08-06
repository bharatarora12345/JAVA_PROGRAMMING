package Recursion;

import java.util.Scanner;
// Based on divide and conquer
// let us suppose a first element of array as a pivot
// we have to move pivot on its correct position
// throughout the array : this is called a pivot position


public class QuickSort {
    public static int Partition(int ar[] ,int l , int r){
        int pivot = ar[l];
        int i = l;
        int j = r;
        while (i < j) {
            while (ar[i] <= pivot) i++;
            while (ar[j] > pivot) j--;
            if (i < j) {
                swap(ar , i, j);
            }
        }
        swap(ar , j , l);
        return j;
    }

    static void swap(int arr[] , int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] QuickSort(int ar[] , int l , int r){
        if (l<r){
            int pivot = Partition(ar ,l,r);
            QuickSort(ar , l , pivot-1);
            QuickSort(ar , pivot+1, r);
        }
        return ar;
    }
    public static void printArray(int ar[] , int size){
        for (int i = 0; i < size; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        QuickSort(arr,0,n-1);
        System.out.println("Sorted Array :");
        printArray(arr,n);
    }
}
