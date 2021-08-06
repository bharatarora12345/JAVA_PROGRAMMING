package codingNinjaCourse.Sorting;

import java.util.Scanner;

public class BubbleSort {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int ar[] = inputs();
            int newar[] = BubbleSort(ar);
            for (int i = 0; i < ar.length; i++) {
                System.out.print(newar[i] + " ");
            }
            t--;
        }
    }
}
