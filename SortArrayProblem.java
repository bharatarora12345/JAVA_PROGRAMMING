package codingNinjaCourse;

import java.util.Scanner;

public class SortArrayProblem {

    public static int[] inputs(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] sort(int ar[]){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                int temp = 0;
                if (ar[i] <= ar[j]){
                    ar[i] = ar[i];
                }
                else{
                if (ar[i] > ar[j])
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;

                }
            }
        }
        return ar;
    }
    public static void print(int ar[]){
        for (int i = 0;i < ar.length ; i++) {
            System.out.print(ar[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t  > 0){
            int ar[] = inputs();
            int newarr[] = sort(ar);
            print(ar);
            t--;
        }
    }
}
