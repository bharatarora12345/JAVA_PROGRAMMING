package codingNinjaCourse;

import java.util.Scanner;

public class LinearSearch {
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int LinearSearch(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Value to be Searched");
        int v = sc.nextInt();
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (v == arr[i]){
                s = i;
                break;
            }else {
                s = -1;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of test cases");
        int t = sc.nextInt();
        while (t  >0){
            int[] arr = input();
            System.out.println(LinearSearch(arr));
            t--;
        }
    }
}
