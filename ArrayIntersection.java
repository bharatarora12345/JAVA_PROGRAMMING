package codingNinjaCourse;

import java.util.Scanner;

public class ArrayIntersection {

    public static int[] inputs(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] intersection(int ar1[] , int ar2[]){
        Scanner sc = new Scanner(System.in);
        int ar3[] = new int[10];
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i] == ar2[j]){
                    ar3[i] = ar1[i];
                    break;
                }
            }
        }
        return ar3;
    }

    public static void FinalArray(int ar3[]){
        for (int i = 0; i < ar3.length; i++) {
            if (ar3[i] != 0)
                System.out.print(ar3[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Test Cases You Want");
        int t = sc.nextInt();
        while (t > 0){
            int ar1[] = inputs();
            int ar2[] = inputs();
            int ar3[] = intersection(ar1,ar2);
            FinalArray(ar3);
            t--;
        }
    }
}
