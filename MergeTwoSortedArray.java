package codingNinjaCourse.Sorting;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static int[] inputs() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    public static int[] BubbleSort(int ar[]) {
        int count = ar.length - 1;
        int size = ar.length;
        int temp = 0;
        while (count > 0) {
            for (int i = 0; i < size - 1; i++) {
                if (ar[i] > ar[i + 1]) {
                    temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
            size--;
            count--;
        }
        return ar;
    }

    public static int[] merge(int ar1[], int ar2[]) {
        int len = ar1.length + ar2.length;
        int ar3[] = new int[len];
        for (int i = 0; i < ar1.length; i++) {
            ar3[i] = ar1[i];
        }
        int t = 0;
        for (int i = ar1.length; i < len; i++) {
            ar3[i] = ar2[t];
            t++;
        }
        return ar3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0){
            int ar1[] = inputs();
            int ar2[] = inputs();
            int ar3[] = merge(ar1 ,ar2);
            int ar4[] = BubbleSort(ar3);
            for (int i = 0; i < ar3.length; i++) {
                System.out.print(ar3[i] + " ");
            }
            t--;
        }
    }
}
