package codingNinjaCourse.Sorting;
//cards is selected from a deck and
// all cards sorting which is in my hand.
import java.util.Scanner;

public class InsertionSort {
    public static int[] inputs() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    public static int[] InsertionSort(int ar[]) {
        for (int i = 1; i < ar.length; i++) {
            int j = i-1;
            int temp = ar[i];
            while (j>=0 && ar[j] > temp){
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = temp;
        }
        return ar;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int ar[] = inputs();
            int newar[] = InsertionSort(ar);
            for (int i = 0; i < ar.length; i++) {
                System.out.print(newar[i] + " ");
            }
            t--;
        }
    }
}
