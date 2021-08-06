package Recursion;

import java.util.Scanner;

public class FirstIndex {
    public static int FirstIndex(int ar[] , int start , int search){
        if (ar[start] == search){
            return start;
        }
        int ans = FirstIndex(ar , start +1 , search);
        return ans;
    }
    public static int LastIndex(int ar[] , int start , int search){
        if (ar[start] == search){
            return start;
        }
        int ans = LastIndex(ar , start -1 , search);
        return ans;
    }
    public static void AllIndex(int ar[] , int start ,int search) {
        if (start <= ar.length - 1) {
            if (ar[start] == search) {
                System.out.print(start + " ");
            }
            AllIndex(ar, start + 1, search);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        int start = 0;
        System.out.println(FirstIndex(ar,start,search));
        int Last = ar.length-1;
        System.out.println(LastIndex(ar,Last,search));
        AllIndex(ar,start,search);
    }
}
