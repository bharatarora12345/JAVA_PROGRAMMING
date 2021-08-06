package codingNinjaCourse;

import java.util.Scanner;

public class ArrayPrintSum {

    public static int[] inputs(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int sumPairs(int ar[]){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if ((ar[i]+ar[j]) == sum){
                    count++;
                }
            }
        }
        return count;
    }
    public static int triplets(int ar[]){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                for (int k = j+1; k < ar.length; k++) {
                    if ((ar[i] + ar[j] + ar[k]) == sum) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int ar[] = inputs();
//            int b = sumPairs(ar);
//            System.out.println(b);
            int c = triplets(ar);
            System.out.println(c);

        }
    }
}
