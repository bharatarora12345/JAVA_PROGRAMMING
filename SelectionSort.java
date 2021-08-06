package codingNinjaCourse.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int min=ar[i];
            for (int j = i+1; j < n; j++) {
                if (ar[i] <= ar[j]){
                    min = ar[i];
                }else{
                    min = ar[i];
                    ar[i] = ar[j];
                    ar[j] = min;
                }
            }
            System.out.print(min + " ");
        }
    }
}
